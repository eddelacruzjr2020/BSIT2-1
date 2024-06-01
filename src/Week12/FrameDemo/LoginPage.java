/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.FrameDemo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class LoginPage extends JFrame implements WindowListener{
    
    private JButton btnLogin = new JButton("Login");
    
    LoginPage(){
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnLogin.setBounds(100, 100, 100, 30);
        addWindowListener(this);
        add(btnLogin);
        setVisible(true);  
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Frame is opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Frame is closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Frame is closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Frame is minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Frame is maximized");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Frame is activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Frame is deactivated");
    }
}
