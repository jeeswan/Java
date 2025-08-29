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

public class Q39Server {
    public static void main(String[] args) {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            // Input and Output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);

            // Start thread to read messages from client
            new Thread(() -> {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        System.out.println("Client: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            }).start();

            // Main thread sends messages to client
            while (true) {
                String msg = sc.nextLine();
                out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}