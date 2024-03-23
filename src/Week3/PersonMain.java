/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week3;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class PersonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "123 Main St");
        Person person2 = new Person("John", 30, "123 Main St");

        System.out.println(person1.getName()); // John
        System.out.println(person2.getAge()); // 25

        person1.walk(); // John is walking.
        person2.talk(); // Jane is talking.

        System.out.println(person1 == person2); // false

    }
    
}
