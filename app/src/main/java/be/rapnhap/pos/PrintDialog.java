package be.rapnhap.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;

public class PrintDialog extends AppCompatActivity {

    // used to get folder on SD card to save the csv
    public File pathHandle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_dialog);

        // get name of SD card folder
        File[] externalFilesDirs = new File[1];
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            externalFilesDirs = this.getExternalFilesDirs("external");
        }
        pathHandle = externalFilesDirs[1];
        // (will be used in SaveRequest)

        // get data from PointOfSale (caller of this intent)
        Intent intent = getIntent();
        Boolean printIsNeeded = intent.getBooleanExtra("printIsNeeded",false);
        String sequence = intent.getStringExtra("sequence");
        String line = intent.getStringExtra("line");


        TextView textLine = findViewById(R.id.messageTextView);
        textLine.setText(line);
        textLine.setMovementMethod(new ScrollingMovementMethod());

        Button buttonPrint = findViewById(R.id.printButton);
        if (printIsNeeded) {
            buttonPrint.setText("Print nog eens 2");
        } else {
            buttonPrint.setText("Geen print mogelijk");
        }

        Button buttonCancel = findViewById(R.id.cancelButton);

        // print at panel load
        if (printIsNeeded) {
            // print to Bluetooth
            PrintBluetooth printBluetooth = new PrintBluetooth();
            printBluetooth.sendToPrinter(sequence, line, pathHandle);

            // print to WLAN
            //PrintSocket printSocket = new PrintSocket();
            //printSocket.sendToSocket();
        }

        // Enable reprint button if allowed
        if (printIsNeeded) {
            buttonPrint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // print to Bluetooth
                    PrintBluetooth printBluetooth = new PrintBluetooth();
                    printBluetooth.sendToPrinter(sequence, line, pathHandle);

                    // print to WLAN
                    //PrintSocket printSocket = new PrintSocket();
                    //printSocket.sendToSocket();
                }
            });
        }

        // Back button
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}