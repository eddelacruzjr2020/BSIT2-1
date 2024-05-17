/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import Week7to9Trial.EventSample.*;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class MyLogin implements ActionListener {
    
    private JFrame f = new JFrame("My Login");
    private JLabel lblUsername, lblPassword, lblLoginResults;
    private JTextField txtfldUsername = new JTextField();
    private JPasswordField psswrdfldPassword = new JPasswordField();
    private JButton btnLogIn, btnReset;
    private JTextArea txtareaLoginResults = new JTextArea();

    
    MyLogin(){
    
    f.setSize(500, 600);
    f.setLayout(null);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    
    lblUsername = new JLabel("Username:");
    lblUsername.setBounds(20, 50, 120, 30);
    lblUsername.setFont(new Font("Castellar", Font.BOLD, 15));
    
    lblPassword = new JLabel("Password:");
    lblPassword.setBounds(20, 100, 120, 30);
    lblPassword.setFont(new Font("Castellar", Font.BOLD, 15));
    
    txtfldUsername.setBounds(140, 50, 100,30);
    txtfldUsername.setFont(new Font("Castellar", Font.PLAIN, 15));
    
    psswrdfldPassword.setBounds(140, 100, 100,30);
    psswrdfldPassword.setFont(new Font("Castellar", Font.PLAIN, 15));
    
    btnLogIn = new JButton("LogIn");
    btnLogIn.setBounds(20, 150, 100, 30);
    btnLogIn.setFont(new Font("Castellar", Font.PLAIN, 15));
    btnLogIn.addActionListener(this);
   
    btnReset = new JButton("Clear");
    btnReset.setBounds(130, 150, 100, 30);
    btnReset.setFont(new Font("Castellar", Font.PLAIN, 10));
    btnReset.addActionListener(this);
    
    lblLoginResults = new JLabel("");
    lblLoginResults.setBounds(20, 200, 480, 30);
    lblLoginResults.setFont(new Font("Castellar", Font.PLAIN, 15));
    
    txtareaLoginResults.setBounds(20, 300, 400, 200);
    txtareaLoginResults.setFont(new Font("Castellar", Font.PLAIN, 15));  
    txtareaLoginResults.setEditable(false);
    txtareaLoginResults.setLineWrap(true);
    
    f.add(lblUsername);
    f.add(lblPassword);
    f.add(txtfldUsername);
    f.add(psswrdfldPassword);
    f.add(btnLogIn);
    f.add(btnReset);
    f.add(lblLoginResults);
    f.add(txtareaLoginResults);
   
    f.setVisible(true);
    f.setResizable(false);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnLogIn){
           String username = txtfldUsername.getText();
           String password = psswrdfldPassword.getText();
           lblLoginResults.setText("Meron ka bang lemon, gusto ko ng tequila!!");
           txtareaLoginResults.setText("Your username is: "+username+"\nPassword is: "+password);
        }else if(e.getSource() == btnReset){
           txtfldUsername.setText("");
           psswrdfldPassword.setText("");
           lblLoginResults.setText("");
           txtareaLoginResults.setText("");         
        }
        
    }
    
}
