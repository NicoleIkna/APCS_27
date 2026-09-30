/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String x = sc.nextLine();
		if(x.equalsIgnoreCase("Wizard")){
			System.out.println("You've chosen the Wizard! How magical!");
		}
		if(x.equalsIgnoreCase("Warrior")){
			System.out.println("You've chosen the Warrior! How brave!");
		}
		if(x.equalsIgnoreCase("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}

		if(!x.equalsIgnoreCase("Rogue")){
			if(!x.equalsIgnoreCase("Wizard")){
				if(!x.equalsIgnoreCase("Warrior")){
					System.out.println("You've decided not to choose a role. Rerun program.");
				}
			}
		}
		System.out.println(" ");

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		System.out.print("Strength(1-10): ");
		int strength = sc.nextInt();
		int leftoverone = (20 - strength);
		System.out.println("You have " + leftoverone + " left to spend.");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		int leftovertwo = (leftoverone - dexterity);








	}
}
