/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5.Multiple;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class C implements A, B{
    
    @Override
    public void displayA(){
        System.out.println("Displaying A");
    }
    
    @Override
    public void displayB(){
        System.out.println("Displaying B");
    }
    
    public void displayC(){
        System.out.println("Displaying C");
    }
    
}
