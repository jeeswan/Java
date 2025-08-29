/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_4;

import java.net.*;
import java.util.Scanner;

public class ClientUDP {
    public static void main(String[] args) {
        try {
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost"); // Server IP
            byte[] sendData;
            byte[] receiveData = new byte[1024];

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter message to send to server: ");
            String message = sc.nextLine();

            sendData = message.getBytes();

            // Send packet to server
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
            clientSocket.send(sendPacket);

            // Receive response from server
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + response);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
