package co.rel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrafficLightPanel extends Panel{
	 public JButton one, amber, green, change;
	 public JLabel  label, label1;
	 public JPanel buttonPanel;
	  
	  
	  
	  public TrafficLightPanel (){
		  
		  
		  setPreferredSize (new Dimension(400, 400));
		  setBackground (Color.white);
		 
		 
		  buttonPanel = new JPanel();
		  buttonPanel.setPreferredSize (new Dimension(350,350));
		  buttonPanel.setBackground (Color.white);
	  
	    one = new JButton ();
	    one.setText("RED");
	    amber = new JButton ("AMBER");
	    green = new JButton ("GREEN");
	    
	    
	   
	    
	    label = new JLabel ();
	    
	    
	    
//	    buttonPanel.add (label);
	    
	    
	    buttonPanel.add (one);
	    buttonPanel.add (amber);
	    buttonPanel.add (green);
	    
	    //label1 = new JLabel ();
	   // buttonPanel.add (label1);
	   
	    

	    ButtonListener listener = new ButtonListener();
	    one.addActionListener (listener);
	    amber.addActionListener (listener);
	    green.addActionListener (listener);
	    //change.addActionListener (listener);

	  
	    add(buttonPanel);
	   
	   
	    
	   

	  
//	    JPanel panel = new JPanel();
//	    add(panel);
//	    panel.setPreferredSize (new Dimension(300, 390));
//	    panel.setBackground (Color.cyan);
//add(buttonPanel);
	  }
	  
	  
	  
	  private class ButtonListener implements ActionListener{
		  
		  public void actionPerformed (ActionEvent event){
			  if (event.getSource() == one)
			    {
			       //label1.setText("Red");
			       buttonPanel.setBackground(Color.red);
			    }
			  if (event.getSource() == amber)
			    {
			       //label1.setText("amber");
			       buttonPanel.setBackground(Color.orange);
			    }
			  if (event.getSource() == green)
			    {
			       //label1.setText("Green");
			       buttonPanel.setBackground(Color.green);
			    }
		  }
		   
		  
	  }
	  
//  private class LightPanel extends JPanel
//	  {
//	    public void paintComponent (Graphics page)
//	    {
//	      super.paintComponent(page);
//	      page.setColor(Color.red);
//	      page.fillOval(100,100,100,100);
//	      page.setColor(Color.orange);
//	      page.fillOval(15, 90, 40, 40);
//	      page.setColor(Color.green);
//	      page.fillOval(150, 150, 40, 40);
//	    }
//	  }



}
