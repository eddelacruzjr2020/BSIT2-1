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
public class SwingExample1withEvent implements ActionListener {
    
    private int clickCount = 0; // Counter for button clicks
    private JLabel lblCounter;
    private JButton btnClickMe, btnReset;
    
    SwingExample1withEvent(){
        //Creating frame
        JFrame f = new JFrame();
    
        //Set frame size
        f.setSize(500, 500);
        
        //Create button components
        btnClickMe = new JButton("Click Me!!!");
        lblCounter = new JLabel("Click Counter is 0");
        btnReset = new JButton("Reset");
        
        //Adding components to frame
        f.add(btnClickMe);
        f.add(lblCounter);
        f.add(btnReset);
        
        //Set button size
        btnClickMe.setBounds(110, 150, 100, 50);
        lblCounter.setBounds(110, 200, 150, 100);
        btnReset.setBounds(110, 300, 100, 50);
        
        //Set layout null
        f.setLayout(null);
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        
        //Set Visible to true
        f.setVisible(true);
        
        //Add to Action Listener
        btnClickMe.addActionListener(this);
        btnReset.addActionListener(this);
    
  
}

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == btnClickMe){
          clickCount++;
          lblCounter.setText("Click Counter is "+clickCount);
        }else if(e.getSource() == btnReset ){
          clickCount = 0;
          lblCounter.setText("Click Counter is "+clickCount);
        }
    }
    
}
