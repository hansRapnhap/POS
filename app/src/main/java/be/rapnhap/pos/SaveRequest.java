package be.rapnhap.pos;

import android.content.Context;
import android.view.View;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SaveRequest {

    //save the context received via constructor in a local variable
    public SaveRequest(){
    }

    public static void saveData(String data, File pathHandle) {
        // Write data into file
        String fileDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        String fileName = fileDate + "_POS.txt";
        Boolean fileExists = false;
        //String data = null;

        // Get external file directory FOR THIS APP ...
        //-----------------------------------------------------------
        try {
            // /storage/6463-3031/Android/data/be.rapnhap.myfirstapp/files/external/ SUCCEEDS !

            // OLD TABLET - hard coded
            // -----------------------
            // File pathHandle = new File("/storage/6463-3031/Android/data/be.rapnhap.pos/files/external/");
            // File fileHandle = new File(pathHandle, fileName);

            // Try to use getExternalFilesDirs - Context cannot be used here ...
            // -----------------------------------------------------------------
            /*
            File[] pathHandle = new File[1];
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.KITKAT) {
            pathHandle = context.getExternalFilesDirs("external");
            }
            File fileHandle = new File(pathHandle[1], fileName);
            */
            // NEW TABLET - hard coded
            // -----------------------
            //                                    /storage/3866-6163/Android/data/be.rapnhap.pos/files/external/20210410 my-file-name4.txt
            //File pathHandle = new File("/storage/3866-6163/Android/data/be.rapnhap.pos/files/external/");
            //File fileHandle = new File(pathHandle, fileName);

            // get SD card folder from context in Main (PointOfSale.java - pathHandle)
            // -----------------------------------------------------------------------
            File fileHandle = new File(pathHandle, fileName);
            //  Value in Virtual device: /storage/1917-1906/Android/data/be.rapnhap.pos/files/external/20210411_POS.txt

            fileExists = fileHandle.exists();

            FileWriter writer = new FileWriter(fileHandle, true);

            String dataDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());

            // write header
            if (!fileExists) {
                String dataToPrint = dataDate + "," +
                "A bieslook en peterselie" + "," +
                "A rozemarijn " + "," +
                "A gorgonzola" + "," +
                "A olijven" + "," +
                "A gerookte ham" + "," +
                "A chorizzo" + "," +
                "A kippengehakt" + "," +
                "A gerookte zalm" + "," +
                "B champignons" + "," +
                "B courgette" + "," +
                "B gehakt" + "," +
                "B gerookte ham" + "," +
                "B appel" + "," +
                "B chocolade" + "," +
                "B Kokos" + "," +
                "B choc orang" + "," +
                "Vanille" + "," +
                "Magnum" + "," +
                "Cornet d'amour" + "," +
                "Maxi vanille" + "," +
                "Satelite" + "," +
                //SUBIMBA
                "Potje Vanille" + "," +
                "Potje Chocol." + "," +
                "Potje Aardbei" + "," +
                "Coca-Cola" + "," +
                "Cola zero" + "," +
                "Ice - Tea" + "," +
                "Fanta" + "," +
                "Appelsap" + "," +
                "Minute Maid" + "," +
                "Cecemel" + "," +
                "Plat water" + "," +
                "Spuitwater" + "," +
                "Expresso" + "," +
                "Expresso melk" + "," +
                "Lungo" + "," +
                "Lungo melk" + "," +
                "Deca" + "," +
                "Deca melk" + "," +
                "Yellow label" + "," +
                "Green tea" + "," +
                "Rozenbottel" + "," +
                "Jupiler" + "," +
                "Wijn - Wit" + "," +
                "Wijn - Rood" + "," +
                "Mojito" + "," +
                "Totaal (*100)" + "," +
                "VolgNr  \r\n";
                writer.append(dataToPrint);
            }

            // write data
            dataDate = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
            String dataToPrint = dataDate + "," + data + "\r\n";
            writer.append(dataToPrint);

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
