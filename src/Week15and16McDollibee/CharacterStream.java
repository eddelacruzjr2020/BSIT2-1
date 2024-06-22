/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week15and16McDollibee;
import java.io.*;
/**
 *
 * @author Edmundo Dela Cruz
 */
public class CharacterStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader readStream = null;
        FileWriter writeStream = null;
        
        try{
            
            readStream = new FileReader("C:\\Users\\Edmundo Dela Cruz\\Desktop\\School Related\\SY2324 2nd Semester\\Sat 730AM-1230PM OOP BSIT 2-1\\last schedule.txt");
            writeStream = new FileWriter("C:\\Users\\Edmundo Dela Cruz\\output1.txt");
            
            int c;
            while((c = readStream.read()) != -1){
                writeStream.write(c);
            }
            
        }finally{
            if(readStream != null){
                readStream.close();
            }
            if(writeStream != null){
                writeStream.close();
            }
        }
    }
}
