/**Student Name: Scott Hockaday

 *Date Completed: 3/19/19 

 *Project No. 4: Chapter 7 PP (7.2)

 *Extra Credit: No

 *Project Description: The purpose of this program is to demonstrate the use of an aggregate class.

 **/

package student;

public class StudentDriver {

	//Creates some Address and Student objects and prints them.
	public static void main(String[] args) {
		
		//introduction to program
		System.out.println("Welcome to my program! This program will show two different students with \n"
				+ "basic information (address, school address, first name, last name, etc.). \n");
		
		//Address object for school.
		Address school = new Address("800 Lancaster Ave.", "Villanova","PA", 19085);
		
		//Address object for first student.
		Address jHome = new Address("21 Jump Street", "Lynchburg","VA", 24551);
		
		//First Student object.
		Student john = new Student("John", "Smith", jHome, school);
		
		//Set test score(s) for the first student.
		john.setTestScore(1, 90);
		john.setTestScore(2, 75);
		john.setTestScore(3, 80);
		
		//Address object for second student.
		Address mHome = new Address("123 Main Street", "Euclid", "OH",44132);
		
		//Second Student object.
		Student marsha = new Student("Marsha", "Jones", mHome, school);
		
		//Set test score(s) for the second student.
		marsha.setTestScore(1, 75);
		marsha.setTestScore(2, 86);
		marsha.setTestScore(3, 79);
		
		//Display all information from toString method.
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println();
		System.out.println("Thank you for trying out my program! Have a great day! :)");
	}
}