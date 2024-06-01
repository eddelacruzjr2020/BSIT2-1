/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MutilThreading;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThrendExtend extends Thread {
    
    private int numThread;
    
    MultiThrendExtend(int numThread){
        this.numThread = numThread;
    }
    
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i+" of numThread "+numThread);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
            
        }
        
        
    }
    
    
}
