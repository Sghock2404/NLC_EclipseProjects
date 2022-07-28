/**Student Name: Scott Hockaday

 *Date Completed: 4/25/19 

 *Project No. 7: 10.1

 *Extra Credit: No

 *Project Description: Modify the Firm example from this chapter such that it accomplishes its polymorphism using an interface called Payable.

 **/

package pp7;

public class Firm implements Payable 
{
	// Creates a staff of employees for a firm and pays them. 
	public static void main(String[] args) 
	{
		 Staff personnel = new Staff(); 
		 personnel.payday();
	}
	public interface Payable //interface Payable
	{
		public double pay();
	}
}