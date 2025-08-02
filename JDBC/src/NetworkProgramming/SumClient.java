/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
/**
 *
 * @author wildflower
 */
public class SumClient {
    public static void main(String[] args) throws Exception {
        // Create UDP socket for communication
        DatagramSocket socket = new DatagramSocket();

        // Get server address (localhost for testing)
        InetAddress serverAddress = InetAddress.getByName("localhost");

        // Input numbers from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Create message to send in format "num1,num2"
        String message = num1 + "," + num2;
        byte[] sendData = message.getBytes(); // Convert string to byte array

        // Create packet to send to server (port 9876)
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 9876);
        socket.send(sendPacket); // Send the packet

        // Prepare to receive response from server
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

        // Wait for response from server (blocking)
        socket.receive(receivePacket);

        // Convert received byte data to string
        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());

        // Display server response (sum)
        System.out.println("Server Response: " + response);

        // Close the socket after communication ends
        socket.close();
    }
}
