package co.rel;

import java.awt.Color;
import java.util.Date;

import javax.swing.JFrame;

public class LightTRaffic1 {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("Traffic Light");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    TrafficLightPanel tc = new TrafficLightPanel();
		    
		    frame.getContentPane().add(tc);

		    frame.pack();
		    frame.setVisible(true);
		    
		    
		    Date d1 = new Date();
		    //long l = 0;
		    int x= d1.getMinutes();
		    //System.out.println(x+" --");
		    
		    
		    while(true){
				   
				  Date d = new Date();
				  int i = d.getMinutes();
				  
				 // x = i;
				 // System.out.println(i+"--=");
				  if(x+1==i){
					  tc.buttonPanel.setBackground(Color.RED);
					  
				  }if(x+2 ==i){
					  tc.buttonPanel.setBackground(Color.YELLOW);
				  }else if(x+3==i){
					  tc.buttonPanel.setBackground(Color.GREEN);
					  
					  x = x+3;
				  }
				  
				  
				  tc.buttonPanel.updateUI();
				  
		    }
		    
	}

}
