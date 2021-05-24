package be.rapnhap.pos;


import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogPos {

    public LogPos() {
    }

    public static void logToFile(File pathHandle, String data) {
        // Write data into file
        String fileDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        String fileName = fileDate + "_POS.log";
        Boolean fileExists = false;
        //String data = null;

        // Get external file directory FOR THIS APP ...
        //-----------------------------------------------------------
        try {
            // HARD CODED IF RUN ON TABLET (Hans)
            // /storage/6463-3031/Android/data/be.rapnhap.myfirstapp/files/external/ SUCCEEDS !
            //  Value in Virtual device: /storage/1917-1906/Android/data/be.rapnhap.pos/files/external/20210411_POS.txt
            //File pathHandle = new File("/storage/6463-3031/Android/data/be.rapnhap.pos/files/external/");
            //File pathHandle = new File("/storage/1917-1906/Android/data/be.rapnhap.pos/files/external/");

            File fileHandle = new File(pathHandle, fileName);

            FileWriter writer = new FileWriter(fileHandle, true);

            String dataDate = new SimpleDateFormat("yyyyMMdd_HHmmssSSS").format(Calendar.getInstance().getTime());

            String dataToPrint = dataDate + " - " + data + " \r\n";
            writer.append(dataToPrint);

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
