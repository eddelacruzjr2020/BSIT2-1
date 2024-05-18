/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11.Person;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Person implements Comparable<Person> {
    
    private String name;
    private int grade;
    
    Person(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    
    public String getName(){
        return name;
    }
    
    public int getGrade(){
        return grade;
    }
   
    @Override
    public int compareTo(Person o) {
        return this.grade - o.grade;
    }
    
}
