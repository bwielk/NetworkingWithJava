package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serviceSocket = new ServerSocket(5000)){
            while(true){
                new Echoer(serviceSocket.accept()).start();
            }
        }catch(IOException e){
            System.out.println("Server error");
            e.printStackTrace();
        }
    }
}
