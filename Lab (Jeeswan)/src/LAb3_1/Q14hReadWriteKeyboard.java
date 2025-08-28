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

public class Q14hReadWriteKeyboard {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("Keyboard.txt");
        System.out.println("Enter text (type 'stop' to end): ");
        
        String line;
        while(!(line = br.readLine()).equalsIgnoreCase("stop")){
            fw.write(line + "\n");
        }
        fw.close();
        br.close();
    }
}
