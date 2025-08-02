/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NetworkProgramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 *
 * @author wildflower
 */
public class SumServer {
    public static void main(String[] args) throws Exception {
        // Create a UDP socket bound to port 9876
        DatagramSocket socket = new DatagramSocket(9876);
        
        // Buffers for receiving and sending data
        byte[] receiveData = new byte[1024];
        byte[] sendData;

        System.out.println("Server is running...");

        // Infinite loop to continuously listen for client requests
        while (true) {
            // Create packet to receive data
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            
            // Wait for incoming packet (blocking call)
            socket.receive(receivePacket);

            // Convert received byte data to string (numbers in format "num1,num2")
            String received = new String(receivePacket.getData(), 0, receivePacket.getLength());

            // Split the numbers using comma as delimiter
            String[] numbers = received.split(",");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);

            // Calculate sum
            int sum = num1 + num2;
            System.out.println("Received: " + num1 + " and " + num2 + ", Sum: " + sum);

            // Get client's IP address and port number from the received packet
            InetAddress clientAddress = receivePacket.getAddress();
            int clientPort = receivePacket.getPort();

            // Prepare the result string to send back to client
            String result = "Sum = " + sum;
            sendData = result.getBytes(); // Convert result to byte array

            // Create packet with result to send to client
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
            socket.send(sendPacket); // Send response to client
        }
    }
}
