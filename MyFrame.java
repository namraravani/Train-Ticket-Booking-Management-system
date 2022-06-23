import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import javax.swing.*;

public class MyFrame extends JFrame
{
	
	JLabel l1,l2;
	JButton b1;
	Font f1;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame()
	{
		super("Ticket Booking");
		setLayout(null);
		setBounds(0,0,1600,1000);
		
		l1 = new JLabel("WELCOME TO TRAIN TICKET BOOKING MANAGEMENT SYSTEM");
		l2 = new JLabel("BOOK YOUR TICKETS EASILY BY CLICKING BELOW");
		b1 = new JButton("NEXT");

		
		
	
		
		l1.setBounds(400,100,1000,100);
		l2.setBounds(400,300,1000,100);
		b1.setBounds(400,500,600,100);
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		l2.setFont(f1);
		b1.setFont(f1);
		


		add(l1);
		add(l2);
		add(b1);


		b1.addActionListener(ml);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.red);
		l1.setForeground(Color.blue);

		

		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);

				}
			});
	}

	
	public static void main(String args[])
	{
			MyFrame mf = new MyFrame();
			mf.setVisible(true);
			
	}
}