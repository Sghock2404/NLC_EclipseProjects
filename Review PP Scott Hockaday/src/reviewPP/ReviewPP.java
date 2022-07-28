/**Student Name: Scott Hockaday

 *Date Completed: 2/03/19 

 *Project No. 1: Review PP

 *Extra Credit: Yes (Only DecimalFormat)

 *Project Description: 
1. Ask and get the user's first name and last name 
2. Ask and get the user's college that he/she attends 
3. Ask and get the user's age 
4. Declare a constant and assign the value 7 to it.  
5. Use a loop that runs 7 times (use the final variable) to ask and get how many steps the user walks each day of the seven days in a week (Monday, Tuesday, etc until Sunday). 
The user prompt must display the Days of the Week (see the sample output). If you use an array to store the weekdays, 5 points will be taken off.  Try to use a switch statement. 
6. Calculate accurately (a real number) the daily average distance (in miles) walked by the user. (One mile = 5280 steps, declare a final variable for this value as well) 
7. Display the information gathered so far: First name, last name, college attending, age, and then the daily average distance walked. All the information should be displayed nicely formatted. 
8. Declare a constant that contains your own threshold value for minimum daily exercises.  
9. If the daily average is at or above the threshold, praise the user (profusely if you want); otherwise, tell the user what to do (as you please). 
10. Extra: if you add an outer loop that allows different users to enter their information, 5 point will be added. 
If you use the DecimalFormat class and format the daily average distance to 2 decimal points, another 5 point will be added. 
 **/

package reviewPP; //package
import java.util.Scanner; //Scanner class
import java.text.DecimalFormat;

public class ReviewPP 
{

	public static void main(String[] args) 
	{

		//scanner to get user input
		Scanner input_info = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.##");

		//variable declaration
		String first, last, college, answer;
		int age, steps, mon=0, tues=0, wed=0, thurs=0, fri=0, sat=0, sun=0;
		final int DAYS_IN_A_WEEK = 7; //constant(s) initialized
		final int MILE = 5280;
		final int EXERCISE = 3; //3 miles of exercise
		float result = 0;

		//beginning of do-while loop
		do {

			//Prompt user to get information (first name, last, age)
			System.out.print("What is your first name? ");
			first = input_info.next();

			System.out.print("What is your last name? ");
			last = input_info.next();

			System.out.print("What college do you attend? ");
			college = input_info.next();

			System.out.print("How old are you? ");
			age = input_info.nextInt();

			//for loop to ask user how many steps he/she walks on a certain day of the week
			for(int i = 0; i < DAYS_IN_A_WEEK; i++)
			{
				switch(i) //switch statement
				{
				case 0: System.out.print("How many steps did you walk on Monday? ");
				mon = input_info.nextInt();
				break;

				case 1: System.out.print("How many steps did you walk on Tuesday? ");
				tues = input_info.nextInt();
				break;

				case 2: System.out.print("How many steps did you walk on Wednesday? ");
				wed = input_info.nextInt();
				break;

				case 3: System.out.print("How many steps did you walk on Thursday? ");
				thurs = input_info.nextInt();
				break;

				case 4: System.out.print("How many steps did you walk on Friday? ");
				fri = input_info.nextInt();
				break;

				case 5: System.out.print("How many steps did you walk on Saturday? ");
				sat = input_info.nextInt();
				break;

				case 6: System.out.print("How many steps did you walk on Sunday? ");
				sun = input_info.nextInt();
				break;
				}
				steps = mon + tues + wed + thurs + fri + sat + sun;
				result = steps / (MILE * DAYS_IN_A_WEEK);
			}

			//display temporary fitness goal for user
			if(result < EXERCISE)
			{
				System.out.println();
				System.out.println("You didn't walk more than your daily goal! :( ");
				System.out.println("Get up and be more active! ");
			}
			else
			{
				System.out.println();
				System.out.println("Congratulations!! You walked more than your goal which is " + EXERCISE + " miles! ");
				System.out.println("Keep staying healthy and keep walking!");
			}

			//display all information	
			System.out.println();
			System.out.println("First name: " + first);
			System.out.println("Last name: " + last);
			System.out.println("College attending: " + college);
			System.out.println("Age: " + age);
			System.out.println("Daily distance walked: " + f.format(result) + " miles");
			System.out.print("Would you like to run this program again, but with a different user? y/n: ");	
			answer = input_info.next();
			System.out.println("---------------------------------------------------------------------");
		}while(answer.equalsIgnoreCase("y")); //end of loop

		if(answer != "y")
		{
			System.out.print("Thank you for trying my program. Have a nice day!");
			
		}
	}
}