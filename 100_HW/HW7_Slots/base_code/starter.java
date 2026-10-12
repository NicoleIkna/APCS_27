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
		System.out.println("2. Input wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("------------------------------------------------");
		
		System.out.println(" ");
		
		int Money = 100;
		
		
		int Wager1 = 0;
		String answer1;

		boolean yay = true;


		while(yay){
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			answer1 = sc.nextLine();
			
			if(answer1.equalsIgnoreCase("Yes") || answer1.equalsIgnoreCase("y")){
			System.out.print("You have $" + Money + ". How much would you like to wager? ");
			Wager1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		int roll1 = (int) (Math.random()*10+1);
		int roll2 = (int) (Math.random()*10+1);
		int roll3 = (int) (Math.random()*10+1);
		System.out.println("----------------");
		System.out.println("  | " + roll1 + " | " + roll2 + " | " + roll3 + " | ");
		System.out.println("----------------");
		
		
	
		if(roll1==roll2 || roll1==roll3 || roll2==roll3){
			System.out.println("You won! Your wager has now been doubled!");
			Money = (Wager1*2) + 100;
			System.out.println("You now have $" + Money);
		}

		else if(roll1==roll2 && roll2==roll3){
			System.out.println("You won the jackpot!!! Your wager has now been tripled!!");
			Money = (Wager1*3) + 100;
			System.out.println("You now have $" + Money);
		}

		else if(roll1!=roll2 && roll2!=roll3){
			System.out.println("Didn't win this time, better luck next time!");
			Money = (Money-Wager1);
			System.out.println("You now have $" + Money);
		}

		if(Money==0 || Money<=0){
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			break;
		}
		}

		
		else if(answer1.equalsIgnoreCase("No") || answer1.equalsIgnoreCase("n")){
			System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
			yay = false;
			break;
		}
		
		
		else{
			System.out.print("That wasnt quite the right answer. Try again. ");
			answer1 = sc.nextLine();
			
			if(answer1.equalsIgnoreCase("no") || answer1.equalsIgnoreCase("n")){
				System.out.println("Sad to see you go! You still have $100 left. Come again soon! Thanks!");
			yay = false;
			break;
			} 
			
			else if(answer1.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("y")){
				System.out.print("You have $" + Money + ". How much would you like to wager? ");
			Wager1 = sc.nextInt();
			sc.nextLine();
			System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		int roll1 = (int) (Math.random()*10+1);
		int roll2 = (int) (Math.random()*10+1);
		int roll3 = (int) (Math.random()*10+1);
		System.out.println("----------------");
		System.out.println("  | " + roll1 + " | " + roll2 + " | " + roll3 + " | ");
		System.out.println("----------------");
		
		
	
		if(roll1==roll2 || roll1==roll3 || roll2==roll3){
			System.out.println("You won! Your wager has now been doubled!");
			Money = (Wager1*2) + 100;
			System.out.println("You now have $" + Money);
		}

		else if(roll1==roll2 && roll2==roll3){
			System.out.println("You won the jackpot!!! Your wager has now been tripled!!");
			Money = (Wager1*3) + 100;
			System.out.println("You now have $" + Money);
		}

		else if(roll1!=roll2 && roll2!=roll3){
			System.out.println("Didn't win this time, better luck next time!");
			Money = (Money-Wager1);
			System.out.println("You now have $" + Money);
		}

		if(Money==0 || Money<=0){
			System.out.println("You've run out of money! Thanks for coming! Come back soon!");
			break;
		}

			}
		}
	
	}
}
}