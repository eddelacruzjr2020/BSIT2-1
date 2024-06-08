/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.UtilityClassSample;

import java.util.Arrays;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ArraysSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    int[] ar = {33,44,11,22};   
    
    print(ar);
    System.out.println("\n----------");
    Arrays.sort(ar);
    

    print(ar);        
   }
   static void print(int[] ar){
    for(int x: ar){
     System.out.print(x+" ");
    }
   }
    
}
