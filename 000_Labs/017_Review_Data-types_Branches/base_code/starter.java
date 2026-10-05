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

		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		System.out.println(" ");
		
		int points = 20;
		
		System.out.println("Strength (1-10): ");
		int strength = sc.nextInt();

		if((strength>10)||((points-strength)<0)||(strength<1)){
			System.out.println("Please input a valid value. Strength (1-10): ");
			strength = sc.nextInt();
			int pointstwo = (20-strength);
			System.out.println("You have " + pointstwo + " left to spend.");
		}
		else{
		int pointstwo = (20-strength);
		System.out.println("You have " + pointstwo + " left to spend.");
		}

		
		
		System.out.println("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		
		int pointstwo = (20-strength);

		if((dexterity>10)||((pointstwo-dexterity)<0)||(dexterity<1)){
			System.out.println("Please input a valid value. Dexterity (1-10): ");
			dexterity = sc.nextInt();
			int dexteritypoints = (pointstwo-dexterity);
			System.out.println("You have " + dexteritypoints + " left to spend.");
		}
		else{
		int dexteritypoints = (pointstwo-dexterity);
		System.out.println("You have " + dexteritypoints + " left to spend.");
		}



		System.out.println("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		
		int dexteritypoints = (pointstwo-dexterity);

		if((intelligence>10)||((dexteritypoints-intelligence)<0)||(intelligence<1)){
			System.out.println("Please input a valid value. Intelligence (1-10): ");
			intelligence = sc.nextInt();
			int intelligencepoints = (dexteritypoints - intelligence);
			System.out.println("You have " + intelligencepoints + " left to spend.");
		}
		else{
		int intelligencepoints = (dexteritypoints - intelligence);
		System.out.println("You have " + intelligencepoints + " left to spend.");
		}




		System.out.println("Constitution (1-10): ");
		int constitution = sc.nextInt();
		
		int intelligencepoints = (dexteritypoints-intelligence);

		if((constitution>10)||((intelligencepoints-constitution)<0)||(constitution<1)){
			System.out.println("Please input a valid value. Constitution (1-10): ");
			constitution = sc.nextInt();
			int constitutionpoints = (intelligencepoints - constitution);
			System.out.println("You have " + constitutionpoints + " left to spend.");
		}
		else{
		int constitutionpoints = (intelligencepoints - constitution);
		System.out.println("You have " + constitutionpoints + " left to spend.");
		}




		System.out.println("Charisma (1-10): ");
		int charisma = sc.nextInt();
		
		int constitutionpoints = (intelligencepoints - constitution);

		if((charisma>10)||((constitutionpoints-charisma)<0)||(charisma<1)){
			System.out.println("Please input a valid value. Charisma (1-10): ");
			charisma = sc.nextInt();
			int charismapoints = (constitutionpoints-charisma);
			System.out.println(" ");
			System.out.println("You have " + charismapoints + " to spend for next time.");
		}
		else{
		int charismapoints = (constitutionpoints-charisma);
		System.out.println(" ");
		System.out.println("You have " + charismapoints + " to spend for next time.");
		}

		System.out.println("-----------------------------------------------------------------");

		System.out.println("You are " + name + ", the " + title + " of CVHS.");
		System.out.println("You're a " + x + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Constitution - " + constitution);
		System.out.println("Charisma - " + charisma);

		System.out.println("Good luck on your quest " + name + "!");


		


		
	}
}