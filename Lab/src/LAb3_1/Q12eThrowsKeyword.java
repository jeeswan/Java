/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

/**
 *
 * @author wildflower
 */
import java.io.*;

public class Q12eThrowsKeyword {
    static void checkFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.read();
    }

    public static void main(String[] args) {
        try {
            checkFile();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e);
        }
    }
}