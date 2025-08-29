/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_1;

/**
 *
 * @author wildflower
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q39Client {
    public static void main(String[] args) {
        String host = "localhost"; // change to server IP if running remotely
        int port = 5000;

        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server.");

            // Input and Output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            // Start thread to read messages from server
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Server: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Server disconnected.");
                }
            }).start();

            // Main thread sends messages to server
            while (true) {
                String msg = sc.nextLine();
                out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}