
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.*;

public class MyActionListener implements ActionListener 
{
	
	MyFrame mf;
	MyFrame1 mf1;
	MyFrame2 mf2;
	MyFrame3 mf3;
	MyFrame4 mf4;
	MyFrame5 mf5;
	MyFrame6 mf6;
	MyFrame7 mf7;
	MyFrame8 mf8;
	MyFrame9 mf9;
	MyFrame10 mf10;
	MyFrame11 mf11;
	
	
	MyActionListener(MyFrame m)
    {
		this.mf = m;
	} 

    	MyActionListener(MyFrame1 m)
    {
		this.mf1 = m;

	}
		MyActionListener(MyFrame2 m)
    {
		this.mf2 = m;
	}

		MyActionListener(MyFrame3 m)
    {
		this.mf3 = m;
	}

		MyActionListener(MyFrame4 m)
    {
		this.mf4 = m;
	}

		MyActionListener(MyFrame5 m)
    {
		this.mf5 = m;
	}

		MyActionListener(MyFrame6 m)
    {
		this.mf6 = m;
	}

		MyActionListener(MyFrame7 m)
    {
		this.mf7 = m;
	}

		MyActionListener(MyFrame8 m)
	{
		this.mf8 = m;
	}

		MyActionListener(MyFrame9 m)
	{
		this.mf9 = m;
	}

		MyActionListener(MyFrame10 m)
	{
		this.mf10 = m;
	}

		MyActionListener(MyFrame11 m)
	{
		this.mf11 = m;
	}


