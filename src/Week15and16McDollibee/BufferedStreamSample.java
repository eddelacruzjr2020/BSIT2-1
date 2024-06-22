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
public class BufferedStreamSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] names = {"Ed", "DC", "Dela"};
        
        try{
            BufferedWriter write = new BufferedWriter(new FileWriter("output2.txt"));
            write.write("Writing to a file");
            write.write("\nHere are the names Tst ");
            for(String name:names){
                write.write("\n"+name);
            }
            
            write.close();
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("output2.txt"));
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            reader.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
            
            
    }
    
}
