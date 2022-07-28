package pp6;

import java.util.*;

public class MonetaryCoinDriver {

	static double sum; //static variable declaration and instantiation
	public static void main(String [] args) 
	{ 
		Random number = new Random();  
		int [] value = {1,2,3,4,5,6,7,8}; //int array to get the value of sum

		for (int j = 0; j < value.length; j++)
		{ 
			sum+=value[j];
		} 
		System.out.println(sum + "\n");
		int y, j; 
		MonetaryCoin [] coins = new MonetaryCoin[10]; //Array declaration for faces. (Heads and Tails)
		for (j = 0; j < coins.length; j++) 
		{ 
			y = Math.abs(number.nextInt()) % value.length; 
			coins [j] = new MonetaryCoin(value[y]); 
		}  
		for (int k = 0; k < coins.length; k++) 
		System.out.println(coins [k]); 
		System.out.println("\n" + coins[0] + " before flipping is " + coins[0].getValue()); //display information before flipping
		coins[0].flip(); //Flips the coin 
		System.out.println("after flipping is " + coins[0].getValue()); //display information after flipping 
		System.out.println("\nThank you for trying my program!! :)");
	}
}