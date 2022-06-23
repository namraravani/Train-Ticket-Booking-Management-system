import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame5 extends JFrame
{
	
	JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2;
	Font f1;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame5()
	{
		super("Payment Frame");
		setLayout(null);
		setBounds(0,0,1600,1000);

        t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
        t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		
		l1 = new JLabel("Enter How Many Persons");
		l2 = new JLabel("You Want To Travel From :-");
        l3 = new JLabel("TO:-");
		l5 = new JLabel("ENTER THE KILOMETER");
		l6 = new JLabel("FINAL PRICE IS IS :- ");
		b1 = new JButton("NEXT5");
		b2 = new JButton("CALCULATE");



		l1.setBounds(50,50,500,50);
        t1.setBounds(50,125,500,50);
		l2.setBounds(50,200,500,50);
        t2.setBounds(50,275,300,50);
        l3.setBounds(50,350,300,50);
        t4.setBounds(50,425,300,50);
		b1.setBounds(50,500,500,50);
		l5.setBounds(600,50,500,50);
		t5.setBounds(600,125,500,50);
		l6.setBounds(600,225,500,50);
		t6.setBounds(600,300,500,50);
		b2.setBounds(600,375,500,50);
		
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,30);
		
		l1.setFont(f1);
		l2.setFont(f1);
        l3.setFont(f1);
        t1.setFont(f1);
        t2.setFont(f1);
        t3.setFont(f1);
        t4.setFont(f1);
		b1.setFont(f1);
		t5.setFont(f1);
		t6.setFont(f1);
		b2.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		


		add(l1);
		add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
		add(b1);
		add(t5);
		add(t6);
		add(b2);
		add(l6);
		add(l5);


		b1.addActionListener(ml);
		b2.addActionListener(ml);

		 b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setForeground(Color.white);
		//b3.setBackground(Color.red);
		//b3.setForeground(Color.white);

		t1.setForeground(Color.black);
		t2.setForeground(Color.red);
		t3.setForeground(Color.blue);
		t4.setForeground(Color.black);
		t5.setForeground(Color.red);
		t6.setForeground(Color.blue);

		

		
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
			MyFrame5 mf5 = new MyFrame5();
			mf5.setVisible(true);
	}
}