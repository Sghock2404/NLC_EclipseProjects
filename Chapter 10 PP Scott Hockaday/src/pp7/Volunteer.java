/**Student Name: Scott Hockaday

 *Date Completed: 4/25/19 

 *Project No. 7: 10.1

 *Extra Credit: No

 *Project Description: Modify the Firm example from this chapter such that it accomplishes its polymorphism using an interface called Payable.

 **/

package pp7;

public class Volunteer extends StaffMember implements Payable
{ 
	//Constructor: Sets up this volunteer using the specified // information. 
	public Volunteer(String eName, String eAddress, String ePhone) 
	{ 
		super(eName, eAddress, ePhone); 
	} 
	public boolean Payable()
	{
		return false;
	}
	//Returns a zero pay value for this volunteer. 
	public double pay() 
	{ 
		return 0.0; 
	}	 
}