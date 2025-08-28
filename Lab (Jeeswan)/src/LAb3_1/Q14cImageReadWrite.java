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

public class Q14cImageReadWrite {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("Penelope.jpeg");
        FileOutputStream fos = new FileOutputStream("Penelep2.jpeg");
        
        int i;
        
        while((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}
