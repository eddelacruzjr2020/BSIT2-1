/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.ConversionClass;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class NarrowingSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        // Double datatype
        double d = 100.04;
 
        // Explicit type casting by forcefully getting
        // data from long datatype to integer type
        long l = (long)d;
 
        // Explicit type casting
        int i = (int)l;
 
        // Print statements
        System.out.println("Double value " + d);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);
 
        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i);
    }
    
}
