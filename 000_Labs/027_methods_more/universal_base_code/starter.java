/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Nicole's ATM!!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner"); 
		System.out.println("3 - Owner and initial deposit");
		int answer = sc.nextInt();
		sc.nextLine();
		BankAccount account;
		if(answer == 1){
			account = new BankAccount();
		}
		else if(answer == 2){
			System.out.println("What is the owner's name?");
			String name = sc.nextLine();
			account = new BankAccount(name);
		}
		else if(answer == 3){
			System.out.println("What is the owner's name?");
			String name = sc.nextLine();
			System.out.println("How much are you depositing?");
			double deposit = sc.nextDouble();
			sc.nextLine();
			account = new BankAccount(name);
		
		}
		else{
			System.out.println("Follow directions!!!!! Account unsuccessfull!!!!!!");
			return;

		}

		System.out.println("Account successfully created!");

		account.displayAccountInformation();

		System.out.println("Would you like to check the balance of this account? (yes/no)");
		String doYouWantYourBalance = sc.nextLine();

		if(doYouWantYourBalance.equalsIgnoreCase("yes")){
			account.checkBalance();
		}
		else if(doYouWantYourBalance.equalsIgnoreCase("no")){
			System.out.println("No balance checked.");
			System.out.println("Thank you for coming to Nicole's ATM!!");
		}
		else{
			System.out.println("Listen to instruction!!!!!!");
			System.out.println("Thank you for coming to Nicole's ATM!!");
		}



		
	}
}
