/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.Switching3Frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class HomePage extends JFrame implements ActionListener{
    
    private JButton btnWelcome = new JButton("Welcome");
    private JButton btnLogin = new JButton("Login");
    
    HomePage(){
        setTitle("Home Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnLogin.setBounds(50, 100, 120, 30);
        btnWelcome.setBounds(150, 100, 120, 30);
        add(btnLogin);
        add(btnWelcome);
        btnLogin.addActionListener(this);
        btnWelcome.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnWelcome){
            WelcomePage wp = new WelcomePage();
            wp.setVisible(true);
        }else if(e.getSource() == btnLogin){
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
        }
    }
    
}
