/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Hybrid;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class D implements B, C{
    
    @Override
    public void displayA(){
        System.out.println("Displaying A");
    }
    
    @Override
    public void displayB(){
        System.out.println("Displaying B");
    }
        
    @Override
    public void displayC(){
        System.out.println("Displaying C");
    }      
    
    public void displayD(){
        System.out.println("Displaying D");
    }
}
