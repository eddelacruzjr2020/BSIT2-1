/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.UtilityClassSample;

import java.util.Random;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class RandomSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rdn = new Random();
        int rdn1 = rdn.nextInt(100);
        int rdn2 = rdn.nextInt(100);
        int rdn3 = rdn.nextInt(100);
        System.out.println("Random numbers:");
        System.out.println(rdn1);
        System.out.println(rdn2);
        System.out.println(rdn3);
        
       
    }
    
}
