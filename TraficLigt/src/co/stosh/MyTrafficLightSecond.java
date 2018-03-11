package co.stosh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

public class MyTrafficLightSecond extends JFrame {

	public JPanel contentPane;
	//private static Object panel;
	
	
	public MyTrafficLightSecond() {
		setTitle("Traffic Light");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 16, 400, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRed = new JButton("RED");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnRed){
					panel.setBackground(Color.RED);
				}
			}
		});
		btnRed.setBounds(6, 22, 117, 29);
		panel.add(btnRed);
		
		JButton btnAmber = new JButton("AMBER");
		btnAmber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAmber){
					panel.setBackground(Color.YELLOW);
				}
			}
		});
		btnAmber.setBounds(135, 22, 117, 29);
		panel.add(btnAmber);
		
		JButton btnGreen = new JButton("GREEN");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource()==btnGreen){
					panel.setBackground(Color.GREEN);
				}
			}
		});
		btnGreen.setBounds(264, 22, 117, 29);
		panel.add(btnGreen);
		
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
		MyTrafficLightSecond fr = new MyTrafficLightSecond();
		fr.setVisible(true);
		fr.setSize(600, 600);
		
		
			  Date	d1 = new Date();
		       int x = d1.getMinutes();
		       
		       while(true){
		    	   Date d = new Date();
		    	   int i = d.getMinutes();
		    	   
		    	   
		    	   if(x+1 == i){
		    		    fr.setBackground(Color.RED); 
		    	   }
		    	   if(x+2 == i){
		    		  fr.setBackground(Color.YELLOW); 
		     	   }  
		    	   if(x+3 == i){
		     		fr.setBackground(Color.GREEN); 
		     		 //x = x+3;
		     	   }
		     	   
		    	  
		    		  
		    	  
		     	 fr.updateUI();
		       }
		       
		
	}




	private void updateUI() {
		// TODO Auto-generated method stub
		
	}




	




	
}
