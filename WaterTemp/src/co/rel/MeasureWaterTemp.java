package co.rel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class MeasureWaterTemp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	//String n = "";
	
	
	
	int x = 0;
	//int y = 100;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeasureWaterTemp frame = new MeasureWaterTemp();
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
	public MeasureWaterTemp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 438, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 6, 426, 52);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnDown = new JButton("DOWN");
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				if (x <= 0)
//			        System.out.println("Water is solid at " + x );
				
				
				
				//int i = Integer.parseInt(n);
				
				//for(int i1 = 67; i1 >=0;--i1){
					
				//}
				x = x-1;
				textField.setText(x+"");
				
				if(x<=0){
					textField.setText(x+ "   :  Water is solid below "+ x);
				}
				
			}
		});
		btnDown.setBounds(172, 171, 59, 68);
		panel.add(btnDown);
		
		
		
		JButton btnup = new JButton("UP");
		btnup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
//				if (y<= 100)
//			        System.out.println("Water is gaseus at " + y );
				
				
				x = x+1;
				textField.setText(x+"");
				
			}
				
			});
	
		btnup.setBounds(172, 70, 59, 84);
		panel.add(btnup);
	}
	
	
	
}
