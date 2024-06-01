/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Counter;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Counter {
    
    private int count;
    
    public synchronized void increment(){
        count++;
    }
    
    public int getCount(){
        return count;
    }
}
