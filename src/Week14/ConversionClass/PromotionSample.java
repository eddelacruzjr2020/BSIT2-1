/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.ConversionClass;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PromotionSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Declaring and initializing primitive types
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        
        //System.out.println(Character.getNumericValue('b'));
 
        // The Expression
        double result = (f * b) + (i / c) - (d * s);
 
        // Printing the result obtained after
        // all the promotions are done
        System.out.println("result = " + result);
    
    }
    
}
