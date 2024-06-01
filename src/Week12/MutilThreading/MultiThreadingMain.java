/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12.MutilThreading;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThreadingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<=5; i++){
            MultiThrendExtend extend = new MultiThrendExtend(i);
            //New State
            extend.start();
            //Runnable
            //if available CPU processor --> Running State
            //if high priority thread enter, thread can be set to Blocked State (non-runnable state)
            //if there available CPU processor/ prerequite is already been completed --> Running state
            //Running --> Dead State
        }
        
    }
    
}
