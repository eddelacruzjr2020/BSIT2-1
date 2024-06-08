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
public class SortedSetInterfaceSample {
    public static void main(String args[]) {

    SortedSet set = new TreeSet(); 

      set.add("Bob");

      set.add("Sean");

      set.add("Jennifer");

      Iterator i = set.iterator();

      while (i.hasNext()) {

      Object element = i.next();

      System.out.println(element.toString());
      
    }
      
    }
     
}
