package Tictactoe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Information extends JFrame{
    JFrame f3 = new JFrame();
    JPanel p3 = new JPanel();
    JLabel l1;
	public Information(){
		this.setTitle("Tic-Tac-Toe");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p3.setSize(600, 600);
        p3.setBackground(Color.yellow);
        p3.setLayout(null);		
		
		
	    l1 = new JLabel("My name is Mohamed Metwalli , I created this game on 20/4/2020  :) ");	 
	    l1.setBounds(30, 100, 540, 50);
	    l1.setBackground(Color.orange);	
	    l1.setForeground(Color.blue);
	    l1.setFont(new Font("atilic",Font.BOLD,15));
	    
	    this.add(p3);
	    p3.add(l1);
		 
		 
		 
		 
		 
		 
		 
		 
     }
}
