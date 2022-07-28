/**Student Name: Scott Hockaday

 *Date Completed: 3/19/19 

 *Project No. 4: Chapter 7 PP (7.2)

 *Extra Credit: No

 *Project Description: The purpose of this program is to represent a college student with basic information, current test scores,
 and their test average.

 **/

package student;
import java.text.DecimalFormat;

public class Student {
	DecimalFormat decFor = new DecimalFormat("#.##"); //Decimal Format Class
	
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int testScore1;
	private int testScore2; 
	private int testScore3;

	//Constructor: Sets up this student with the specified values.
	public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScore1=0;
		testScore2=0;
		testScore3=0;
	}
	//2nd Constructor: Sets up this student with three different test scores.
	public void setTestScore(int testNumber, int testScore)
	{
		if (testNumber == 1)
		{
			testScore1 = testScore;
		}
		else if (testNumber == 2)
		{
			testScore2 = testScore;
		}
		else
			testScore3 = testScore;
	}
	//accessor method for getTestScore.
	public int getTestScore(int testNumber)
	{
		if (testNumber == 1)
		{
			return testScore1;
		}
		else if (testNumber == 2)
		{
			return testScore2;
		}
		else
			return testScore3;
	}
	//calculation mutator for average of the student's three test scores.
	public double calcAverage()
	{
		return ((testScore1 + testScore2 + testScore3) / 3.0);
	} 
	//Returns a string description of the Student object.
	public String toString()
	{
		String result;
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "Test 1: " + testScore1 + "\nTest 2: " + testScore2 + "\nTest 3: " + testScore3 + 
				"\nAverage Test Score: " + decFor.format(calcAverage());
		return result;
	}
}