import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame10 extends JFrame
{
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JButton b1,b2;
	Font f1;

	MyActionListener ml = new MyActionListener(this);
	MyFrame10()
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
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        t10 = new JTextField();
        t11 = new JTextField();
        t12 = new JTextField();
        t13 = new JTextField();
		
		b1 = new JButton("CONFIRM");
		b2 = new JButton("SAVE6");
		
		
		
		l1 = new JLabel("YOUR NAME :-");
		l2 = new JLabel("TIME :-");
		l3 = new JLabel("AGE :-");
		l4 = new JLabel("GENDER :-");
		l5 = new JLabel("FROM :-");
        l6 = new JLabel("TO :-");
        l7 = new JLabel("NO OF PERSONS :-");
        l8 = new JLabel("TRAIN NO :-");
        l9 = new JLabel("COACH :-");
        l10 = new JLabel("SEAT NO :-");
        l11 = new JLabel("TIME OF ARRIVAL :-");
        l12 = new JLabel("PRICE :-");

	
		l1.setBounds(50,50,400,50);
		t1.setBounds(50,125,500,50);
		l2.setBounds(600,50,100,50);
		t2.setBounds(600,125,400,50);
		l3.setBounds(50,225,200,50);
		t3.setBounds(160,225,100,50);
		l4.setBounds(310,225,200,50);
		t4.setBounds(520,225,200,50);
		l5.setBounds(50,325,200,50);
		t5.setBounds(260,325,300,50);
		l6.setBounds(610,325,100,50);
        t6.setBounds(720,325,400,50);
        l7.setBounds(50,425,400,50);
        t7.setBounds(430,425,100,50);
        l8.setBounds(50,525,200,50);
        t8.setBounds(260,525,200,50);
        l9.setBounds(510,525,200,50);
        t9.setBounds(720,525,100,50);
        l10.setBounds(870,525,200,50);
        t10.setBounds(1095,525,300,50);
        l11.setBounds(50,625,400,50);
        t11.setBounds(50,700,400,50);
        l12.setBounds(500,625,400,50);
        t12.setBounds(500,700,400,50);
        b1.setBounds(950,625,400,50);
		b2.setBounds(950,700,400,50);

		


		

		
		Font f1 = new Font("Arial",Font.BOLD,26 );
		
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
        t6.setFont(f1);
        l7.setFont(f1);
        t7.setFont(f1);
        l8.setFont(f1);
        t8.setFont(f1);
        l9.setFont(f1);
        t9.setFont(f1);
        l10.setFont(f1);
        l11.setFont(f1);
        l12.setFont(f1);
        t10.setFont(f1);
        t11.setFont(f1);
        t12.setFont(f1);
		b2.setFont(f1);
      //  t13.setFont(f1);
      
    

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
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
      //  add(l13);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
        add(t10);
        add(t11);
        add(t12);
		add(b2);
      //  add(t13);
		
		
		

		b1.addActionListener(ml);	
		b2.addActionListener(ml);	
        t1.addActionListener(ml);	
        t2.addActionListener(ml);	
        t3.addActionListener(ml);	
        t4.addActionListener(ml);	
        t5.addActionListener(ml);	
        t6.addActionListener(ml);		
        t7.addActionListener(ml);	
        t8.addActionListener(ml);	
        t9.addActionListener(ml);	
        t10.addActionListener(ml);	
        t11.addActionListener(ml);
        t12.addActionListener(ml);	

		
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
			MyFrame10 mf10 = new MyFrame10();
			mf10.setVisible(true);
	}
}