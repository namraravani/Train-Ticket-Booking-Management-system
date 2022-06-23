import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame3 extends JFrame
{
	
	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5;
	JTextField t1;
	Font f1;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame3()
	{
		super("Ticket Booking");
		setLayout(null);
		setBounds(0,0,1600,1000);
		
		l1 = new JLabel("PLEASE SELECT YOUR TRAIN");
		l2 = new JLabel("ENTER YOUR SELECTED TRAIN HERE :-");
		b1 = new JButton("TRAIN1");
		b2 = new JButton("TRAIN2");
		b3 = new JButton("TRAIN3");
		b4 = new JButton("TRAIN4");
		b5 = new JButton("PREVIOUS3");
		t1 = new JTextField();
	
		l1.setBounds(50,50,500,100);
		//l2.setBounds(400,300,1000,100);
		b1.setBounds(50,200,300,50);
		b2.setBounds(50,275,300,50);
		b3.setBounds(50,350,300,50);
		b4.setBounds(50,425,300,50);
		b5.setBounds(50,550,300,50);
		t1.setBounds(500,275,300,50);
		l2.setBounds(500,200,600,50);
		
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		l2.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1); 
		b4.setFont(f1);
		b5.setFont(f1);
		t1.setFont(f1);

		


		add(l1);
		add(l2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(t1);

		b1.setBackground(Color.pink);
		b1.setForeground(Color.white);
		b2.setBackground(Color.pink);
		b2.setForeground(Color.white);
		b3.setBackground(Color.pink);
		b3.setForeground(Color.white);
		b4.setBackground(Color.pink);
		b4.setForeground(Color.white);



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
			MyFrame3 mf3 = new MyFrame3();
			mf3.setVisible(true);
	}
}