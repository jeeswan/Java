/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAb3_1;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author wildflower
 */
import java.io.*;

public class Q14gFileWriter {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("output.txt");
        fw.write("This is written using FileWriter.\n-Jeeswan Bajracharya");
        fw.close();
    }
}