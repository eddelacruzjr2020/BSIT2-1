/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.Classes;

import java.util.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class HashSetClassSample {
    public static void main(String args[]) {

    HashSet<String> hset = new HashSet<String>();

    hset.add("Suzuki");

    hset.add("Kawasaki");

    hset.add("Honda");

    hset.add("Ducati");

    hset.add("Yamaha");

    hset.add("Yamaha");

    hset.add("Suzuki");

    hset.add(null);

    hset.add(null);

    // Displaying HashSet elements

    System.out.println(hset);

    }
    
}
