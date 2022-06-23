import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame4 extends JFrame
{
	JLabel l1;
    Font f1_4;
    Font f2; 
	JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame4()
	{
		super("ENTER YOUR INFORMATION");
		setLayout(null);
		setBounds(0,0,1600,2000);
		
		
		c31 = new JButton("NEXT1");
		c32 = new JButton("SAVE");
		
		l1 = new JLabel("SELECT YOUR SEATS :-");
		
		
		
	
		c1 = new JButton("S1");
		c2 = new JButton("S2");
    	c3 = new JButton("S3");
    	c4 = new JButton("S4");
        c5 = new JButton("S5");
        c6 = new JButton("S6");
        c7 = new JButton("S7");
        c8 = new JButton("S8");
        c9 = new JButton("S9");
        c10 = new JButton("S10");
        c11 = new JButton("S11");
        c12 = new JButton("S12");
        c13 = new JButton("S13");
        c14 = new JButton("S14");
        c15 = new JButton("S15");
        c16 = new JButton("S16");
		c17 = new JButton("S17");
    	c18 = new JButton("S18");
    	c19 = new JButton("S19");
        c20 = new JButton("S20");
        c21 = new JButton("S21");
        c22 = new JButton("S22");
        c23 = new JButton("S23");
        c24 = new JButton("S24");
        c25 = new JButton("S25");
        c26 = new JButton("S26");
        c27 = new JButton("S27");
        c28 = new JButton("S28");
        c29 = new JButton("S29");
        c30 = new JButton("S30");
	
		  l1.setBounds(50,50,600,50);
          c1.setBounds(50,100,60,50);
          c2.setBounds(50,175,60,50);
          c3.setBounds(50,250,60,50);
          c4.setBounds(50,325,60,50);
          c5.setBounds(50,400,60,50);
          c6.setBounds(50,475,60,50);
          c7.setBounds(50,550,60,50);
          c8.setBounds(50,625,60,50);
          c9.setBounds(50,700,60,50);
         c10.setBounds(50,755,60,50);
        c11.setBounds(200,100,60,50);
        c12.setBounds(200,175,60,50);
        c13.setBounds(200,250,60,50);
        c14.setBounds(200,325,60,50);
        c15.setBounds(200,400,60,50);
        c16.setBounds(200,475,60,50);
        c17.setBounds(200,550,60,50);
        c18.setBounds(200,625,60,50);
        c19.setBounds(200,700,60,50);
        c20.setBounds(200,755,60,50);
        c21.setBounds(275,100,60,50);
        c22.setBounds(275,175,60,50);
        c23.setBounds(275,250,60,50);
        c24.setBounds(275,325,60,50);
        c25.setBounds(275,400,60,50);
        c26.setBounds(275,475,60,50);
        c27.setBounds(275,550,60,50);
        c28.setBounds(275,625,60,50);
        c29.setBounds(275,700,60,50);
        c30.setBounds(275,755,60,50);
        c31.setBounds(400,50,200,50);
        c32.setBounds(400,300,200,50);
		
		
		Font f1_4 = new Font("Arial",Font.BOLD,28);
        Font f2 = new Font("Arial",Font.BOLD,10);
		
		l1.setFont(f1_4);
		c1.setFont(f2);
        c2.setFont(f2);
        c3.setFont(f2);
        c4.setFont(f2);
        c5.setFont(f2);
        c6.setFont(f2);
        c7.setFont(f2);
        c8.setFont(f2);
        c9.setFont(f2);
        c10.setFont(f2);
        c11.setFont(f2);
        c12.setFont(f2);
        c13.setFont(f2);
        c14.setFont(f2);
        c15.setFont(f2);
        c16.setFont(f2);
        c17.setFont(f2);
        c18.setFont(f2);
        c19.setFont(f2);
        c20.setFont(f2);
        c21.setFont(f2);
        c22.setFont(f2);
        c23.setFont(f2);
        c24.setFont(f2); 
        c25.setFont(f2);
        c26.setFont(f2);
        c27.setFont(f2);
        c28.setFont(f2);
        c29.setFont(f2);
        c30.setFont(f2);
        c31.setFont(f2);
        c32.setFont(f2);

        add(l1);
		add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
        add(c9);
        add(c10);
        add(c11);
        add(c12);
        add(c13);
        add(c14);
        add(c15);
        add(c16);
        add(c17);
        add(c18);
        add(c19);
        add(c20);
        add(c21);
        add(c22);
        add(c23);
        add(c24);
        add(c25);
        add(c26);
        add(c27);
        add(c28);
        add(c29);
        add(c30);
        add(c31);
        add(c32);

        c1.setBackground(Color.blue);
		c1.setForeground(Color.white);
		
			
		
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
			MyFrame4 mf4 = new MyFrame4();
			mf4.setVisible(true);
	}
}