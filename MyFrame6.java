import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame6 extends JFrame
{
	
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2,b3,b4,b5;
	Font f1;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame6()
	{
		super("Ticket Booking");
		setLayout(null);
		setBounds(0,0,800,800);
		
		l1 = new JLabel("PLEASE SELECT YOUR COACH");
		l2 = new JLabel("ENTER COACH :-");
		b1 = new JButton("SLEEPER COACH");
		b2 = new JButton("AC COACH");
		b3 = new JButton("GENERAL COACH");
		b4 = new JButton("RESERVATION COACH");
		b5 = new JButton("BACK1");
		t1 = new JTextField();
	
		

		
		
	
		
		l1.setBounds(50,50,500,100);
		l2.setBounds(600,50,700,100);
		b1.setBounds(50,200,400,50);
		b2.setBounds(50,275,400,50);
		b3.setBounds(50,350,400,50);
		b4.setBounds(50,425,400,50);
		b5.setBounds(50,550,400,50);
		t1.setBounds(600,200,400,50);
		
		
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		l2.setFont(f1);
		t1.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1); 
		b4.setFont(f1);
		b5.setFont(f1);
	

		


		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(t1);

		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);

		
		


		b1.addActionListener(ml);
		b2.addActionListener(ml);
		b3.addActionListener(ml);
		b4.addActionListener(ml);
		b5.addActionListener(ml);
		

		
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
			MyFrame6 mf6 = new MyFrame6();
			mf6.setVisible(true);
	}

	
}