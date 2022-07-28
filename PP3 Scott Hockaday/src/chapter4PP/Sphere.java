/**Student Name: Scott Hockaday

 *Date Completed: 2/28/19 

 *Project No. 3: Chapter 4 PP

 *Extra Credit: No

 *Project Description: The purpose of this program is to create a sphere with a constructor, the accessor, and mutator methods 
 *for each instance variable, and the toString method defined. It will also calculate the volume and surface area of different spheres
 *Must test ALL methods explicitly in the driver class with at least two objects. 

 **/
package chapter4PP;

public class Sphere
{
		//instance data fields. They are always private!
			private double diameter;
			private double volume;
			
			//constructor class
			public Sphere()
			{
				diameter = 0.00;
				volume = 0.00;
			}
			//constructor class with parameters and instance variables instantiated
			public Sphere(double d, double v)
			{
				diameter = d;
				volume = v;
			}
			//accessor class: return each of the instance variables
			public double getDiameter()
			{
				return diameter;
			}
			public double getVolume()
			{
				return volume;
			}
			//mutator class: changes the value of each of the instance variables that accepts a parameter of the same type of the instance variable
			public void setDiameter(double d)
			{
				this.diameter = d;
			}
			public void setVolume(double v)
			{
				this.volume = v;
			}
			//calculation mutator method for sphere's radius
			public double calcRadius()
			{
				return diameter/2;
			}
			//calculation mutator method for sphere's volume
			public double calcVolume(double radius)
			{
				double volume = 0;
				volume = (4.00/3) * Math.PI * Math.pow(radius, 3);
				return volume;
			}
			//calculation mutator method for sphere's surface area
			public double calcSurfaceArea(double radius)
			{
				double surfaceArea = 0;
				surfaceArea = (4 * Math.PI * Math.pow(radius,2));
				return surfaceArea;
			}
			//toString method to return a string result of all the instance variables
			public String toString()
			{
				String result = "";
				result += "("+ diameter + ") \n\t" + "Volume: " + calcVolume(calcRadius()) + "\n\tSurface Area: " + calcSurfaceArea(calcRadius());
				return result;
			}
}