import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator implements ActionListener
{
	boolean isOperatorClicked = false,isDelete = false;
	String oldValue, newValue;
	int choice;
	String sum,minus,mul,div,perc;

	float oldValueF, newValueF, result;

	
	JLabel displayLabel;
	JButton sevenButton, eightButton, nineButton, fourButton, fiveButton, sixButton, oneButton, twoButton, threeButton, zeroButton, cButton, plusButton, dotButton, equalButton, minusButton, multiplicationButton, divideButton, percentageButton, deleteButton;
	
	public MyCalculator()
	{
		//Setting Frame
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 650);
		jf.setVisible(true);
		jf.setLocation(400, 100);
		jf.getContentPane().setBackground(Color.darkGray);
		
		
		
		
		//Setting Label
	    displayLabel = new JLabel();
		displayLabel.setBounds(30, 40, 520, 100);
		displayLabel.setBackground(Color.cyan);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setFont(new Font("Arial",Font.BOLD,40));
		displayLabel.setOpaque(true);
		
		jf.add(displayLabel);
		
		
		
		
		//Setting Buttons
		//First row
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 180, 80, 80);
		sevenButton.setFont(new Font("Arial",Font.BOLD,40));
		sevenButton.addActionListener(this);
		
		jf.add(sevenButton);
		
		
		
		eightButton = new JButton("8");
		eightButton.setBounds(140, 180, 80, 80);
		eightButton.setFont(new Font("Arial",Font.BOLD,40));
		eightButton.addActionListener(this);
		
		jf.add(eightButton);
		
		
		
		nineButton = new JButton("9");
		nineButton.setBounds(250, 180, 80, 80);
		nineButton.setFont(new Font("Arial",Font.BOLD,40));
		nineButton.addActionListener(this);
		
		jf.add(nineButton);
		
		
		
		percentageButton = new JButton("%");
		percentageButton.setBounds(360, 180, 80, 80);
		percentageButton.setFont(new Font("Arial",Font.BOLD,30));
		percentageButton.addActionListener(this);
		
		jf.add(percentageButton);
		
		
		
		deleteButton = new JButton("DEL");
		deleteButton.setBounds(470, 180, 80, 80);
		deleteButton.setFont(new Font("Arial",Font.BOLD,20));
		deleteButton.addActionListener(this);
		
		jf.add(deleteButton);

		
		
		//Second Row
		fourButton = new JButton("4");
		fourButton.setBounds(30, 280, 80, 80);
		fourButton.setFont(new Font("Arial",Font.BOLD,40));
		fourButton.addActionListener(this);
		
		jf.add(fourButton);
		
		
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(140, 280, 80, 80);
		fiveButton.setFont(new Font("Arial",Font.BOLD,40));
		fiveButton.addActionListener(this);

		jf.add(fiveButton);
		
		
		
		sixButton = new JButton("6");
		sixButton.setBounds(250, 280, 80, 80);
		sixButton.setFont(new Font("Arial",Font.BOLD,40));
		sixButton .addActionListener(this);

		jf.add(sixButton);
		
		
		
		multiplicationButton = new JButton("X");
		multiplicationButton.setBounds(360, 280, 80, 80);
		multiplicationButton.setFont(new Font("Arial",Font.BOLD,30));
		multiplicationButton.addActionListener(this);
		
		jf.add(multiplicationButton);
		
		
		
		divideButton = new JButton("/");
		divideButton.setBounds(470, 280, 80, 80);
		divideButton.setFont(new Font("Arial",Font.BOLD,40));
		divideButton.addActionListener(this);
		
		jf.add(divideButton);


		
		//Third Row
		oneButton = new JButton("1");
		oneButton.setBounds(30, 380, 80, 80);
		oneButton.setFont(new Font("Arial",Font.BOLD,40));
		oneButton.addActionListener(this);

		jf.add(oneButton);
		
		
		
		twoButton = new JButton("2");
		twoButton.setBounds(140, 380, 80, 80);
		twoButton.setFont(new Font("Arial",Font.BOLD,40));
		twoButton.addActionListener(this);

		jf.add(twoButton);
		
		
		
		threeButton = new JButton("3");
		threeButton.setBounds(250, 380, 80, 80);
		threeButton.setFont(new Font("Arial",Font.BOLD,40));
		threeButton.addActionListener(this);

		jf.add(threeButton);
		
		
		
		minusButton = new JButton("-");
		minusButton.setBounds(360, 380, 80, 80);
		minusButton.setFont(new Font("Arial",Font.BOLD,40));
		minusButton.addActionListener(this);
		
		jf.add(minusButton);
		
		
		
		equalButton = new JButton("=");
		equalButton.setBounds(470, 380, 80, 180);
		equalButton.setFont(new Font("Arial",Font.BOLD,40));
		equalButton.addActionListener(this);
		
		jf.add(equalButton);
		
		
		//Fourth Row
		cButton = new JButton("c");
		cButton.setBounds(30, 480, 80, 80);
		cButton.setFont(new Font("Arial",Font.BOLD,40));
		cButton.setBackground(Color.orange);
		cButton.addActionListener(this);
		
		jf.add(cButton);
		
		
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(140, 480, 80, 80);
		zeroButton.setFont(new Font("Arial",Font.BOLD,40));
		zeroButton.addActionListener(this);

		jf.add(zeroButton);
		
		
		
		dotButton = new JButton(".");
		dotButton.setBounds(250, 480, 80, 80);
		dotButton.setFont(new Font("Arial",Font.BOLD,40));
		dotButton.addActionListener(this);
		
		jf.add(dotButton);
		

		
		plusButton = new JButton("+");
		plusButton.setBounds(360, 480, 80, 80);
		plusButton.setFont(new Font("Arial",Font.BOLD,40));
		plusButton.addActionListener(this);
		
		jf.add(plusButton);
		
		
		
		
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	//Perform actions
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == sevenButton )
		{
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if(e.getSource() == eightButton)
		{
			displayLabel.setText(displayLabel.getText()+"8");
		}
		else if(e.getSource() == nineButton)
		{
			displayLabel.setText(displayLabel.getText()+"9");
		}
		else if(e.getSource() == fourButton)
		{
			displayLabel.setText(displayLabel.getText()+"4");
		}
		else if(e.getSource() == fiveButton)
		{
			displayLabel.setText(displayLabel.getText()+"5");
		}
		else if(e.getSource() == sixButton)
		{
				displayLabel.setText(displayLabel.getText()+"6");
		}
		else if(e.getSource() == oneButton)
		{	
			displayLabel.setText(displayLabel.getText()+"1");
		}
		else if(e.getSource() == twoButton)
		{
			displayLabel.setText(displayLabel.getText()+"2");
		}
		else if(e.getSource() == threeButton)
		{
			displayLabel.setText(displayLabel.getText()+"3");
		}
		else if(e.getSource() == zeroButton)
		{
			displayLabel.setText(displayLabel.getText()+"0");
		}
		else if(e.getSource() == dotButton)
		{
			displayLabel.setText(displayLabel.getText() + ".");
		}
		else if(e.getSource() == cButton)
		{
			displayLabel.setText("");
		}
		
		else if(e.getSource()== deleteButton)
		{
			String element = displayLabel.getText();
			int length = element.length();
			
			for(int i=length; i >= 0; i--)
			{
				displayLabel.setText(element.substring(0,length-1));
			}
			element = displayLabel.getText();
		}

		
		
		
		//Operators
		
		else if(e.getSource() == plusButton)
		{ 
			choice = 1;
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			displayLabel.setText(oldValue + "+");
		}
		else if(e.getSource() == minusButton)
		{
			choice = 2;
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			displayLabel.setText(oldValue + "-");
		}
		else if(e.getSource() == multiplicationButton)
		{
			choice = 3;
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			displayLabel.setText(oldValue + "*");
		}
		else if(e.getSource() == divideButton)
		{
			choice = 4;
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			displayLabel.setText(oldValue + "/");
		}
		else if(e.getSource() == percentageButton)
		{
			choice = 5;
			isOperatorClicked = true;
			oldValue = displayLabel.getText();
			displayLabel.setText(oldValue + "%");
		}
		
		
		//result
		
		else if(e.getSource() == equalButton)
		{		
			
			switch(choice)
			{
			case 1:
				sum = displayLabel.getText();
		        String[] added = sum.split("\\+");
		        if(added.length > 0)
				{
					for(int i=1; i < added.length; i++)
					{
						result = Float.parseFloat(added[0]);
						result = result + Float.parseFloat(added[i]);
					}
				}
		        displayLabel.setText(Float.toString(result));
				break;
			case 2:
				minus = displayLabel.getText();
				String[] difference = minus.split("\\-");
				
				if(difference.length > 0)
				{
					for(int i=1; i < difference.length; i++)
					{
						result = Float.parseFloat(difference[0]);
						result = result - Float.parseFloat(difference[i]);
					}
				}
				
				displayLabel.setText(Float.toString(result));
				
				break;
			case 3:
					mul = displayLabel.getText();
					String[] product = mul.split("\\*");

					for(String pro : product)
					{
						result = Float.parseFloat(product[0]);
						result = result * Float.parseFloat(pro);
					}
					displayLabel.setText(Float.toString(result));
					break;	
					
			case 4:
			    div = displayLabel.getText();
			    String[] division = div.split("\\/");
			    result = 0;

			    if (division.length > 0) 
			    {
			        for (int i = 1; i < division.length; i++) 
			        {
				        result = Float.parseFloat(division[0]);

			            if (Float.parseFloat(division[i]) != 0) 
			            {
			                result = result / Float.parseFloat(division[i]);
			            } 
			            else 
			            {
			                displayLabel.setText("Error: Division by zero");
			                return;
			            }
			        }
			    } 

			    displayLabel.setText(Float.toString(result));
			    break;
			    
				case 5:
					perc = displayLabel.getText();
					String[] percentage = perc.split("\\%");
					result = 0;

					if(percentage.length > 0)
					{
						for(int i = 1; i < percentage.length; i++)
						{
							result = Float.parseFloat(percentage[0]);

							if(Float.parseFloat(percentage[i]) != 0)
							{
								result = (result/100) * Float.parseFloat(percentage[i]);
							}
						}
					}
					displayLabel.setText(Float.toString(result));
					break;
			}			
		}
		
	}
	
	public static void main(String args[])
	{
		MyCalculator c = new MyCalculator();
	}
}