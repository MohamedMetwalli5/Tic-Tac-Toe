package Tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame{
    JFrame f2 = new JFrame();
    JPanel p2 = new JPanel();
    eve2 v2 = new eve2();
    JButton bb1;
    JButton bb2;
	public MainMenu() {
	    this.setTitle("Tic-Tac-Toe");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 100);
        p2.setSize(600, 600);
        p2.setBackground(Color.yellow);
        p2.setLayout(null);		
	    bb1 = new JButton("Start");
	    bb2 = new JButton("About me");
	    
	    bb1.setBounds(170, 100, 250, 80);
	    bb1.setBackground(Color.green);
	    bb1.setForeground(Color.DARK_GRAY);
	    bb1.setFont(new Font("atilic",Font.BOLD,30));
	    
	    bb2.setBounds(170, 200, 250, 80);
	    bb2.setBackground(Color.green);
	    bb2.setForeground(Color.DARK_GRAY);
	    bb2.setFont(new Font("atilic",Font.BOLD,30));
	    

	    
	    this.add(p2);
	    p2.add(bb1);
	    p2.add(bb2);
	    bb1.addActionListener(v2);
	    bb2.addActionListener(v2);
  }
	 private class eve2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == bb1) {  
				  Game z = new Game();
				  z.setVisible(true);
				  f2.setVisible(false);
				  f2.dispose();
				}else if(e.getSource() == bb2){
				    Information k = new Information();
				    k.setVisible(true);
					f2.setVisible(true);
				}
				
			}
	    
	    }	
}



