package co.stosh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Register extends JFrame implements ActionListener
{
     JTextField lblScreen;
    public Register() 
    {
     super ("Number Keypad Application");
     setDefaultCloseOperation (EXIT_ON_CLOSE);
     setLayout (new FlowLayout());
      numpad ();
     setSize (600,600);
     setVisible (true);
    }
    public void numpad()
    {

     lblScreen= new JTextField ();
     lblScreen.setColumns(12);
     lblScreen.setHorizontalAlignment (JTextField.RIGHT);
     add (lblScreen);

     JPanel panel = new JPanel (new BorderLayout ());
     add (panel);
     JButton btn;
  
     btn=new JButton ("Burger McDo");
     btn.getSize();
     btn.addActionListener(this);
     panel.add(btn, BorderLayout.WEST); 
     btn=new JButton ("Cheeseburger McDo");
     btn.addActionListener(this);
     panel.add(btn, BorderLayout.EAST); 
     btn=new JButton ("Coke");
     btn.addActionListener(this);
     panel.add(btn, BorderLayout.CENTER);

     JPanel panel2 = new JPanel (new BorderLayout ());
     add (panel2);
     btn=new JButton ("French Fries");
     btn.addActionListener(this);
     panel2.add(btn, BorderLayout.WEST); 
     btn=new JButton ("McDo Spaghetti");
     btn.addActionListener(this);
     panel2.add(btn, BorderLayout.EAST); 
     btn=new JButton ("McDo Sundae");
     btn.addActionListener(this);
     panel2.add(btn, BorderLayout.CENTER);

     JPanel panel3 = new JPanel (new BorderLayout ());
     add (panel3);
     btn=new JButton ("McChicken");
     btn.addActionListener(this);
     panel3.add(btn, BorderLayout.WEST); 
     btn=new JButton ("McNuggets");
     btn.addActionListener(this);
     panel3.add(btn, BorderLayout.EAST); 
     btn=new JButton ("Double Cheeseburger");
     btn.addActionListener(this);
     panel3.add(btn, BorderLayout.CENTER);

     JPanel panel4 = new JPanel (new BorderLayout ());
     add (panel4);
     btn=new JButton ("Quarter Pounder");
     btn.addActionListener(this);
     panel4.add(btn, BorderLayout.WEST); 
     btn=new JButton ("Restart");
     btn.addActionListener(this);
     panel4.add(btn, BorderLayout.EAST); 
     btn=new JButton ("BigMac");
     btn.addActionListener(this);
     panel4.add(btn, BorderLayout.CENTER);
    }
     public void actionPerformed (ActionEvent e)
     {
         JButton btn;
      if (e.getActionCommand().equals("Burger McDo")) 
      {lblScreen.setText(lblScreen.getText()+"55");}
      if (e.getActionCommand().equals("Cheeseburger McDo")) 
      {lblScreen.setText(lblScreen.getText()+"67");}
      if (e.getActionCommand().equals("Coke")) 
      {lblScreen.setText(lblScreen.getText()+"20");}
      if (e.getActionCommand().equals("French Fries")) 
      {lblScreen.setText(lblScreen.getText()+"27");}
      if (e.getActionCommand().equals("McDo Spaghetti")) 
      {lblScreen.setText(lblScreen.getText()+"36");}
      if (e.getActionCommand().equals("McDo Sundae")) 
      {lblScreen.setText(lblScreen.getText()+"32");}

 if (e.getActionCommand().equals("McChicken")) 
      {lblScreen.setText(lblScreen.getText()+"70");}
      if (e.getActionCommand().equals("McNuggets")) 
      {lblScreen.setText(lblScreen.getText()+"45");}
      if (e.getActionCommand().equals("Double Cheeseburger")) 
      {lblScreen.setText(lblScreen.getText()+"90");}
      if (e.getActionCommand().equals("Quarter Pounder")) 
      {lblScreen.setText(lblScreen.getText()+"108");}
      if (e.getActionCommand().equals("BigMac")) 
      {lblScreen.setText(lblScreen.getText()+"108");}
      if (e.getActionCommand().equals("Restart")) 

     {lblScreen.setText("");}
     }
   public static void main (String[]args)
    {
     Register app= new Register ();
    }
}
