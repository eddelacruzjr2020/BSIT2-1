/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Week11.DefaultInterface;

/**
 *
 * @author Edmundo Dela Cruz
 */
public interface Interface {
    
    public void method1();
    public void method2();
    default void method3(){
        System.out.println("Method 3");
    }
    public void method4();
    default void method5(){
        System.out.println("Method 5");
    }
}
