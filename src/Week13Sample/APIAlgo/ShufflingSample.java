/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.APIAlgo;

import java.util.*;


/**
 *
 * @author Edmundo Dela Cruz
 */
public class ShufflingSample {
     
       public static void main(String[] args) {

        Integer[] intA = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        List<Integer> intL = Arrays.asList(intA);

        Collections.shuffle(intL);

        intL.toArray(intA);

        System.out.println(Arrays.toString(intA));

    }
    
}
