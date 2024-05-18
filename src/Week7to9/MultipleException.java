/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import Week7to9Trial.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultipleException {
    
     public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException, NumberFormatException {
        try {
            int a=50/0;//ArithmeticException  
            
            String s=null;  
            System.out.println(s.length());//NullPointerException  
            
            String x="abc";  
            int i=Integer.parseInt(x);//NumberFormatException  
            
            int b[]=new int[5];  
            b[10]=50; //ArrayIndexOutOfBoundsException  
            
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format exception: " + e.getMessage());
        }
    }
    
}
