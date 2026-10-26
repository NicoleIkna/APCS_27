/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
// -------GLOBAL VARIABLES-------
	private String owner;
	private int accountNumber;
	private double balance;
	private boolean isActive;

	private static int nextAccountNumber = (int) (Math.random()*951)+50;


	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "Unknown";
		balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	public BankAccount(String name){
		owner = name;
		balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	// -------METHODS-------
	public BankAccount(String name, double deposit){
		owner = name;
		balance = deposit;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}

	//Method 1 - Check balance:
	public void checkBalance(){
		System.out.println("Current Account Balance = $" + balance);
	}

	//Method 2 - Display account info:
	public void displayAccountInformation(){
		System.out.println("------Account information------");
		System.out.println("Owner: " + owner);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		if(isActive){
			System.out.println("Status: Active");
		}
		else{
			System.out.println("Status: Inactive");
		}
	}

}