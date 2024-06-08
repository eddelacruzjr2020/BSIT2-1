/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.Classes;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SingleLLSample {
    Node head;

static class Node {

int data;

Node next;

Node(int d) {

data = d;

next = null;

}

}

public void display() {

    Node n = head;

    while (n != null) {

    System.out.print(n.data + " ");

    n = n.next;

    }

    }

    public static void main(String[] args) {

    SingleLLSample list = new SingleLLSample();

    list.head = new Node(1);

    Node second = new Node(2);

    Node third = new Node(3);

    Node fourth = new Node(4);

    list.head.next = second;

    second.next = third;

    third.next = fourth;

    list.display();

    }
    
}
