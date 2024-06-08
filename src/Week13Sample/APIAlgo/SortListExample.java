/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.APIAlgo;


/**
 *
 * @author Edmundo Dela Cruz
 */
import java.util.*;

public class SortListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        // Sorting using Collections.sort()
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Sorting using List.sort()
        list.sort(null); // null means natural order
        System.out.println("Sorted list using List.sort(): " + list);
    }

    
}
