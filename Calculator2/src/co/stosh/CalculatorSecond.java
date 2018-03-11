package co.stosh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorSecond extends JFrame {

	JPanel contentPane;
	 private JTextField textField;
	
	String x = "";
	String y = "";
	String o = "";

	 static double radius;
	 static double area;
	 
	 public void operation(){
		 double sn = Double.parseDouble(x);
			double fn = Double.parseDouble(y);
				Double result = 0.0;
				
				if(o.equals("+")){
					result = fn + sn;					
					
				}else if(o.equals("-")){
					result = fn - sn;
					
				}else if(o.equals("*")){
					result = fn * sn;
					
				}else if(o.equals("/")){
					result = fn / sn;
					
				}
				y = result+"";
				x= "";
				textField.setText(y);
	 }
	 
	public static void finalArea(double r1) {
			
			radius = r1;
			area = radius*radius*3.14;
			double result = area;
		}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorSecond frame = new CalculatorSecond();
					frame.setVisible(true);
					frame.setSize(450, 300);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public CalculatorSecond() {
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 0, 438, 247);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 426, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnOff.setBounds(-4, 55, 51, 29);
		panel.add(btnOff);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"1";
				textField.setText(x);
			}
		});
		btn1.setBounds(-4, 84, 51, 29);
		panel.add(btn1);
		
		JButton btnMC = new JButton("MC");
		btnMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnMC.setBounds(74, 55, 51, 29);
		panel.add(btnMC);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"2";
				textField.setText(x);
			}
		});
		btn2.setBounds(74, 84, 51, 29);
		panel.add(btn2);
		
		JButton btnMR = new JButton("MR");
		btnMR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMR.setBounds(149, 55, 51, 29);
		panel.add(btnMR);
		
		JButton btnMAdd = new JButton("M+");
		btnMAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				
				
				
				
				
			}
		});
		btnMAdd.setBounds(228, 55, 51, 29);
		panel.add(btnMAdd);
		
		JButton btnMSub = new JButton("M-");
		btnMSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMSub.setBounds(295, 55, 51, 29);
		panel.add(btnMSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "+";
				y = x;
				x = "";
			}
		});
		btnAdd.setBounds(295, 84, 51, 29);
		panel.add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o.isEmpty()){				
				y = x;
				x = "";
				}else{
					operation();
				}
				o = "-";
			}
		});
		
//		
//		JButton btnSub = new JButton("-");
//		btnSub.addActionListener(new ActionListener(){
//			
//		}
//		
		
		
		
		
		
		
		
		
		btnSub.setBounds(358, 84, 51, 29);
		panel.add(btnSub);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"3";
				textField.setText(x);
			}
		});
		btn3.setBounds(149, 84, 51, 29);
		panel.add(btn3);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				x = x+"5";
				System.out.println("x--->>"+ x);
				textField.setText(x);
			}
		});
		btn5.setBounds(-4, 112, 51, 29);
		panel.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"4";
				textField.setText(x);
			}
		});
		btn4.setBounds(228, 84, 51, 29);
		panel.add(btn4);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"9";
				textField.setText(x);
			}
		});
		btn9.setBounds(-4, 146, 51, 29);
		panel.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"6";
				textField.setText(x);
			}
		});
		btn6.setBounds(74, 112, 51, 29);
		panel.add(btn6);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"0";
				textField.setText(x);
			}
		});
		btn0.setBounds(74, 146, 51, 29);
		panel.add(btn0);
		
		JButton btnSqr = new JButton("SQR");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d = Double.parseDouble(textField.getText());
				// int[] no = {22,25,81};
			 //for (int i = 0; i < no.length; i++) {
					 //   int x = no[i];
					  //  if (x % 2 == 0) continue;
					    double y = (int) Math.sqrt(d);
					   // if (x == y * y) { 
					        //System.out.println(x);
					    	//int result = x;
					    	
					    	
					    	textField.setText(y+"");
					  //}
					    
					    
					//}
				

			}
		});
		btnSqr.setBounds(358, 187, 51, 29);
		panel.add(btnSqr);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+".";
				textField.setText(x);
				
			}
		});
		btnDot.setBounds(149, 146, 51, 29);
		panel.add(btnDot);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				o = "/";
				y = x;
				x = "";
			}
		});
		btnDiv.setBounds(358, 112, 51, 29);
		panel.add(btnDiv);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"7";
				textField.setText(x);
			}
		});
		btn7.setBounds(149, 112, 51, 29);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x+"8";
				textField.setText(x);
			}
		});
		btn8.setBounds(228, 112, 51, 29);
		panel.add(btn8);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				o = "*";
				y = x;
				x = "";
			}
		});
		btnMultiply.setBounds(291, 112, 51, 29);
		panel.add(btnMultiply);
		
		JButton btnPie = new JButton("PIE");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(String e) {
				finalArea();
			
		       textField.setText(x); 
			}

			private void finalArea() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btnPie.setBounds(295, 187, 51, 29);
		panel.add(btnPie);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double sn = Double.parseDouble(x);
			double fn = Double.parseDouble(y);
				Double result = 0.0;
				
				if(o.equals("+")){
					result = fn + sn;
					
				
					
				}else if(o.equals("-")){
					result = fn - sn;
					
				}else if(o.equals("*")){
					result = fn * sn;
					
				}else if(o.equals("/")){
					result = fn / sn;
					
				}else if(o.equals(".")){
					//result = fn.sn;
					
				}
				
				textField.setText(result+"");
			}
		});
		btnEquals.setBounds(228, 146, 51, 29);
		panel.add(btnEquals);
		
		JButton btnSin = new JButton("SIN");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n = Double.parseDouble(textField.getText());
				
				double result = Math.sin(Math.toRadians(n));
				
				textField.setText(result+"");
			}
		});
		btnSin.setBounds(-4, 187, 51, 29);
		panel.add(btnSin);
		
		JButton btnCos = new JButton("COS");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n = Double.parseDouble(textField.getText());
				
				double result = Math.cos(Math.toRadians(n));
				
				textField.setText(result+"");
			}
		});
		btnCos.setBounds(74, 187, 51, 29);
		panel.add(btnCos);
		
		JButton btnTan = new JButton("TAN");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double n = Double.parseDouble(textField.getText());
				
				double result = Math.tan(Math.toRadians(n));
				
				textField.setText(result+"");
			}
		});
		btnTan.setBounds(149, 187, 51, 29);
		panel.add(btnTan);
		
		JButton btnDelete = new JButton("DEL");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = x.substring(0, x.length() -1);
				textField.setText(x);
			}
		});
		btnDelete.setBounds(358, 146, 51, 29);
		panel.add(btnDelete);
		
		JButton btnClear = new JButton("CLR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				x = "";
				y = "";
				o = "";
				textField.setText("");
			}
		});
		btnClear.setBounds(295, 146, 51, 29);
		panel.add(btnClear);
		
		JButton btnLog = new JButton("LOG");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double d = 0;
				d = Math.log10(d);
				
				textField.setText("d");
			}
		});
		btnLog.setBounds(228, 187, 51, 29);
		panel.add(btnLog);
			
		boolean on = false;
		JButton btnOn = new JButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean on = true;
				
				textField.setEnabled(on);
			}
			
		});
		btnOn.setBounds(358, 55, 51, 29);
		panel.add(btnOn);
	}


	
	
	
}
