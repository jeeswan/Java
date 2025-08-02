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

public class Q14eRandomAccessFile {
    public static void main(String[] args) throws IOException{
        RandomAccessFile file = new RandomAccessFile("random.txt", "rw");
        file.writeUTF("Hello World!");
        file.seek(6);
        file.writeUTF("Java Class");
        file.seek(0);
        System.out.println(file.readUTF());
        file.close();
    }
}
