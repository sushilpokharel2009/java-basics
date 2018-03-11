package com.stosh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalculator extends JFrame {

	JPanel contentPane;
	 JTextField textField;

	String x = "";
	String y = "";
	String o = "";
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	textField = new JTextField();
	textField.setBounds(6, 6, 428, 52);
	contentPane.add(textField);
	textField.setColumns(10);
		
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = x+"1";
				textField.setText(x);
				
				
				
			}
		});
		btn1.setBounds(6, 70, 58, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"2";
				textField.setText(x);
				
				
				
			}
		});
		btn2.setBounds(112, 70, 58, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"3";
				textField.setText(x);
			}
		});
		btn3.setBounds(209, 70, 58, 29);
		contentPane.add(btn3);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"7";
				textField.setText(x);
			}
		});
		btn7.setBounds(112, 103, 58, 29);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"8";
				textField.setText(x);
			}
		});
		btn8.setBounds(209, 103, 58, 29);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"9";
				textField.setText(x);
			}
		});
		btn9.setBounds(289, 103, 58, 29);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"0";
				textField.setText(x);
			}
		});
		btn0.setBounds(376, 103, 58, 29);
		contentPane.add(btn0);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "+";
				
				y = x;
				x = "";
				
			}
		});
		btnAdd.setBounds(6, 144, 58, 29);
		contentPane.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				o = "-";
				
				y = x;
				x = "";
				
			}
		});
		btnSub.setBounds(112, 144, 58, 29);
		contentPane.add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "*";
				
				y = x;
				x = "";
				
			}
		});
		btnMultiply.setBounds(209, 144, 58, 29);
		contentPane.add(btnMultiply);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"4";
				textField.setText(x);
			}
		});
		btn4.setBounds(286, 70, 58, 29);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"5";
				textField.setText(x);
			}
		});
		btn5.setBounds(376, 70, 58, 29);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"6";
				textField.setText(x);
			}
		});
		btn6.setBounds(6, 103, 58, 29);
		contentPane.add(btn6);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "/";
				
				y = x;
				x = "";
				
			}
		});
		btnDiv.setBounds(289, 144, 58, 29);
		contentPane.add(btnDiv);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Integer fn = Integer.parseInt(y);
				Integer sn = Integer.parseInt(x);
				Integer result = 0;
				
			if(o.equals("+")){
				result = fn + sn;
			}else if(o.equals("-")){
				result = fn - sn;
			}else if(o.equals("*")){
				result = fn * sn;
			}else if(o.equals("/")){
				result = fn / sn;
			}
			
			textField.setText(result+"");
			
			
			
				
//			Double fn = Double.parseDouble(y);
//			Double sn = Double.parseDouble(y);
//			Double result = 0.0;				
//				
//			if(o.equals("+")){
//				result = fn + sn;	
//				}
//			
//			textField.setText(result+"");
			
			
			
			}
		});
		btnEquals.setBounds(376, 144, 58, 29);
		contentPane.add(btnEquals);
		
		JButton btnLog = new JButton("LOG");
		btnLog.setBounds(6, 185, 58, 29);
		contentPane.add(btnLog);
		
		JButton btnSqr = new JButton("SQR");
		btnSqr.setBounds(112, 185, 58, 29);
		contentPane.add(btnSqr);
		
		JButton btnClr = new JButton("CLR");
		btnClr.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				x="";
				y="";
				o="";
				textField.setText("");
			}
		});
		btnClr.setBounds(209, 185, 58, 29);
		contentPane.add(btnClr);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.setBounds(295, 185, 52, 29);
		contentPane.add(btnDecimal);
		
		JButton btnMod = new JButton("MOD");
		btnMod.setBounds(6, 231, 58, 29);
		contentPane.add(btnMod);
		
		JButton btnLight = new JButton("LIGHT");
		btnLight.setBounds(209, 231, 58, 29);
		contentPane.add(btnLight);
		
		JButton btnDark = new JButton("DRK");
		btnDark.setBounds(289, 231, 71, 29);
		contentPane.add(btnDark);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBounds(372, 231, 58, 29);
		contentPane.add(btnNewButton_7);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setBounds(376, 185, 58, 29);
		contentPane.add(btnPercent);
		
		JButton btnDelete = new JButton("DEL");
		btnDelete.setBounds(112, 226, 58, 29);
		contentPane.add(btnDelete);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 428, 254);
		contentPane.add(panel);
		panel.setLayout(null);
	}
}
