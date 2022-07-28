/**Student Name: Scott Hockaday

 *Date Completed: 4/25/19 

 *Project No. 7: 10.1

 *Extra Credit: No

 *Project Description: Modify the Firm example from this chapter such that it accomplishes its polymorphism using an interface called Payable.

 **/

package pp7;

abstract public class StaffMember 
{
	protected String name;
	protected String address;
	protected String phone;
	
	//Constructor: Sets up this staff member using the specified information.
	public StaffMember(String eName, String eAddress, String ePhone)
	{
		name = eName; address = eAddress; phone = ePhone;
	}
	//Returns a string including the basic employee information.
	public String toString()
	{
		String result = "Name: " + name + "\n"; result += "Address: " + address + "\n";
		result += "Phone: " + phone; 
		return result;
	}
	public boolean Payable()
	{
		return true;
	}
	//Derived classes must define the pay method for each type of employee. 
	public abstract double pay();
}