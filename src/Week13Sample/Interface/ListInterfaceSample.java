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
public class ListInterfaceSample {
    
    public static void main(String args[]) {

    List<String> list = new ArrayList<String>();

    list.add("David");

    list.add("Jhon");

    list.add("Stacy");
    
    list.remove("Jhon");


    //list.add("Stacy");

    for (String Students : list)

    System.out.println(Students);

    }
    
}
