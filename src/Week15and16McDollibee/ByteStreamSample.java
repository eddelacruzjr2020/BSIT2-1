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
public class ByteStreamSample {
   /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("sources.txt");
            out = new FileOutputStream("target.txt");
            int c;
            
            while ((c=in.read()) !=-1){
                out.write(c);
            }
            
        }finally{
            if(in !=null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
