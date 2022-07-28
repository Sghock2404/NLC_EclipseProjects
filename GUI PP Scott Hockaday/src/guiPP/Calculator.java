/**Student Name: Scott Hockaday

 *Date Completed: 3/24/19 

 *Project No. 5: GUI PP Calculator

 *Extra Credit: No

 *Project Description: The purpose of this program is to create a calculator with 4 basic functions (add, subtract, multiply, divide)
 *using JButton(s), 

 **/

package guiPP;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JPanel 
{
	//private variable declarations and instantiation
	private JTextField equation;
	private double result = 0.0;
	private String count1, count2, sAnswer;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
	private JButton clearButton, decimal, add, subtract, divide, multiply, equal, delete;
	private boolean equalsClicked = false, opChosen = false;
	char operation = ' ';

	//GUI set up
	public Calculator()
	{

		//text field for calculator
		equation = new JTextField(25); //set length for TextField
		equation.setEditable(false); //set to false so TextField can't be edited
		add (equation, BorderLayout.NORTH);

		//set layout, size, background for calculator
		setLayout(new FlowLayout());
		setPreferredSize (new Dimension(300,400));
		setBackground (Color.red);

		//Buttons for calculator, set background color for buttons
		button1 = new JButton ("1");
		button1.setBackground (Color.cyan);
		button2 = new JButton ("2");
		button2.setBackground (Color.cyan);
		button3 = new JButton ("3");
		button3.setBackground (Color.cyan);
		button4 = new JButton ("4");
		button4.setBackground (Color.cyan);
		button5 = new JButton ("5");
		button5.setBackground (Color.cyan);
		button6 = new JButton ("6");
		button6.setBackground (Color.cyan);
		button7 = new JButton ("7");
		button7.setBackground (Color.cyan);
		button8 = new JButton ("8");
		button8.setBackground (Color.cyan);
		button9 = new JButton ("9");
		button9.setBackground (Color.cyan);
		button0 = new JButton ("0");
		button0.setBackground (Color.cyan);

		//Button operations for calculator and background color
		add = new JButton("+");
		add.setBackground (Color.orange);
		subtract = new JButton("-");
		subtract.setBackground (Color.orange);
		multiply = new JButton("*");
		multiply.setBackground (Color.orange);
		divide = new JButton("/");
		divide.setBackground (Color.orange);
		decimal = new JButton(".");
		decimal.setBackground (Color.yellow);
		equal = new JButton("=");
		clearButton = new JButton ("C");
		delete = new JButton ("<--");
		delete.setBackground (Color.gray);

		//Button Listeners for all calculator numbers
		button1.addActionListener(new ButtonListener());
		button2.addActionListener(new ButtonListener());
		button3.addActionListener(new ButtonListener());
		button4.addActionListener(new ButtonListener());
		button5.addActionListener(new ButtonListener());
		button6.addActionListener(new ButtonListener());
		button7.addActionListener(new ButtonListener());
		button8.addActionListener(new ButtonListener());
		button9.addActionListener(new ButtonListener());
		button0.addActionListener(new ButtonListener());
		
		//ButtonListeners for operations
		add.addActionListener(new ButtonListener());
		subtract.addActionListener(new ButtonListener());
		multiply.addActionListener(new ButtonListener());
		divide.addActionListener(new ButtonListener());
		equal.addActionListener(new ButtonListener());
		clearButton.addActionListener(new ButtonListener());
		decimal.addActionListener(new ButtonListener());
		delete.addActionListener(new ButtonListener());

		//add calculator numbers
		add(clearButton);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button0);
		add(decimal);
		add(delete);
		
		//add calculator operations
		add(add);
		add(subtract);
		add(multiply);
		add(divide);
		add(equal);

		//sets dimension or new dimensions for calculator buttons
		Dimension dim = new Dimension(75,25);

		button1.setPreferredSize(dim);
		button2.setPreferredSize(dim);
		button3.setPreferredSize(dim);
		button4.setPreferredSize(dim);
		button5.setPreferredSize(dim);
		button6.setPreferredSize(dim);
		button7.setPreferredSize(dim);
		button8.setPreferredSize(dim);
		button9.setPreferredSize(dim);
		button0.setPreferredSize(new Dimension(125,25));
		decimal.setPreferredSize(new Dimension(50,25));
		clearButton.setPreferredSize(new Dimension(230,25));
		delete.setPreferredSize(new Dimension(55,25));

		//set dimensions or new dimensions for operation buttons
		add.setPreferredSize(new Dimension (113,25));
		subtract.setPreferredSize(new Dimension(113,25));
		multiply.setPreferredSize(new Dimension(113,25));
		divide.setPreferredSize(new Dimension(113,25));
		equal.setPreferredSize(new Dimension(225,25));
	}
	//ButtonListener class that implements the ActionListener
	private class ButtonListener implements ActionListener
	{
		//
		//
		//
		public void actionPerformed(ActionEvent event) {
			JButton src = (JButton) event.getSource(); //getSource() for JButton

			//if-else, else-if, statements for buttons. 1, 2, 3, 4, +, -, etc.
			if(src.equals(button1)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "1";
					}
					else
					{
						count1 = count1 + "1";
					}
				}
				else{
					if(count2==null) {
						count2 = "1";
					}
					else
					{
						count2 = count2 + "1";
					}
				}
			}
			if(src.equals(button2)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "2";
					}
					else
					{
						count1 = count1 + "2";
					}
				}
				else{
					if(count2==null) {
						count2 = "2";
					}
					else
					{
						count2 = count2 + "2";
					}
				}
			}
			if(src.equals(button3)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "3";
					}
					else
					{
						count1 = count1 + "3";
					}
				}
				else{
					if(count2==null) {
						count2 = "3";
					}
					else
					{
						count2 = count2 + "3";
					}
				}
			}
			if(src.equals(button4)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "4";
					}
					else
					{
						count1 = count1 + "4";
					}

				}
				else{
					if(count2==null) {
						count2 = "4";
					}
					else
					{
						count2 = count2 + "4";
					}
				}
			}
			if(src.equals(button5)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "5";
					}
					else
					{
						count1 = count1 + "5";
					}
				}
				else{
					if(count2==null) {
						count2 = "5";
					}
					else
					{
						count2 = count2 + "5";
					}
				}
			}
			if(src.equals(button6)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "6";
					}
					else
					{
						count1 = count1 + "6";
					}
				}
				else{
					if(count2==null) {
						count2 = "6";
					}
					else
					{
						count2 = count2 + "6";
					}
				}
			}
			if(src.equals(button7)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "7";
					}
					else
					{
						count1 = count1 + "7";
					}
				}
				else{
					if(count2==null) {
						count2 = "7";
					}
					else
					{
						count2 = count2 + "7";
					}
				}
			}
			if(src.equals(button8)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "8";
					}
					else
					{
						count1 = count1 + "8";
					}

				}
				else{
					if(count2==null) {
						count2 = "8";
					}
					else
					{
						count2 = count2 + "8";
					}
				}
			}
			if(src.equals(button9)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "9";
					}
					else
					{
						count1 = count1 + "9";
					}
				}
				else{
					if(count2==null) {
						count2 = "9";
					}
					else
					{
						count2 = count2 + "9";
					}
				}
			}
			if(src.equals(button0)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "0";
					}
					else
					{
						count1 = count1 + "0";
					}
				}
				else{
					if(count2==null) {
						count2 = "0";
					}
					else
					{
						count2 = count2 + "0";
					}
				}
			}
			//if-else, else-if statement for decimal
			if(src.equals(decimal)) {
				if(opChosen==false) {
					if(count1 ==null) 
					{
						count1 = "0.";
					}
					else
						if(count1 != null)
							if(count1.contains("."))
							{
								System.out.println("You already have a decimal point!");
							}
							else {
								count1 += ".";
							}
				}
				else{
					if(count2==null) {
						count2 = "0";
					}
					else
						if(count2 != null)
							if(count2.contains("."))
							{
								System.out.println("You halready have a decimal point!");
							}
							else {
								count2 += ".";
							}
				}
			}
			if(equalsClicked == false) {
				if(opChosen==false) {
					equation.setText(count1);
				}else {
					equation.setText(count2);
				}
			}
			//if-else, else-if statement for adding operation
			if(src.equals(add)) {
				if(count1==null) {
					System.out.println("Choose numbers first!");
				}else
					if(count1 != null && count2 == null) {
						opChosen=true;
						operation = '+';
					}else
						if(count1 != null && count2 != null) {
							System.out.println("Two operations only!");
						}
			}
			//if-else, else-if statement for subtracting operation
			if(src.equals(subtract)) {
				if(count1==null) {
					System.out.println("Choose numbers first!");
				}else
					if(count1 != null && count2 == null) {
						opChosen=true;
						operation = '-';
					}else
						if(count1 != null && count2 != null) {
							System.out.println("Two operations only!");
						}
			}
			//if-else, else-if statement for multiply operation
			if(src.equals(multiply)) {
				if(count1==null) {
					System.out.println("Choose numbers first!");
				}else
					if(count1 != null && count2 == null) {
						opChosen=true;
						operation = '*';
					}else
						if(count1 != null && count2 != null) {
							System.out.println("Two operations only!");
						}
			}
			//if-else, else-if statement for divide operation
			if(src.equals(divide)) {
				if(count1==null) {
					System.out.println("Choose numbers first!");
				}else
					if(count1 != null && count2 == null) {
						opChosen=true;
						operation = '/';
					}else
						if(count1 != null && count2 != null) {
							System.out.println("Two operations only!");
						}
			}
			////if-else, else-if statement for equal
			if(src.equals(equal)) {
				if(count1==null) {
					System.out.println("Choose numbers first!");
				}else
					if(count1 != null && count2 == null) {
						opChosen=true;
						operation = '=';
					}else
						if(count1 != null && count2 != null) {
							System.out.println("Chooose BOTH numbers first!");
						}

				if(count1 != null && count2 != null) {
					double d1 = 0.0;
					double d2 = 0.0;
					d1 = Double.parseDouble(count1);
					d2 = Double.parseDouble(count2);

					//switch statement for all operations
					switch(operation){
					case '+': result = d1 + d2;
					break;

					case '-': result = d1 - d2;
					break;

					case '*': result = d1 * d2;
					break;

					case '/': result = d1 / d2;
					break;
					}
					//division operation if number is divided by 0
					sAnswer = Double.toString(result);
					equation.setText(sAnswer);
					if(operation == '/' && d2 == 0.0) {
						equation.setText("UNDEFINED!");
					}
				}
			}
			//if-else, else-if statement for clear button
			if(src.equals(clearButton)) 
			{
				count1 = null;
				count2 = null;
				equalsClicked = false;
				opChosen = false;
				operation = ' ';
				equation.setText(null);
				sAnswer = null;
			}
			//if-else, else-if statement for delete or backspace button
			if(src.equals(delete)) {
				if(opChosen == false) {
					if(count1==null) {
						System.out.println("CAN'T DELETE ANYTHING!");
					}else {
						count1 = count1.substring(0, count1.length() - 1);
					}
				}else {
					if(count2==null) {
						System.out.print("CAN'T DELETE ANYTHING!");
					}else {
						count2 = count2.substring(0, count2.length() - 1);
					}
				}
			}
		}
	}
}