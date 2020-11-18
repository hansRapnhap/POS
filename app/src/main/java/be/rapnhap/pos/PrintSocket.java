package be.rapnhap.pos;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.File;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class PrintSocket {

    public PrintSocket() {
    }

    void sendToSocket() {

        try
        {
            Socket sock = new Socket("192.168.2.176", 9100);
            PrintWriter oStream = new PrintWriter(sock.getOutputStream());
            oStream.println("HI,test from Android Device");
            oStream.println("\n\n\n");
            oStream.close();
            sock.close();
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
