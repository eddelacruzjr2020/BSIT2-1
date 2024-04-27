/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AWTExample1 {
    
    AWTExample1(){
        //Creating frame
        Frame f = new Frame();
    
        //Set frame size
        f.setSize(300, 300);
        
        //Create button components
        Button b = new Button("Click Me!!!");
        
        //Adding components to frame
        f.add(b);
        
        //Set button size
        b.setBounds(110, 150, 100, 50);
        
        //Set layout null
        f.setLayout(null);
        
        //Set Visible to true
        f.setVisible(true);
    }
    
    
    
    
}
