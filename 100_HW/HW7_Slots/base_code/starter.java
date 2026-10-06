/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("------------------------------------------------");
		System.out.println(" ");
		int StartingMoney = 100;
		System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
		String answer1 = sc.nextLine();
		System.out.println(" ");
		if(answer1.equalsIgnoreCase("Yes") || answer1.equalsIgnoreCase("y")){
			System.out.println("You have $" + StartingMoney + ". How much would you like to wager?");
			int WagerOne = sc.nextInt();
		}
		else{
			System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
		}

	}
}
