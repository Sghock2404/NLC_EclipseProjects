/**Student Name: Scott Hockaday

 *Date Completed: 3/19/19 

 *Project No. 4: Chapter 7 PP (7.2)

 *Extra Credit: No

 *Project Description: The purpose of this program is to represent the address, city, state, and zip code
 of the student(s). 
 **/

package student;

public class Address 
{
	private String streetAddress, city, state;
	private long zipCode;

	//Constructor: Sets up this address with the specified data.
	public Address(String street, String town, String st, long zip)
	{
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	//Returns a String description of the Address object.
	public String toString()
	{
		String result;
		result = streetAddress + "\n";
		result += city + ", " + state + "  " + zipCode;
		return result;
	}
}