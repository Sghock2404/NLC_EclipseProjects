/**Student Name: Scott Hockaday

 *Date Completed: 4/25/19 

 *Project No. 7: 10.1

 *Extra Credit: No

 *Project Description: Modify the Firm example from this chapter such that it accomplishes its polymorphism using an interface called Payable.

 **/

package pp7;

public class Staff 
{
	private StaffMember[] staffList;
	//-----------------------------------------------------------------
	//Constructor: Sets up the list of staff members.
	//-----------------------------------------------------------------
	public Staff() 
	{ 
		staffList = new StaffMember[6]; 
		staffList[0] = new Executive("Josh Stein", "620 Blue Ave.", "281-661-777", "291-54-0125", 2390.05);
		staffList[1] = new Employee("Jennifer Creed", "451 Meadow Blvd.", "281-562-0097", "484-11-0947", 1250.95); 
		staffList[2] = new Employee("Evan Kostner", "199 Cotton Queen Drive", "281-556-8700", "674-22-4003", 1150.32);
		staffList[3] = new Hourly("Diana A. Fitzgerald", "678 Sixty-Seventh Blvd.", "598-0990", "109-33-2526", 13.50);
		staffList[4] = new Volunteer("Norman Harrison", "788 Lightstone", "779-4452");
		staffList[5] = new Volunteer("Johnny Bravo", "321 Duds Lane", "659-9958");
		
		
		((Executive)staffList[0]).awardBonus(175.00);
		((Hourly)staffList[3]).addHours(40);
	} 
	//Pays all staff members.
	public void payday() 
	{ 
		double amount; 
		for (int count=0; count < staffList.length; count++) 
		{ 
			System.out.println(staffList[count]); 
			amount = staffList[count].pay(); // polymorphic 
			if (amount == 0.0) System.out.println("Thanks!"); 
			else System.out.println("Paid: " + amount); System.out.println("-----------------------------------");
		}
	}
}