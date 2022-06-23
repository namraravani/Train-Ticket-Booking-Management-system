import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame11 extends JFrame
{
	
	JLabel l1,l2;
	Font f1;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame11()
	{
		super("Ticket Booking");
		setLayout(null);
		setBounds(0,0,1600,1000);
		
		l1 = new JLabel("CONGRATULATIONS !!");
		l2 = new JLabel("YOUR TICKETS HAS BEEN BOOKED SUCESSFULLY !!");
		
		l1.setBounds(50,200,500,100);
        l2.setBounds(50,450,1100,100);
		
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
        l2.setFont(f1);
		
		


		add(l1);
        add(l2);
	


		

		
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
			MyFrame11 mf11 = new MyFrame11();
			mf11.setVisible(true);
	}
}