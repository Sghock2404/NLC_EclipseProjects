/**Student Name: Scott Hockaday

 *Date Completed: 2/14/19 

 *Project No. 2: Chapter 8 PP

 *Extra Credit: Yes (1-4)

 *Project Description: The purpose of this program is to create a 2-Dimensional array and display that array in a table with values
 *created by the user. It will also determine the average of said salaries of the jobs that that are given and calculate the different
 *raises that each category gives. Administrators being 4%, Faculty being 7%, Staff being given 6%, and hourly being 2%.

 **/

package chapter8PP;
import java.text.DecimalFormat;
public class Chapter8PP 
{

	public static void main(String[] args) 
	{
		//variable declaration and initialization
		double totalAvg = 0.00, adminAvg = 0.00, facultyAvg = 0.00, staffAvg = 0.00, hourlyAvg = 0.00;
		double sum = 0.00; 

		//constant(s) declared
		final double ADMIN_RAISE= .04; //4% raise to administrators
		final double FACULTY_RAISE = .07; //7% raise to faculty
		final double STAFF_RAISE = .06; //6% raise to staff
		final double HOURLY_RAISE = .02; //2% raise to hourly

		//First 2D array (with initializer syntax)
		int [][] salary = {{25556, 50412, 79445},
				{30765, 55998, 64301},
				{25000, 70000, 75500},
				{20, 32, 40}};

		DecimalFormat decFor = new DecimalFormat("$.##"); //Decimal Format Class

		//Introduction to program
		System.out.println("Welcome to my program! This program will show a table of different occupations at an institution"
				+ "\n" + "with different salaries and will show the overall salary of said occupations in this insitution.");
		System.out.println("------------------------------------------------------");

		System.out.print("\t "+ "Entry Level" + "\t" + "Mid-Level"+ "\t" + "Senior Level\n");
		System.out.println("Admin    " + salary[0][0] + "\t\t" + salary[0][1] +"\t\t" + salary[0][2]);
		System.out.println("Faculty  " + salary[1][0] + "\t\t" + salary[1][1] +"\t\t" + salary[1][2]);
		System.out.println("Staff    " + salary[2][0] + "\t\t" + salary[2][1] +"\t\t" + salary[2][2]);
		System.out.println("Hourly   " + salary[3][0] + "\t\t" + salary[3][1] +"\t\t" + salary[3][2]);

		//for loop to calculate sum and average of values
		for (int row=0; row < salary.length; row++)
		{
			for (int col =0; col < salary[0].length; col++)
				sum += salary[row][col]; 
			totalAvg = sum /12;
			adminAvg = (salary[0][0] + salary[0][1] + salary[0][2]) / 3;
			facultyAvg = (salary[1][0] + salary [1][1] + salary[1][2]) / 3;
			staffAvg = 	(salary[2][0] + salary[2][1] + salary[2][2]) /3;
			hourlyAvg = (salary[3][0] + salary[3][1] + salary[3][2]) /3;
		}
		System.out.print("------------------------------------------------------");
		System.out.println();
		System.out.println("The average salary at this institution is "+ decFor.format(totalAvg));
		System.out.println();
		System.out.println("Average salary for each category: \n" + decFor.format(adminAvg) + "\n" + decFor.format(facultyAvg) + 
				"\n" + decFor.format(staffAvg) + "\n" + decFor.format(hourlyAvg) + "\n");
		System.out.println("The overall average is " + decFor.format(totalAvg));
		System.out.println("------------------------------------------------------");

		//display information
		System.out.println();
		System.out.println("Admin \t\t" + decFor.format(adminAvg));
		System.out.println("Faculty \t" + decFor.format(facultyAvg));
		System.out.println("Staff \t\t" + decFor.format(staffAvg));
		System.out.println("Hourly \t\t" + decFor.format(hourlyAvg));
		System.out.println("Overall \t" + decFor.format(totalAvg));
		System.out.println("------------------------------------------------------");

		//display information about next table
		System.out.println("This part of the table will calculate the different raises "
				+ "\n" + "for each category \n");
		System.out.println("Admin:          4%" + "\n" + "Faculty:        7%" +"\n"+ "Staff:          6%"+"\n" + "Hourly:         2%" + "\n");
		System.out.print("\t "+ "Entry Level" + "\t" + "Mid-Level"+ "\t" + "Senior Level\n");

		//2D array for occupations with different raises
		double [][] raise  = new double [4][3];

		//for loop to calculate the different raises of each occupation
		for (int row=0; row < raise.length; row++)
		{
			for (int col =0; col < raise[0].length; col++)
				raise[0][0] = ((salary[0][0]) * ADMIN_RAISE) + salary[0][0];
			raise[0][1] = ((salary[0][1]) * ADMIN_RAISE) + salary[0][1];
			raise[0][2] = ((salary[0][2]) * ADMIN_RAISE) + salary[0][2];

			raise[1][0] = ((salary[1][0]) * FACULTY_RAISE) + salary[1][0];
			raise[1][1] = ((salary[1][1]) * FACULTY_RAISE) + salary[1][1];
			raise[1][2] = ((salary[1][2]) * FACULTY_RAISE) + salary[1][2];

			raise[2][0] = ((salary[2][0]) * STAFF_RAISE) + salary[2][0];
			raise[2][1] = ((salary[2][1]) * STAFF_RAISE) + salary[2][1];
			raise[2][2] = ((salary[2][2]) * STAFF_RAISE) + salary[2][2];

			raise[3][0] = ((salary[3][0]) * HOURLY_RAISE) + salary[3][0];
			raise[3][1] = ((salary[3][1]) * HOURLY_RAISE) + salary[3][1];
			raise[3][2] = ((salary[3][2]) * HOURLY_RAISE) + salary[3][2];
		}

		//display 2nd table
		System.out.println("Admin    " + raise[0][0] + "\t" + raise[0][1] +"\t" + raise[0][2]);
		System.out.println("Faculty  " + raise[1][0] + "\t" + raise[1][1] +"\t" + raise[1][2]);
		System.out.println("Staff    " + raise[2][0] + "\t" + raise[2][1] +"\t\t" + raise[2][2]);
		System.out.println("Hourly   " + raise[3][0] + "\t\t" + raise[3][1] +"\t\t" + raise[3][2]);
		System.out.println("------------------------------------------------------");
		System.out.print("That is the end of my program. Thank you for running it! :)"); //end of program
	}
}