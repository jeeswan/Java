/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3_4;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class URLDemo {
    public static void main(String[] args) {
        try {
            System.out.println("=== (a) Different ways of creating URL objects and parsing ===");
            
            // Way 1: Using full URL as string
            URL url1 = new URL("https://www.example.com/index.html?name=jeeswan");
            System.out.println("URL 1: " + url1);
            System.out.println("Protocol: " + url1.getProtocol());
            System.out.println("Host: " + url1.getHost());
            System.out.println("Port: " + url1.getPort());
            System.out.println("File: " + url1.getFile());
            System.out.println("Query: " + url1.getQuery());
            System.out.println("Path: " + url1.getPath());

            // Way 2: Using base URL and relative path
            URL base = new URL("https://www.example.com/");
            URL url2 = new URL(base, "folder/page.html");
            System.out.println("URL 2: " + url2);

            // Way 3: Using protocol, host, port, file
            URL url3 = new URL("https", "www.example.com", 443, "/index.html");
            System.out.println("URL 3: " + url3);

            System.out.println("\n=== (b) Reading Directly from URL ===");
            URL urlRead = new URL("https://www.example.com/");
            BufferedReader br = new BufferedReader(new InputStreamReader(urlRead.openStream()));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < 10) { // read only first 10 lines
                System.out.println(line);
                count++;
            }
            br.close();

            System.out.println("\n=== (c) Reading from a URLConnection ===");
            URL urlConn = new URL("https://www.example.com/");
            URLConnection connection = urlConn.openConnection();
            BufferedReader br2 = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            count = 0;
            while ((line = br2.readLine()) != null && count < 10) { // first 10 lines
                System.out.println(line);
                count++;
            }
            br2.close();

            System.out.println("\n=== (d) InetAddress Class ===");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter host name or IP address: ");
            String host = sc.nextLine();
            InetAddress address = InetAddress.getByName(host);
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Host Address: " + address.getHostAddress());

            // Multiple IP addresses (if available)
            InetAddress[] allAddresses = InetAddress.getAllByName(host);
            System.out.println("All IP addresses for " + host + ":");
            for (InetAddress addr : allAddresses) {
                System.out.println(addr);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
