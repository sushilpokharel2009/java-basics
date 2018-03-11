package com.stosh;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwitchNew extends JFrame{
	
	
	JPanel pl;
	JTextField tf;
	JButton bt;
	
	
	
	
	public SwitchNew(){
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		pl = new JPanel();
		pl.setBackground(Color.BLUE);
		
		
		tf = new JTextField();
		tf.setColumns(20);
		
		
		bt = new JButton();
		bt.setText("OK");
		
		
		
		pl.add(tf);
		pl.add(bt);
		
		add(pl);
		
	}

	public static void main(String[] args) {
		SwitchNew s1 = new SwitchNew();

	}

}
