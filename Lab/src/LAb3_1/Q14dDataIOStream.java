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

public class Q14dDataIOStream {
    public static void main(String[] args) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        dos.writeInt(100);
        dos.writeDouble(55.5);
        dos.writeUTF("Jeeswan Bajracharya");
        dos.close();
        
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
        dis.close();
    }
}
