/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ConstructorDemo {
    String name;
    
    ConstructorDemo(){
        System.out.println("Constructors created");
    }
    
    public void setStudentName(String name){
        this.name = name;   
    }
        
    public String getStudentName(){
        return name;
    }
    
}
