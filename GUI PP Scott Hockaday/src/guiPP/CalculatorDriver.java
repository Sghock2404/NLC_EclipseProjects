/**Student Name: Scott Hockaday

 *Date Completed: 3/24/19 

 *Project No. 5: GUI PP Calculator

 *Extra Credit: No

 *Project Description: The purpose of this program is display the Calculator program in a JFrame

 **/

package guiPP;

import java.awt.*;
import javax.swing.*;

public class CalculatorDriver {

	public static void main(String[] args) {
		
		//JFrame class for title of frame
		JFrame frame = new JFrame ("Calculator");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,400);
		
		frame.getContentPane().add(new Calculator());
		frame.pack();
		frame.setVisible(true);
		}
}