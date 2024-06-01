/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.MutilThreading;

import java.lang.System.Logger;
import java.util.logging.Level;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MultiThrendErrorExtend extends Thread {
    
    private int numThread;
    
    MultiThrendErrorExtend(int numThread){
        this.numThread = numThread;
    }
    
     @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " of numThread " + numThread);
            try {
                Thread.sleep(1000);
                if (numThread == 2 && i == 3) {
                    throw new RuntimeException("Exception in thread " + numThread);
                }
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(MultiThrendErrorExtend.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RuntimeException ex) {
                System.err.println(ex.getMessage());
                break;
            }
        }

    }

    
    
}
