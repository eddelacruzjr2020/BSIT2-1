/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9.Interface;

import Week7to9Trial.Interface.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
interface Polygon {
    
    public void display();
            
    
}

class AnonymousDemo {
    public void createClass(){
        //anonymous class implementing interface
        Polygon p1 = new Polygon(){
           @Override
           public void display(){
               System.out.println("Inside an anonymous class.");
           }
        };
        p1.display();
    }
}
