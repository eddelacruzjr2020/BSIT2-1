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
public class HashMapSample {
     
    public static void main(String[] args) {

        HashMap<String, String> Make = new HashMap<String, String>();

        Make.put("Honda", "CBR");

        Make.put("Kawasaki", "Ninja");

        Make.put("Ducati", "Panigale");

        Make.put("Yamaha", "R1");

        System.out.println(Make);
        System.out.println(Make.get("Honda"));

    }
    
}