	static String a1;
	static String a2;
	static String a3;
	static String a4;
	static String a5;
	static String a6;
	static String selectedValue1;
	static String selectedValue2;
	static String selectedValue5;
	static int selectedValue4;
	static String selectedValue6;
    static int selectedValue7;
	static String selectedValue8;
	static String select1;
	static String select2;
	static String select3;
	static String select4;
	static String select5;
	static String select6;
	static String select7;
	static String select8;
	static String select9;
	static String select10;
	static String select11;
	static String select12;
	static String select13;
	static String select14;
	static String select15;
	static String b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	/*public void itemStateChanged(ItemEvent e) 
	{

        


	
		if(e.getItem().toString()=="Male")
		{
			
			try
			{
			FileWriter fw = new FileWriter("data.txt");
			fw.write("Male");
			fw.close();
        
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}

		if(e.getItem().toString()=="Female")
		{
			
			try
			{
			FileWriter fw = new FileWriter("data.txt");
			fw.write("Female");
			fw.close();
        
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}
		

	}*/
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("NEXT"))
        {

            mf1 = new MyFrame1();
            this.mf1.setVisible(true);
			this.mf.setVisible(false);
		//	selectedValue6 = this.mf1.t4.getText();
			
	
			
        }

		if(e.getActionCommand().equals("NEXT1"))
        {
            mf2 = new MyFrame2();
            this.mf2.setVisible(true);
			this.mf1.setVisible(false);	
			selectedValue6 = this.mf1.t4.getText();
			select1 = this.mf1.t1.getText();
			select9 = this.mf1.t2.getText();
			select10 = this.mf1.t6.getText();
			select14 = this.mf1.t5.getText();
			selectedValue7 = Integer.parseInt(selectedValue6);

        }

		if(e.getActionCommand().equals("SAVE1"))
		{
			a1 = this.mf1.t1.getText();
			a2 = this.mf1.t2.getText();
			a3 = this.mf1.t3.getText();
			a4 = this.mf1.t4.getText();
			a5 = this.mf1.t5.getText();
			a6 = this.mf1.t6.getText();
			
			try
			{
				FileWriter fw = new FileWriter("data.txt");
				fw.write("NAME :-"+a1);
				fw.write("\n");
				fw.write("MOBILE NUMBER :-"+a2);
				fw.write("\n");
				fw.write("YOUR GMAIL :-"+a3);
				fw.write("\n");
				fw.write("NO OF PERSONS :-"+a4);
				fw.write("\n");
				fw.write("AGE :-"+a5);
				fw.write("\n");
				fw.write("GENDER :-"+a6);

							
				fw.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);

			}
		}

		if(e.getActionCommand().equals("NEXT2"))
        {
			selectedValue1 = this.mf2.comboBox1.getSelectedItem().toString();
			selectedValue2 = this.mf2.comboBox3.getSelectedItem().toString();
			select13 = this.mf2.comboBox2.getSelectedItem().toString();

			int index1, index2;
			index1 = this.mf2.comboBox1.getSelectedIndex();
			index2 = this.mf2.comboBox3.getSelectedIndex();

			if(index1==1)
			{

				if(index2==1)
				{
		
				}
			}

            mf3 = new MyFrame3();
            this.mf3.setVisible(true);
			this.mf2.setVisible(false);


	
        }

		if(e.getActionCommand().equals("NEXT3"))
        {
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf3.setVisible(false);
        }

		if(e.getActionCommand().equals("NEXT4"))
        {
            mf5 = new MyFrame5();
			this.mf5.t2.setText(selectedValue1);
			this.mf5.t4.setText(selectedValue2);
			this.mf5.t1.setText(selectedValue6);;
            this.mf5.setVisible(true);
			this.mf7.setVisible(false);
			
        }

		if(e.getActionCommand().equals("NEXT5"))
        {
            mf10 = new MyFrame10();
			this.mf10.t1.setText(select1);
			this.mf10.t4.setText(select10);
			this.mf10.t11.setText(select13);
			this.mf10.t7.setText(selectedValue6);
			this.mf10.t5.setText(selectedValue1);
			this.mf10.t6.setText(selectedValue2);
			this.mf10.t3.setText(select14);
			this.mf10.t8.setText(selectedValue8);
			this.mf10.t9.setText(select5);
			this.mf10.t12.setText(select15);
			
            this.mf10.setVisible(true);
			this.mf5.setVisible(false);


			

        }

		if(e.getActionCommand().equals("SAVE6"))
		{
			b1 = this.mf10.t1.getText();
			b2 = this.mf10.t2.getText();
			b3 = this.mf10.t3.getText();
			b4 = this.mf10.t4.getText();
			b5 = this.mf10.t5.getText();
			b6 = this.mf10.t6.getText();
			b7 = this.mf10.t7.getText();
			b8 = this.mf10.t8.getText();
			b9 = this.mf10.t9.getText();
			b10 = this.mf10.t10.getText();
			b11 = this.mf10.t11.getText();
			b12 = this.mf10.t12.getText();

			try
			{
				FileWriter fw = new FileWriter("Info.txt");
				fw.write("NAME :-"+b1);
				fw.write("\n");
				fw.write("TIME :-"+b2);
				fw.write("\n");
				fw.write("AGE :-"+b3);
				fw.write("\n");
				fw.write("GENDER :-"+b4);
				fw.write("\n");
				fw.write("FROM :-"+b5);
				fw.write("\n");
				fw.write("TO:-"+b6);
				fw.write("\n");
				fw.write("NO OF PERSONS:-"+b7);
				fw.write("\n");
				fw.write("TRAIN NO:-"+b8);
				fw.write("\n");
				fw.write("COACH NO:-"+b9);
				fw.write("\n");
				fw.write("SEAT NO:-"+b10);
				fw.write("\n");
				fw.write("TIME OF ARRIVAL :-"+b11);
				fw.write("\n");
				fw.write("PRICE :-"+b12);
				fw.write("\n");
							
				fw.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);

			}
		}

		if(e.getActionCommand().equals("CALCULATE"))
        {
			selectedValue5 = this.mf5.t5.getText();
			selectedValue4 = Integer.parseInt(selectedValue5);
			
			//this.mf5.t6.setText();
			this.mf5.t6.setText(new Integer(new Integer(selectedValue4*selectedValue7*2)).toString());
			select15 = this.mf5.t6.getText();
        }

		if(e.getActionCommand().equals("TRAIN1"))
        {

			selectedValue8 = this.mf3.t1.getText();
            mf6 = new MyFrame6();

            this.mf6.setVisible(true);
			this.mf3.setVisible(false);
        }

		if(e.getActionCommand().equals("TRAIN2"))
        {
			selectedValue8 = this.mf3.t1.getText();
			select2 = "T2";
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf3.setVisible(false);
        }

		if(e.getActionCommand().equals("TRAIN3"))
        {
			selectedValue8 = this.mf3.t1.getText();
			select3 = "T3";
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf3.setVisible(false);
        }

		if(e.getActionCommand().equals("TRAIN4"))
        {
			selectedValue8 = this.mf3.t1.getText();
			select4 = "T4";
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf3.setVisible(false);
        }
		
		if(e.getActionCommand().equals("SLEEPER COACH"))
        {
			select5 = this.mf6.t1.getText();
            mf7 = new MyFrame7();
            this.mf7.setVisible(true);
			this.mf6.setVisible(false);
        }

		if(e.getActionCommand().equals("AC COACH"))
        {
			select5 = this.mf6.t1.getText();
			select5 = "AC COACH";
            mf8 = new MyFrame8();
            this.mf8.setVisible(true);
			this.mf6.setVisible(false);
        }

		if(e.getActionCommand().equals("RESERVATION COACH"))
        {
			select5 = this.mf6.t1.getText();
			select5 = "RESERVATION COACH";
            mf9 = new MyFrame9();
            this.mf9.setVisible(true);
			this.mf6.setVisible(false);
        }

		if(e.getActionCommand().equals("GENERAL COACH"))
    	{
			select5 = this.mf6.t1.getText();
			select6 = "GENERAL COACH" ;
            mf5 = new MyFrame5();
            this.mf5.setVisible(true);
			this.mf6.setVisible(false);
        }

		

		if(e.getActionCommand().equals("PREVIOUS1"))
        {
            mf = new MyFrame();
            this.mf.setVisible(true);
			this.mf1.setVisible(false);	
        }

	

		if(e.getActionCommand().equals("PREVIOUS2"))
        {
            mf1 = new MyFrame1();
            this.mf1.setVisible(true);
			this.mf2.setVisible(false);	
        }

		if(e.getActionCommand().equals("PREVIOUS3"))
        {
            mf2 = new MyFrame2();
            this.mf2.setVisible(true);
			this.mf3.setVisible(false);	

        }

		if(e.getActionCommand().equals("BACK1"))
        {
            mf3 = new MyFrame3();
            this.mf3.setVisible(true);
			this.mf6.setVisible(false);	
        }

		if(e.getActionCommand().equals("BACK2"))
        {
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf8.setVisible(false);	
        }

		if(e.getActionCommand().equals("BACK3"))
        {
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf9.setVisible(false);	
        }

		if(e.getActionCommand().equals("BACK4"))
        {
            mf6 = new MyFrame6();
            this.mf6.setVisible(true);
			this.mf7.setVisible(false);	
        }

		if(e.getActionCommand().equals("CONFIRM"))
        {
            mf11 = new MyFrame11();
            this.mf11.setVisible(true);
			this.mf10.setVisible(false);	
        }

		
		String str1 = this.mf2.t1.getText();
		String str2 = this.mf2.t2.getText();

		
		if(e.getActionCommand().equals("ADD"))
		{
			this.mf2.comboBox1.addItem(str1);

		}

			if(e.getActionCommand().equals("ADD1"))
		{
			this.mf2.comboBox3.addItem(str2);
		}

		if(e.getSource()==mf2.comboBox1)
		{
			mf2.comboBox3.removeItem(mf2.comboBox1.getSelectedItem());	
		}
		
        }

		
	}
