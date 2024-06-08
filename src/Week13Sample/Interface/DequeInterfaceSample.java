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
public class DequeInterfaceSample {
    public static void main(String[] args) {

    Deque<Integer> num = new ArrayDeque<>();

    num.offer(10);

    num.offerLast(21);

    num.offerFirst(52);

    System.out.println("Deque elements: " + num);

    int first = num.peekFirst();

    System.out.println("First Element is: " + first);

    int lastElement = num.peekLast();

    System.out.println("Last Element: " + lastElement);

    int removed = num.pollFirst();

    System.out.println("Removed First Element: " + removed);

    System.out.println("Updated Deque is: " + num);

    }
    
}
