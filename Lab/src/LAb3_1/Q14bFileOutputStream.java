/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author wildflower
 */
import java.io.*;
public class Q14bFileOutputStream {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("onput.txt"); 
        String data = "This is written using FileOutputStream.\n -Jeeswan Bajracharya";
        fos.write(data.getBytes());
        fos.close();
    }
}