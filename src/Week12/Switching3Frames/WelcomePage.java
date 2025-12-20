
package Week12.Switching3Frames;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class WelcomePage extends JFrame implements ActionListener{
    
    private JButton btnHome = new JButton("Home");
    private JButton btnLogin = new JButton("Login");
    
    WelcomePage(){
        setTitle("Welcome Page");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnLogin.setBounds(50, 100, 120, 30);
        btnHome.setBounds(150, 100, 120, 30);
        add(btnLogin);
        add(btnHome);
        btnLogin.addActionListener(this);
        btnHome.addActionListener(this);
