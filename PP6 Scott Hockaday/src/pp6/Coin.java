package pp6;

public class Coin {
	//variable declaration and instantiation
	public final int HEADS = 0; //final constants declared for face values 
	public final int TAILS = 1; 

	private int face; 

	// Sets up the coin by flipping it initially 
	public Coin () 
	{ 
		flip(); 
	} 
	//Flips the coin by randomly choosing a face
	public void flip() 
	{ 
		face = (int) (Math.random() * 2); 
	} 
	// Returns true if the current face of the coin is heads
	public boolean isHeads() 
	{ 
		return (face == HEADS); 
	} 
	// Returns the current face of the coin in toString() method 
	public String toString() 
	{ 
		String faceName; 
		if (face == HEADS) 
			faceName = "Heads"; 
		else 
			faceName = "Tails"; 
		return faceName;
	}
}