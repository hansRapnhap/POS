package be.rapnhap.pos;

// needed for BT
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class PrintBluetooth extends AppCompatActivity {
    // BT variables
    // will show the statuses like bluetooth open, close or data sent
    String TAG_LOG_BT = "LOG_BLUETOOOTH";
    String TAG_LOG_EX = "LOG_EXCEPTION";
    // android built in classes for bluetooth operations
    BluetoothAdapter mBluetoothAdapter;
    BluetoothSocket mmSocket;
    BluetoothDevice mmDevice;
    // needed for communication to bluetooth device / network
    OutputStream mmOutputStream;
    InputStream mmInputStream;
    Thread workerThread;
    byte[] readBuffer;
    int readBufferPosition;
    volatile boolean stopWorker;

    public PrintBluetooth() {
    }

    void sendToPrinter(String sequence, String line) {
        // open bluetooth connection
        try
        {
            findBT();
            openBT();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            Log.d(TAG_LOG_EX,"findBT / openBT: " + e);

        }

        // send data to be printed
        try {
            sendData(sequence, line);
        } catch (IOException ex) {
            ex.printStackTrace();
            Log.d(TAG_LOG_EX,"sendData: " + ex);
        }

        // close bluetooth connection
        try {
            TimeUnit.SECONDS.sleep(1);
            closeBT();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
            Log.d(TAG_LOG_EX,"closeBT: " + ex);
        }
    }

    // this will find a bluetooth printer device
    void findBT() {

        try {
            mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

            if(mBluetoothAdapter == null) {
                Log.d(TAG_LOG_BT,"No bluetooth adapter available");
            }

            if(!mBluetoothAdapter.isEnabled()) {
                Intent enableBluetooth = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                startActivityForResult(enableBluetooth, 0);
            }

            Set<BluetoothDevice> pairedDevices = mBluetoothAdapter.getBondedDevices();

            // found : BC:A5:8B:9E:E1:38 - 04:FE:A1:87:85:AE
            if(pairedDevices.size() > 0) {
                for (BluetoothDevice device : pairedDevices) {

                    // RPP300 is the name of the bluetooth printer device
                    // we got this name from the list of paired devices
                    if (device.getName().equals("TM-P80_001306")) {
                        mmDevice = device;
                        break;
                    }
                }
            }

            // Log
            Log.d(TAG_LOG_BT,"Bluetooth device found.");

        }catch(Exception e){
            e.printStackTrace();
            Log.d(TAG_LOG_EX,"Search BT device: " + e);
        }
    }

    // tries to open a connection to the bluetooth printer device
    void openBT() throws IOException {

        // loop at exception (added to avoid error at open exception)
        boolean retry = true;
        while (retry) {
            try {
                Log.d(TAG_LOG_BT, "Bluetooth Open try");

                // Standard SerialPortService ID
                UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
                Log.d(TAG_LOG_BT, "Bluetooth Open - createRfcommSocketToServiceRecord");
                mmSocket = mmDevice.createRfcommSocketToServiceRecord(uuid);
                Log.d(TAG_LOG_BT, "Bluetooth Open - connect");
                mmSocket.connect();
                Log.d(TAG_LOG_BT, "Bluetooth Open - getOutputStream");
                mmOutputStream = mmSocket.getOutputStream();
                Log.d(TAG_LOG_BT, "Bluetooth Open - getInputStream");
                mmInputStream = mmSocket.getInputStream();

                // TODO - nothing seems to come on this socket from the BT, can we decide not to listen ?
                beginListenForData();

                Log.d(TAG_LOG_BT, "Bluetooth Opened");
                retry = false;

            } catch (Exception e) {
                e.printStackTrace();
                Log.d(TAG_LOG_EX, "openBT processing: " + e);
                // TODO : intermittent exception : java.io.IOException: read failed, socket might closed or timeout, read ret: -1
                // TODO: (we have put a(n endless) while retry to check in the logcat if this can solve this)
            }
        }
    }
    /*
     * after opening a connection to bluetooth printer device,
     * we have to listen and check if a data were sent to be printed.
     */
    void beginListenForData() {
        /*
        We inactivate the handler part since we only give feedback in log, not to the user
        try {
            final Handler handler = new Handler();
        */
            // this is the ASCII code for a newline character
            final byte delimiter = 10;

            stopWorker = false;
            readBufferPosition = 0;
            readBuffer = new byte[1024];

            workerThread = new Thread(new Runnable() {
                public void run() {

                    while (!Thread.currentThread().isInterrupted() && !stopWorker) {

                        try {

                            int bytesAvailable = mmInputStream.available();
                            //Log.d(TAG_LOG_BT,"Listener processing - bytesAvailable" + String.valueOf(bytesAvailable));

                            if (bytesAvailable > 0) {

                                byte[] packetBytes = new byte[bytesAvailable];
                                mmInputStream.read(packetBytes);

                                for (int i = 0; i < bytesAvailable; i++) {

                                    byte b = packetBytes[i];
                                    if (b == delimiter) {

                                        byte[] encodedBytes = new byte[readBufferPosition];
                                        System.arraycopy(
                                                readBuffer, 0,
                                                encodedBytes, 0,
                                                encodedBytes.length
                                        );

                                        // specify US-ASCII encoding
                                        final String data = new String(encodedBytes, "US-ASCII");
                                        readBufferPosition = 0;

                                        Log.d(TAG_LOG_BT,"Received from bluetooth adapter: <" + data + ">");

                                        // tell the user data were sent to bluetooth printer device
                                        /*
                                        handler.post(new Runnable() {
                                            public void run() {
                                                Log.d(TAG_LOG_BT,"Received from bluetooth adapter: <" + data + ">");
                                            }
                                        });

                                         */

                                    } else {
                                        readBuffer[readBufferPosition++] = b;
                                    }
                                }
                            }

                        } catch (IOException ex) {
                            stopWorker = true;
                            Log.d(TAG_LOG_EX,"Listener processing - thread interrupted: " + ex);
                        }

                    }
                }
            });

            workerThread.start();

        /*
        } catch (Exception e) {

            e.printStackTrace();
            Log.d(TAG_LOG_EX,"Listener processing: " + e);
        }
         */
    }

    // this will send text data to be printed by the bluetooth printer
    void sendData(String sequence, String line) throws IOException {
        try {

            // tell the user data were sent
            Log.d(TAG_LOG_BT,"Data to BT - START");
            // initialize printer
            //mmOutputStream.write(27); // ESC
            //mmOutputStream.write('@');
            mmOutputStream.write(PrinterCommands.INIT);
            //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.INIT + ">");

            // TODO print 2 times
            // -------------------------------------------------------------------------------
            for(int i = 0; i < 1; i++) {

                // print Title
                mmOutputStream.write(PrinterCommands.FONT_DOUBLE);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FONT_DOUBLE + ">");
                mmOutputStream.write(PrinterCommands.FONT_BOLD_ON);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FONT_BOLD_ON + ">");
                String msg = "        RAP 'N HAP\n";
                mmOutputStream.write(msg.getBytes());
                //Log.d(TAG_LOG_BT,"Data to BT: <" + msg + ">");
                mmOutputStream.write(PrinterCommands.FONT_BOLD_OFF);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FONT_BOLD_OFF + ">");

                // print website and date / time
                mmOutputStream.write(PrinterCommands.FONT_SINGLE);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FONT_SINGLE + ">");
                msg = "                www.rapnhap.be  \n";
                mmOutputStream.write(msg.getBytes());
                //Log.d(TAG_LOG_BT,"Data to BT: <" + msg + ">");
                String dataDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime()) +
                        "                 " + sequence +
                        "\n\n";
                mmOutputStream.write(dataDate.getBytes());
                //Log.d(TAG_LOG_BT,"Data to BT: <" + dataDate + ">");

                // print the lines and total (all are parsed in the String 'line')
                mmOutputStream.write(PrinterCommands.FONT_DOUBLE);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FONT_DOUBLE + ">");
                mmOutputStream.write(line.getBytes());
                //Log.d(TAG_LOG_BT,"Data to BT: <" + line + ">");

                 // feed 3 lines
                mmOutputStream.write(PrinterCommands.FEED_3_LINES);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.FEED_3_LINES + ">");

                // cut paper
                mmOutputStream.write(PrinterCommands.PAPER_CUT);
                //Log.d(TAG_LOG_BT,"Data to BT: <" + PrinterCommands.PAPER_CUT + ">");
            }

            // tell the user data were sent
            Log.d(TAG_LOG_BT,"Data to BT - END");

        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG_LOG_EX,"sendData processing: " + e);
        }
    }

    // close the connection to bluetooth printer.
    void closeBT() throws IOException {
        try {
            stopWorker = true;
            mmOutputStream.close();
            mmInputStream.close();
            mmSocket.close();
            Log.d(TAG_LOG_BT,"Bluetooth Closed");
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG_LOG_EX,"closeBT processing: " + e);
        }
    }


}
