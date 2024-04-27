/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week7to9;
import Week7to9Trial.*;
//import java.lang.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Exception {

        public static void main(String [] args) throws NumberFormatException, ArrayIndexOutOfBoundsException{
        try{
            String x="abc";  
            int i=Integer.parseInt(x);//NumberFormatException  
         }catch(NumberFormatException e) {System.out.println(e);}
            
    }
}
         
