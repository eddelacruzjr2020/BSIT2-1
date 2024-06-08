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
public class SetInterfaceSample {
    public static void main(String args[]) {

    int count[] = { 21, 23, 43, 53, 22, 65 };

    Set<Integer> set = new HashSet<Integer>();

    try {

        for (int i = 0; i <= 5; i++) {

        set.add(count[i]);

        }
    
        System.out.println(set);

        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

        System.out.println("The sorted list is:");
        System.out.println(sortedSet);
        System.out.println("First element of the set is: " + (Integer) sortedSet.first());
        System.out.println("last element of the set is: " + (Integer) sortedSet.last());

        } catch (Exception e) {

        }

    }
    
}
