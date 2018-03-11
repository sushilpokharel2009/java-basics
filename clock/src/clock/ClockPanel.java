package clock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Calendar;

import javax.swing.JPanel;

public class ClockPanel implements ImageObserver{

	private Font clockFont;
	private Object runner;

	public void paintComponent(Graphics painter )
    {
    Image pic = 
      Toolkit.getDefaultToolkit().getImage("background.jpg");
     
     if(pic != null)
       
        painter.drawImage(pic, 0, 0, this);     //create image
  
             
//if I didn't use a background image I would have used the setColor and fillRect methods to set background
  
      painter.setFont(clockFont);                   //create clock components
      painter.setColor(Color.black);
      painter.drawString( timeNow(), 60, 40);
     

    }
 

 
 //get current time
 public String timeNow()
 {
   Calendar now = Calendar.getInstance();
   int hrs = now.get(Calendar.HOUR_OF_DAY);
   int min = now.get(Calendar.MINUTE);
   int sec = now.get(Calendar.SECOND);
   
   String time = zero(hrs)+":"+zero(min)+":"+zero(sec);
   
   return time;
 }


 
 public String zero(int num)
 {
   String number=( num < 10) ? ("0"+num) : (""+num);
   return number;                                    //Add leading zero if needed
   
 }
 
 
 public void start()
 {
   if(runner == null) runner = new Thread((Runnable) this);
   ((ClockPanel) runner).start();
                                                         //method to start thread
 }


 public void run()
 {
   while (runner == Thread.currentThread() )
   {
    repaint();
                                                     //define thread task
       try
         {
           Thread.sleep(1000);
         }
          catch(InterruptedException e)
              {
                System.out.println("Thread failed");
              }
              
   }
 }
 
 private void repaint() {
	// TODO Auto-generated method stub
	
}



//create main method
 public static void main(String [] args)
 {
   ClockPanel eg = new ClockPanel();
 }



public ZoneId getZone() {
	// TODO Auto-generated method stub
	return null;
}



public Clock withZone(ZoneId zone) {
	// TODO Auto-generated method stub
	return null;
}



public Instant instant() {
	// TODO Auto-generated method stub
	return null;
}



@Override
public boolean imageUpdate(Image img, int infoflags, int x, int y, int width,
		int height) {
	// TODO Auto-generated method stub
	return false;
}

}
