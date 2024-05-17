/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SwingExample1 {
    
    private int clickCount = 0; // Counter for button clicks
    private JLabel lblCounter;
    private JButton b;
    
    SwingExample1(){
        //Creating frame
        JFrame f = new JFrame();
    
        //Set frame size
        f.setSize(300, 300);
        
        //Create button components
        b = new JButton("Click Me!!!");
        lblCounter = new JLabel("Click Counter is 0");
        
        //Adding components to frame
        f.add(b);
        f.add(lblCounter);
        
        //Set button size
        b.setBounds(110, 150, 100, 50);
        lblCounter.setBounds(110, 200, 150, 100);
        
        //Set layout null
        f.setLayout(null);
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
        //Set Visible to true
        f.setVisible(true);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Increment the click count
                clickCount++;
                lblCounter.setText("Click Counter is "+clickCount);
                
            }
        });
    }
    
    
    
    
}
