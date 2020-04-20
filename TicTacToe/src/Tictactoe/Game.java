package Tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame{
   eve v = new eve();
   JFrame f = new JFrame();
   JPanel p1 = new JPanel();
   JLabel l1;
   JLabel l2;
   JLabel l5;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JButton b5;
   JButton b6;
   JButton b7;
   JButton b8;
   JButton b9;
   int counter = 0 , score1 = 0 , score2 = 0;
   int flag1=0,flag2=0, flag3=0,flag4=0,flag5=0, flag6=0, flag7=0, flag8=0, flag9=0;
   
   public Game() { 
	  l1 = new JLabel("Player1 : \"X\" ");
	  l2 = new JLabel("Player2 : \"O\" ");
	  l5 = new JLabel();
	  b1 = new JButton(); 
	  b2 = new JButton();
	  b3 = new JButton();
	  b4 = new JButton();
	  b5 = new JButton();
	  b6 = new JButton();
	  b7 = new JButton();
	  b8 = new JButton();
	  b9 = new JButton();
	  
	  this.setTitle("Tic-Tac-Toe");
	  this.setSize(600, 600);
	  this.setVisible(true);
      this.setResizable(false);
      this.setLocation(500, 100);
      p1.setSize(600, 600);
      p1.setBackground(Color.yellow);
      p1.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      this.add(p1);	  
	   
      l1.setBounds(20, 50, 200, 100);
      l1.setBackground(Color.green);     
      l1.setForeground(Color.blue);
      l1.setFont(new Font("atilic",Font.BOLD,20));
      
      l2.setBounds(350, 50, 200, 100);
      l2.setBackground(Color.green);     
      l2.setForeground(Color.blue);
      l2.setFont(new Font("atilic",Font.BOLD,20));
      
      l5.setBounds(200, 120, 200, 100); 
      l5.setBackground(Color.yellow);   
      l5.setForeground(Color.DARK_GRAY);           
      l5.setFont(new Font("atilic",Font.BOLD,20)); 
      
      b1.setBounds(40, 460, 150, 100);
      b1.setBackground(Color.cyan);     
      b1.setForeground(Color.red);
      b1.setFont(new Font("atilic",Font.BOLD,100));
      
      b2.setBounds(200, 460, 150, 100);
      b2.setBackground(Color.cyan);     
      b2.setForeground(Color.red);
      b2.setFont(new Font("atilic",Font.BOLD,100));
      
      b3.setBounds(360, 460, 150, 100);
      b3.setBackground(Color.cyan);     
      b3.setForeground(Color.red);
      b3.setFont(new Font("atilic",Font.BOLD,100));
      
      b4.setBounds(40, 355, 150, 100);
      b4.setBackground(Color.cyan);     
      b4.setForeground(Color.red);
      b4.setFont(new Font("atilic",Font.BOLD,100));
      
      b5.setBounds(200, 355, 150, 100);
      b5.setBackground(Color.cyan);     
      b5.setForeground(Color.red);
      b5.setFont(new Font("atilic",Font.BOLD,100));
      
      b6.setBounds(360, 355, 150, 100);
      b6.setBackground(Color.cyan);     
      b6.setForeground(Color.red);
      b6.setFont(new Font("atilic",Font.BOLD,100));
      
      b7.setBounds(40, 249, 150, 100);
      b7.setBackground(Color.cyan);     
      b7.setForeground(Color.red);
      b7.setFont(new Font("atilic",Font.BOLD,100));
      
      b8.setBounds(200, 249, 150, 100);
      b8.setBackground(Color.cyan);     
      b8.setForeground(Color.red);
      b8.setFont(new Font("atilic",Font.BOLD,100));
      
      b9.setBounds(360, 249, 150, 100);
      b9.setBackground(Color.cyan);     
      b9.setForeground(Color.red);
      b9.setFont(new Font("atilic",Font.BOLD,100));
      
      
     
      
      
      p1.add(l1);
      p1.add(l2);
      p1.add(l5);
	  p1.add(b1); 
	  p1.add(b2);
	  p1.add(b3);
	  p1.add(b4);
	  p1.add(b5);
	  p1.add(b6);
	  p1.add(b7);
	  p1.add(b8);
	  p1.add(b9);
	  
	  b1.addActionListener(v);
	  b2.addActionListener(v);
	  b3.addActionListener(v);
	  b4.addActionListener(v);
	  b5.addActionListener(v);
	  b6.addActionListener(v);
	  b7.addActionListener(v);
	  b8.addActionListener(v);
	  b9.addActionListener(v);

   }
   
   

   private class eve implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			if(counter%2 == 0) {	
			  b1.setText("X");
			}else {
				b1.setText("O"); 	
			}
			flag1 = 1;
			b1.setEnabled(false);
		}else if(e.getSource() == b2) {
			if(counter%2 == 0) {
				  b2.setText("X");
				}else {
					b2.setText("O"); 	
				}
			flag2 = 1;
			b2.setEnabled(false);
		}else if(e.getSource() == b3) {
			if(counter%2 == 0) {
				  b3.setText("X");
				}else {
					b3.setText("O"); 	
				};
			flag3 = 1;
			b3.setEnabled(false);
		}else if(e.getSource() == b4) {
			if(counter%2 == 0) {
				  b4.setText("X");
				}else {
					b4.setText("O"); 	
				}
			flag4 = 1;
			b4.setEnabled(false);
		}else if(e.getSource() == b5) {
			if(counter%2 == 0) {
				  b5.setText("X");
				}else {
					b5.setText("O"); 	
				}
			flag5 = 1;
			b5.setEnabled(false);
		}else if(e.getSource() == b6) {
			if(counter%2 == 0) {
				  b6.setText("X");
				}else {
					b6.setText("O"); 	
				}
			flag6 = 1;
			b6.setEnabled(false);
		}else if(e.getSource() == b7) {
			if(counter%2 == 0) {
				  b7.setText("X");
				}else {
					b7.setText("O"); 	
				}
			flag7 = 1;
			b7.setEnabled(false);
		}else if(e.getSource() == b8) {
			if(counter%2 == 0) {
				  b8.setText("X");
				}else {
					b8.setText("O"); 	
				}
			flag8 = 1;
			b8.setEnabled(false);
		}else if(e.getSource() == b9) {
			if(counter%2 == 0) {
				  b9.setText("X");
				}else {
				  b9.setText("O"); 	
				}
			flag1 = 9;
			b9.setEnabled(false);
		}
		

		
	
		
		if(b2.getText().equals("X") && b1.getText().equals("X") && b3.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b2.getText().equals("O") && b1.getText().equals("O") && b3.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
			l5.setText("PLayer2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b4.getText().equals("X") && b1.getText().equals("X") && b7.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b4.getText().equals("O") && b1.getText().equals("O") && b7.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b6.getText().equals("X") && b9.getText().equals("X") && b3.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b6.getText().equals("O") && b9.getText().equals("O") && b3.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b8.getText().equals("X") && b7.getText().equals("X") && b9.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b8.getText().equals("O") && b7.getText().equals("O") && b9.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b5.getText().equals("X") && b3.getText().equals("X") && b7.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b5.getText().equals("O") && b3.getText().equals("O") && b7.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b5.getText().equals("X") && b9.getText().equals("X") && b1.getText().equals("X")) {
			l5.setText("Player1 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(b5.getText().equals("O") && b9.getText().equals("O") && b1.getText().equals("O")) {
			l5.setText("Player2 Won!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}else if(counter == 8) {
			l5.setText("Draw!");
			l5.setForeground(Color.green);
			l5.setEnabled(true);
		}
		counter++;
	
	}
	   
   }
   
}
