/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.ConversionClass;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class WideningSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 100;
 
        // Automatic type conversion
        // Integer to long type
        long l = i;
 
        // Automatic type conversion
        // long to double type
        double f = l;
 
        // Print and display commands
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Double value " + f);
    }
    
}
