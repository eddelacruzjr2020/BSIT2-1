/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class SwingExample2 extends JFrame{
    
    
    SwingExample2(){
        //Frame size
        setSize(500, 500);
        
        //Frame name
        setTitle("Login Page");
        
        //Adding of all components
        JLabel lblHeader = new JLabel("My Login Page");
        JTextField txtfldUsername = new JTextField();
        JTextField txtfldPassword = new JTextField();
        JLabel lblUsername = new JLabel("Username");
        JLabel lblPassword = new JLabel("Password");
        JButton btnLogin = new JButton("Login");
        
        //Adding of all components to Frame
        add(lblHeader);
        add(txtfldUsername);
        add(txtfldPassword);
        add(lblUsername);
        add(lblPassword);
        add(btnLogin);
        
        //Declare where components located
        lblHeader.setBounds(230, 100, 100, 80);
        txtfldUsername.setBounds(50, 300, 80, 30);
        txtfldPassword.setBounds(150, 300, 80, 30);
        lblUsername.setBounds(50, 330, 80, 30);
        lblPassword.setBounds(150, 330, 80, 30);
        btnLogin.setBounds(50, 400, 80, 30);
        
        //Set Layout
        setLayout(null);
        
        //Visible to True
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    
}
