/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13Sample.Classes;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class CircularLLSample {
     public class Node{  

        int data;  

        Node next;  

        public Node(int data) {  

            this.data = data;  

        }  

    }  

  

    public Node head = null;  

    public Node tail = null;  

  

    public void add(int data){  

        Node newNode = new Node(data);  

        if(head == null) {  

            head = newNode;  

            tail = newNode;  

            newNode.next = head;  

        }  

        else {  

            tail.next = newNode;  

            tail = newNode;  

            tail.next = head;  

        }  

    }  

  

    public void display() {  

        Node current = head;  

        if(head == null) {  

            System.out.println("List is empty");  

        }  

        else {  

            System.out.println("Nodes of the circular linked list: ");  

             do{  

                System.out.print(" "+ current.data);  

                current = current.next;  

            }while(current != head);  

            System.out.println();  

        }  

    }  

  

    public static void main(String[] args) {  

        CircularLLSample c = new CircularLLSample();  

        c.add(1);  

        c.add(2);  

        c.add(3);  

        c.add(4);  

        c.add(5);  

        c.add(6);  

        c.add(7);  

        c.add(8);

        c.display();  

    }
    
}
