/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.Interface;

import java.util.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SortedMapInterfaceSample {
    public static void main(String args[]) {

      TreeMap<String, Double> t = new TreeMap<String, Double>();

      t.put("John", new Double(76.5));

      t.put("Molley", new Double(87.3));

      t.put("Aron", new Double(78.2));

      t.put("Daisy", new Double(73.4));

      Set<?> set = t.entrySet();

      Iterator<?> i = set.iterator();

      while(i.hasNext()) {

         @SuppressWarnings("rawtypes")

            Map.Entry me = (Map.Entry)i.next();

            System.out.print(me.getKey() + ": ");

            System.out.println(me.getValue());

            }

            System.out.println();

            double percentage = ((Double)t.get("Molley")).doubleValue();

            t.put("Molley", new Double(percentage));

            System.out.println("Aron's new balance: " + t.get("Aron"));

   }
     
}
