package be.rapnhap.pos;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SaveRequest {

    public SaveRequest() {
    }

    public static void saveData(String data) {
        // Write data into file
        String fileDate = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        String fileName = fileDate + "_POS.txt";
        Boolean fileExists = false;
        //String data = null;

        // Get external file directory FOR THIS APP ...
        //-----------------------------------------------------------
        try {
            // /storage/6463-3031/Android/data/be.rapnhap.myfirstapp/files/external/ SUCCEEDS !
            File pathHandle = new File("/storage/6463-3031/Android/data/be.rapnhap.pos/files/external/");

            File fileHandle = new File(pathHandle, fileName);

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
                "Big Chocolate" + "," +
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
                //"Wijn - Glue" + "," +
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
