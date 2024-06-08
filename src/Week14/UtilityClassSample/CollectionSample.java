/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week14.UtilityClassSample;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CollectionSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(11);
        al.add(32);
        al.add(28);
        al.add(10);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
        
        String strNum1 = "10";
        String strNum2 = "20";
        
        int intNum1 = Integer.parseInt(strNum1);
        int intNum2 = Integer.parseInt(strNum2); 
        
        System.out.println(intNum1 + intNum2);
        
    
  

    }
    
}
