/**Student Name: Scott Hockaday

 *Date Completed: 4/25/19 

 *Project No. 7: 10.1

 *Extra Credit: No

 *Project Description: Modify the Firm example from this chapter such that it accomplishes its polymorphism using an interface called Payable.

 **/

package pp7;

public class Hourly extends Employee
{
	private int hoursWorked; 
	//Constructor: Sets up this hourly employee using the specified information.
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{ 
		super(eName, eAddress, ePhone, socSecNumber, rate); 
		hoursWorked = 0; 
	} 
	//Adds the specified number of hours to this employee's accumulated hours. 
	public void addHours(int moreHours) 
	{ 
		hoursWorked += moreHours; 
	} 
	//Computes and returns the pay for this hourly employee. 
	public double pay() 
	{ 
		double payment = payRate * hoursWorked; 
		hoursWorked = 0;
		return payment; 
	}
	public String toString() 
	{ 
		String result = super.toString(); 
		result += "\nCurrent hours: " + hoursWorked; 
		return result; 
	}
}