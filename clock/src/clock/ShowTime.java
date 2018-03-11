package clock;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShowTime extends JFrame{
	JLabel time;

	ShowTime()
	{
	setSize(300,200);
	setTitle("http://simpleandeasycodes.blogspot.com/");
	setLocation(100,100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setLayout(new GridBagLayout());

	time = new JLabel("");

	time.setFont(new Font("SansSerif",Font.BOLD, 36));

	time.setForeground(Color.MAGENTA);

	add(time);

	//starting new Thread which will update time
	new Thread(new Runnable()
	{
	public void run() 
	{ try 
	{
	updateTime(); 
	} 
	catch (Exception ie) 
	{ }
	}
	}).start();
	}

	public void updateTime()
	{
	try
	{
	while(true)
	{
	//geting Time in desire format
	time.setText(new SimpleDateFormat("hh:mm:ss a").format(new java.util.Date()));
	//Thread sleeping for 1 sec
	Thread.currentThread().sleep(1000);
	}
	}
	catch (Exception e)
	{
	System.out.println("Exception in Thread Sleep : "+e);
	}
	}

	public static void main(String[] args) 
	{
	JFrame obj = new ShowTime();
	obj.setVisible(true);
	}
}
