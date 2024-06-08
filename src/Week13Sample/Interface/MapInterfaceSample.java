/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.Interface;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MapInterfaceSample {
    public static void main(String args[]) {

    Map<Integer, String> map = new HashMap<Integer, String>();

    map.put(1, "Cricket");

    map.put(2, "Hockey");
    map.put(3, "Archery");

    for (Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator(); iterator.hasNext();) {

    Entry<Integer, String> m = iterator.next();

    System.out.println(m.getKey() + " " + m.getValue());

    }
    
        System.out.println(map.get(1));
    

    }
 

}
