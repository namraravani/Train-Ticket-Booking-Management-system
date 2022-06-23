import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyFrame8 extends JFrame
{
	JLabel l1,l2;
    JTextField t1;
    Font f1_4;
    Font f2; 
	JButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32;
	
	
	MyActionListener ml = new MyActionListener(this);
	MyFrame8()
	{
		super("ENTER YOUR INFORMATION");
		setLayout(null);
		setBounds(0,0,1600,2000);
		
		
		c31 = new JButton("NEXT4");
		c32 = new JButton("BACK2");
        t1 = new JTextField();
		
		l1 = new JLabel("SELECT YOUR SEATS IN AC COACH  :-");
        l2 = new JLabel("ALSO WRITE SEATS NO HERE WHICH YOU HAVE SELECTED :-");
		
		
		
	
		c1 = new JButton("A1");
		c2 = new JButton("A2");
    	c3 = new JButton("A3");
    	c4 = new JButton("A4");
        c5 = new JButton("A5");
        c6 = new JButton("A6");
        c7 = new JButton("A7");
        c8 = new JButton("A8");
        c9 = new JButton("A9");
        c10 = new JButton("A10");
        c11 = new JButton("A11");
        c12 = new JButton("A12");
        c13 = new JButton("A13");
        c14 = new JButton("A14");
        c15 = new JButton("A15");
        c16 = new JButton("A16");
		c17 = new JButton("A17");
    	c18 = new JButton("A18");
    	c19 = new JButton("A19");
        c20 = new JButton("A20");
        c21 = new JButton("A21");
        c22 = new JButton("A22");
        c23 = new JButton("A23");
        c24 = new JButton("A24");
        c25 = new JButton("A25");
        c26 = new JButton("A26");
        c27 = new JButton("A27");
        c28 = new JButton("A28");
        c29 = new JButton("A29");
        c30 = new JButton("A30");

	
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
        c31.setBounds(400,100,200,50);
        c32.setBounds(400,300,200,50);
        l2.setBounds(400,400,500,50);
        t1.setBounds(400,475,300,50);
		
		
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
        l2.setFont(f2);
        t1.setFont(f2);

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
        add(l2);
        add(t1);

        c31.addActionListener(ml);	
        c32.addActionListener(ml);

         c1.setBackground(Color.blue);
        c2.setBackground(Color.blue);
        c3.setBackground(Color.blue);
        c4.setBackground(Color.blue);
        c5.setBackground(Color.blue);
        c6.setBackground(Color.blue);
        c7.setBackground(Color.blue);
        c8.setBackground(Color.blue);
        c9.setBackground(Color.blue);
        c10.setBackground(Color.blue);
        c11.setBackground(Color.blue);
        c12.setBackground(Color.blue);
        c13.setBackground(Color.blue);
        c14.setBackground(Color.blue);
        c15.setBackground(Color.blue);
        c16.setBackground(Color.blue);
        c17.setBackground(Color.blue);
        c18.setBackground(Color.blue);
        c19.setBackground(Color.blue);
        c20.setBackground(Color.blue);
        c21.setBackground(Color.blue);
        c22.setBackground(Color.blue);
        c23.setBackground(Color.blue);
        c24.setBackground(Color.blue);
        c25.setBackground(Color.blue);
        c26.setBackground(Color.blue);
        c27.setBackground(Color.blue);
        c28.setBackground(Color.blue);
        c29.setBackground(Color.blue);
        c30.setBackground(Color.blue);	
			
		
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

        
			MyFrame8 mf8 = new MyFrame8();
			mf8.setVisible(true);
	}

    
}

