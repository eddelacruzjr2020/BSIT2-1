/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Switching3Frames;

import Week12.Switching2Frames.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LoginPage extends JFrame implements ActionListener{
    
    private JButton btnWelcome = new JButton("Welcome");
    private JButton btnHome = new JButton("Home");
    
    LoginPage(){
        setTitle("Login Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnHome.setBounds(50, 100, 120, 30);
        btnWelcome.setBounds(150, 100, 120, 30);
        add(btnHome);
        add(btnWelcome);
        btnHome.addActionListener(this);
        btnWelcome.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnWelcome){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }else if(e.getSource() == btnHome){
            HomePage hp = new HomePage();
            hp.setVisible(true);
        }
    }
    
}
