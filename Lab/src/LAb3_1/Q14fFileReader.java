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

public class Q14fFileReader {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("input.txt");
        int i;
        while((i = fr.read())!= -1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
