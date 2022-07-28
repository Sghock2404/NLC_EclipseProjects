/**Student Name: Scott Hockaday

 *Date Completed: 2/28/19 

 *Project No. 3: Chapter 4 PP

 *Extra Credit: No

 *Project Description: The purpose of this program is to create a sphere with a constructor, the accessor, and mutator methods 
 *for each instance variable, and the toString method defined. It will also calculate the volume and surface area of different spheres
 *Must test ALL methods explicitly in the driver class with at least two objects. 

 **/
package chapter4PP;

public class SphereDriver {

	public static void main(String[] args) 
	{
		{
			//More than one object declarations
			Sphere sphere1 = new Sphere(); //first object sphere
			Sphere sphere2 = new Sphere(); //second object sphere
			Sphere sphere3 = new Sphere(); //third object sphere

			//program introduction
			System.out.println("Welcome to my program! This program will show different spheres \n"
					+ "with different diameters and radii. It will then calculate the \n"
					+ "volume and surface areas of the spheres. \n");
			
			//set diameters for the different spheres in the program (first sphere will be set to 0)
			sphere2.setDiameter(5.00);
			sphere3.setDiameter(10.00);
			
			System.out.println("Sphere1's diameter is " + sphere1.getDiameter());
			System.out.println("Sphere2's diameter is " + sphere2.getDiameter());
			System.out.println("Sphere3's diameter is " + sphere3.getDiameter());
			System.out.println("-----------------------------------------");
			
			//calling the toString method with original values for the spheres
			System.out.println("Sphere1" + sphere1.toString());

			System.out.println("Sphere2" + sphere2.toString());

			System.out.println("Sphere3" + sphere3.toString());
			System.out.println("-----------------------------------------");

			//change diameter length to a different value for testing
			sphere1.setDiameter(100.00);
			sphere2.setDiameter(17.38);
			System.out.println("Sphere1's diameter has now been changed to " + sphere1.getDiameter());
			System.out.println("Sphere2's diameter has now been changed to " + sphere2.getDiameter());
			System.out.println("Sphere3's diameter has not been changed.");
			System.out.println("-----------------------------------------");
			
			//calling the toString method again, but with new values for the spheres
			System.out.println("Sphere1" + sphere1.toString());

			System.out.println("Sphere2" + sphere2.toString());

			System.out.println("Sphere3" + sphere3.toString());
			System.out.println("-----------------------------------------");
			
			//end of program
			System.out.println("This program has ended.\nThank you for trying it out! :)");
		}
	}
}