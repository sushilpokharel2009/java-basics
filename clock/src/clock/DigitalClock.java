package clock;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DigitalClock implements Runnable{
	
	
	
	JFrame f;  
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	JButton b;  
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	DigitalClock(){  
	    f=new JFrame();
	   // f.setBackground(Color.BLACK);
	      
	    t = new Thread(this);  
	        t.start();  
	      
	    b=new JButton();  
	        b.setBounds(150,100,200,200); 
	        //b.setBackground(Color.RED);
	      
	    f.add(b);  
	    f.setSize(500,500);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	 
	
	
	 try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            //if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:s a");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            printTime();  
  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) {
    	  e.printStackTrace();
      	}  
      }
	
	
	public void printTime(){  
		b.setText(timeString);  
		}  


	public static void main(String[] args) {
		
		DigitalClock dc = new DigitalClock();
	}


	
	

}
