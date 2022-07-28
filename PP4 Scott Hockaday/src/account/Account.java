/**Student Name: Scott Hockaday

 *Date Completed: 3/19/19 

 *Project No. 4: Chapter 7 PP (7.1)

 *Extra Credit: No

 *Project Description: The purpose of this program is to represent a bank account with basic services such as
 *deposits and withdraws. 

 **/

package account;
import java.text.NumberFormat;

public class Account {
	
	private final double RATE = 0.035; //interest rate of 3.5% 
	private long acctNumber; 
	private double balance; 
	private String name; 

	//sets up the account by defining its owner, account number, and initial balance
	public Account(String owner, long account, double initial) 
	{ 
		name = owner; 
		acctNumber = account;
		balance = initial;
	}
	//2nd constructor class overloaded, but initialized to zero
	public Account(String owner, long account) 
	{ 
		name = ""; 
		acctNumber = 12345678910L; 
		balance = 0.0; 
	}
	//Deposits the specified amount into the account. Then, returns the new balance.
	public double deposit(double amount) 
	{ 
		balance = balance + amount; 
		return balance; 
	} 
	//Withdraws the specified amount from the account and applies the fee. Then, returns the new balance. 
	public double withdraw(double amount, double fee) 
	{ 
		balance = balance - amount - fee; 
		return balance; 
	} 
	//Adds interest to the account and returns the new balance.
	public double addInterest() 
	{ 
		balance += (balance * RATE); 
		return balance; 
	} 
	//Returns the current balance of the amount.
	public double getBalance() 
	{ 
		return balance; 
	} 
	//Returns a one-line description of the account as a string.
	public String toString() 
	{ 
		NumberFormat fmt = NumberFormat.getCurrencyInstance (); 
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance)); 
	}
}