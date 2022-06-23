import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame1 extends JFrame
{
	JTextField t1,t2,t3,t4,t5,t6;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2,b3;
	Font f1;
	//Checkbox c1,c2;
//	CheckboxGroup cb1;
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame1()
	{
		super("ENTER YOUR INFORMATION");
		setLayout(null);
		setBounds(0,0,1600,2000);
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		
		b1 = new JButton("NEXT1");
		b2 = new JButton("SAVE1");
		b3 = new JButton("PREVIOUS1");
		
		
		l1 = new JLabel("ENTER YOUR FULL NAME");
		l2 = new JLabel("ENTER YOUR MOBILE NUMBER");
		l3 = new JLabel("ENTER YOUR GMAIL ADDRESS");
		l4 = new JLabel("HOW MANY PERSONS");
		l5 = new JLabel("ENTER YOUR AGE");
		l6 = new JLabel("ENTER YOUR GENDER");	
		
		
	//	cb1 = new CheckboxGroup();
	//	c1 = new Checkbox("Male",cb1,false);
	//	c2 = new Checkbox("Female",cb1,false);
	
		l1.setBounds(50,50,600,50);
		t1.setBounds(50,125,400,50);
		l2.setBounds(50,225,600,50);
		t2.setBounds(50,300,400,50);
		l3.setBounds(50,400,600,50);
		t3.setBounds(50,475,700,50);
		l4.setBounds(650,50,300,50);
		t4.setBounds(650,125,200,50);
		b1.setBounds(50,700,300,50);
		b2.setBounds(350,700,300,50);
		l5.setBounds(650,225,500,50);
		t5.setBounds(650,300,200,50);
		l6.setBounds(800,400,400,50);
		t6.setBounds(800,475,200,50);

		//c1.setBounds(800,475,200,50);
		//c2.setBounds(800,550,200,50);
		b3.setBounds(650,700,300,50);


		

		
		Font f1 = new Font("Arial",Font.BOLD,28  );
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		t1.setFont(f1);
		t2.setFont(f1);
		t3.setFont(f1);
		b1.setFont(f1);
		t4.setFont(f1);
		l5.setFont(f1);
		t5.setFont(f1);
		l6.setFont(f1);
	//	c1.setFont(f1);
	//	c2.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		t6.setFont(f1);
		
		


		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(b1);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
	//	add(c1);
	//	add(c2);
		add(b2);
		add(b3);
		add(t6);

		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setBackground(Color.green);
		b2.setForeground(Color.white);
		b3.setBackground(Color.red);
		b3.setForeground(Color.white);

		l1.setForeground(Color.black);
		l2.setForeground(Color.red);
		l3.setForeground(Color.blue);
		l4.setForeground(Color.black);
		l5.setForeground(Color.red);
		l6.setForeground(Color.blue);
		
		

		b1.addActionListener(ml);	
		b2.addActionListener(ml);	
		b3.addActionListener(ml);	
	//	c1.addItemListener(ml);	
	//	c2.addItemListener(ml);	
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					//System.exit(0);
					setVisible(false);
				}
			});
	}
	public static void main(String args[])
	{
			MyFrame1 mf1 = new MyFrame1();
			mf1.setVisible(true);
	}
}