package pp6;

public class MonetaryCoin extends Coin //inheritance: Coin is the subclass, MonetaryCoin is parent class
{
	protected double value; //this is for dimes, quarters, etc. 

	MonetaryCoin(int v) 
	{ 
		value = v; 
	} 

	public double getValue() //Gets the value of coin, a coin cannot change its value!
	{ 
		return value; 
	} 

	public double add(MonetaryCoin[] coins) 
	{ 
		double sum = value; 
		if (coins.length == 0) return sum; //returns the value of this coin 
		for (int i = 0; i < coins.length; i++) sum += coins[i].getValue(); //adds values to the value 
		return sum;
	} 
}