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
public class QueueInterfaceSample {
    public static void main(String[] args) {

    Queue<String> queue = new LinkedList<>();

    queue.add("Apple");

    queue.add("Mango");

    queue.add("Grapes");

    queue.add("Banana");

    System.out.println(queue);

    queue.remove("Grapes");

    System.out.println(queue);

    System.out.println("Queue total Size: " + queue.size());

    System.out.println("Queue includes fruit 'Apple'? : " + queue.contains("Apple"));

    queue.clear();

    }
    
}
