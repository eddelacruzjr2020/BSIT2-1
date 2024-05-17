/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7to9;

import Week7to9Trial.EventSample.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ColorGame implements ActionListener {
    
    private JFrame f = new JFrame("Tayo magsugal!!!");
    private JButton btnRed, btnYellow, btnGreen, btnReset, btnQuit;
    private JLabel sugalResult;
    
    ColorGame(){
       f.setSize(600, 400);
       f.setLayout(null);
       f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
      
       sugalResult = new JLabel("");
       sugalResult.setBounds(100, 50, 400, 30);
       sugalResult.setFont(new Font("Castellar", Font.BOLD, 15));
       
       btnRed = new JButton("Pula");
       btnRed.setBackground(Color.RED);
       btnRed.setBounds(20, 100, 150, 40);
       btnRed.setFont(new Font("Castellar", Font.BOLD, 15));
       btnRed.addActionListener(this);
       
       btnYellow = new JButton("Dilaw");
       btnYellow.setBackground(Color.YELLOW);
       btnYellow.setBounds(220, 100, 150, 40);
       btnYellow.setFont(new Font("Castellar", Font.BOLD, 15));
       btnYellow.addActionListener(this);
       
       btnGreen = new JButton("Berde");
       btnGreen.setBackground(Color.GREEN);
       btnGreen.setBounds(420, 100, 150, 40);
       btnGreen.setFont(new Font("Castellar", Font.BOLD, 15));
       btnGreen.addActionListener(this);
       
       btnReset = new JButton("Ulit");
       btnReset.setBackground(Color.DARK_GRAY);
       btnReset.setBounds(95, 200, 150, 40);
       btnReset.setFont(new Font("Castellar", Font.BOLD, 15));
       btnReset.addActionListener(this);
       
       btnQuit = new JButton("Suko");
       btnQuit.setBackground(Color.LIGHT_GRAY);
       btnQuit.setBounds(295, 200, 150, 40);
       btnQuit.setFont(new Font("Castellar", Font.BOLD, 15));
       btnQuit.addActionListener(this);
      
       f.add(sugalResult);
       f.add(btnRed);
       f.add(btnYellow);
       f.add(btnGreen);
       f.add(btnReset);
       f.add(btnQuit);
       
       f.setVisible(true);
       f.setResizable(false);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btnRed){
            sugalResult.setText("Ikaw ay pumili ng Kulay Pula!");
        }else if(e.getSource() == btnYellow){
            sugalResult.setText("Ikaw ay pumili ng Kulay Dilaw!");
        }else if(e.getSource() == btnGreen){
            sugalResult.setText("Ikaw ay pumili ng Kulay Berde!");
        }else if(e.getSource() == btnReset){
            sugalResult.setText("");
        }else if(e.getSource() == btnQuit){
            sugalResult.setText("Meron ka lemon gusto ng tequila!!");
            
        }     
    }
    

}
