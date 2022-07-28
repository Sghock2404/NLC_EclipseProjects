/**Student Name: Scott Hockaday

 *Date Completed: 3/19/19 

 *Project No. 4: Chapter 7 PP (7.1)

 *Extra Credit: No

 *Project Description: The purpose of this program is to demonstrate the creation and use of multiple
 *Account objects.  

 **/
package account;

public class AccountDriver {

	//This creates some bank accounts and requests various services.
	public static void main(String[] args) 
	{
		Account accountOne = new Account ("Ted Murphy", 72354, 102.56); 
		Account accountTwo = new Account ("Jane Smith", 69713, 40.00); 
		Account accountThree = new Account ("Edward Demsey", 93757, 759.32);
		Account accountFour = new Account ("Michael Scott", 35461); //4th bank account with account name and number

		accountOne.deposit(25.85); 

		double smithBalance = accountTwo.deposit(500.00); 
		System.out.println ("Mr. Smith's balance after deposit: " + smithBalance); 

		System.out.println ("Mr. Smith's balance after withdrawal: " + accountTwo.withdraw(430.75, 1.50));
		 
		accountOne.addInterest(); 
		accountTwo.addInterest(); 
		accountThree.addInterest(); 

		System.out.println(); 
		System.out.println(accountOne); 
		System.out.println(accountTwo); 
		System.out.println(accountThree);
		System.out.println("-------------------------------------------");
	}
}