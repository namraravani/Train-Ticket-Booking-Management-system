import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame2 extends JFrame 
{

 JComboBox comboBox1,comboBox2,comboBox3;
 MyActionListener ml = new MyActionListener(this);
 


 JFrame f;
 JLabel l1,l2,l3;
 JButton b1,b2,b3,b4,b5;
 JTextField t1,t2;

 
 MyFrame2()
 {

    f=new JFrame("Train Selection");  

    l1 = new JLabel("ENTER THE CITY FROM YOU NEED TO GO OR ADD CITY");
    l2 = new JLabel("ENTER THE TIME IN WHICH YOU NEED TO GO");
    l3 = new JLabel("ENTER THE CITY WHERE YOU NEED TO GO OR ADD CITY");
    b1 = new JButton("SAVE2");
    b2 = new JButton("NEXT2");
    b3 = new JButton("PREVIOUS2");
    b4 = new JButton("ADD");
    b5 = new JButton("ADD1");
    t1 = new JTextField();
    t2 = new JTextField();

 

  
  String[] CITY = {"AHMEDABAD","SURAT","VADODARA","BHAVNAGAR","RAJKOT","JUNAGADH","MORBI","PORBANDAR"};
  String[] TRAIN_TYPE = {"9:30","10:30","11:30","12:00","12:30","1:00"};
  String[] CITY2 = {"AHMEDABAD","SURAT","VADODARA","BHAVNAGAR","RAJKOT","JUNAGADH","MORBI","PORBANDAR"};
  
  comboBox1 = new JComboBox(CITY);
  comboBox2 = new JComboBox(TRAIN_TYPE);
  comboBox3 = new JComboBox(CITY2);
 


   l1.setBounds(50,50,900,50);
   comboBox1.setBounds(50,125,500,50);
   l2.setBounds(50,225,900,50);
   comboBox2.setBounds(50,300,500,50);
   l3.setBounds(50,400,900,50);
   comboBox3.setBounds(50,475,500,50);
   b1.setBounds(50,600,200,50);
   b2.setBounds(250,600,200,50);
   b3.setBounds(450,600,200,50);
   b4.setBounds(650,600,200,50);
   b5.setBounds(850,600,200,50);
   t2.setBounds(750,475,200,50);
   t1.setBounds(750,125,200,50);


  comboBox1.addActionListener(ml);
  comboBox2.addActionListener(ml);
  comboBox3.addActionListener(ml);
  b2.addActionListener(ml);
  b3.addActionListener(ml);
  b4.addActionListener(ml);
  b5.addActionListener(ml);
  t1.addActionListener(ml);
  t2.addActionListener(ml);
  

  this.add(comboBox1);
  this.add(comboBox2);
  this.add(comboBox3);
  this.add(l1);
  this.add(l2);
  this.add(l3);
  this.add(b1);
  this.add(b2);
  this.add(b3);
  this.add(b4);
  this.add(t1);
  this.add(t2);
  this.add(b5);
  
  f.add(comboBox1);
  f.add(comboBox2);
  f.add(comboBox3);
  f.add(l1);
  f.add(l2);
  f.add(l3);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(t1);
  f.add(t2);


  Font f1 = new Font("Arial",Font.BOLD,28  );

  l1.setFont(f1);
  l2.setFont(f1);
  l3.setFont(f1);
  comboBox1.setFont(f1);
  comboBox2.setFont(f1);
  comboBox3.setFont(f1);
  b3.setFont(f1);
  b4.setFont(f1);
  t1.setFont(f1);
  t2.setFont(f1);
  b5.setFont(f1);

  b1.setBackground(Color.green);
  b1.setForeground(Color.white);
  b2.setBackground(Color.blue);
  b2.setForeground(Color.white);
  b3.setBackground(Color.red);
  b3.setForeground(Color.white);
  b4.setBackground(Color.black);
  b4.setForeground(Color.white);
  b5.setBackground(Color.pink);
  b5.setForeground(Color.white);

   l1.setForeground(Color.black);
    l2.setForeground(Color.red);
     l3.setForeground(Color.blue);
  

  this.pack();
  this.setVisible(true);

  addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
          setVisible(false);
				}
			});
	f.setLayout(null);  
   f.setSize(1600,2000);  
   f.setVisible(true); 
 }
 
 
public static void main(String args[])
	{
		MyFrame2 mf2 = new MyFrame2();
    mf2.setVisible(true);
	}

}