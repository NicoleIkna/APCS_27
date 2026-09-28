/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess a word with two hints!");
		System.out.println(" ");
		int abc = (int) (Math.random()*3+1);

		
		
		if(abc == 1){
		String x = "Rose";
		System.out.println("It's a flower!");
		System.out.println("What is your guess?");
		String y = sc.nextLine();
		
		if(y.equalsIgnoreCase("rose")){
			System.out.println("You got it! Woo!");
		}
		else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It's commonly given as a gift for anniversaries, birthdays, and valentines day!");
			String guesstwo = sc.nextLine();
			
			if(guesstwo.equalsIgnoreCase("rose")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("The answer was " + x + ", better luck next time!");
		}
	    }
		}

		
		if(abc == 2){
			String television = "The Big Bang Theory";
			System.out.println("Its a popular TV show starring Jim Parsons");
			System.out.println("What is your guess?");
		    String wow = sc.nextLine();

			if(wow.equalsIgnoreCase("The Big Bang Theory")){
				System.out.println("You got it! Woo!");
			}
			else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It started airing in 2007");
			String wowow = sc.nextLine();
			
			if(wowow.equalsIgnoreCase("The Big Bang Theory")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("The answer was " + abc + ", better luck next time!");
		}
		}
		}
		
		
		
		if(abc == 3){
			String edward = "Harry Potter";
			System.out.println("It's a fantasy book series turned movie series!");
			System.out.println("What is your guess?");
		    String fantasy = sc.nextLine();

			if(fantasy.equalsIgnoreCase("Harry Potter")){
				System.out.println("You got it! Woo!");
			}
			else{
			System.out.println("You sadly didn't guess right, here's another hint!");
			System.out.println("It was written by J.K. Rowling!");
			String burrito = sc.nextLine();
			
			if(burrito.equalsIgnoreCase("Harry Potter")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("The answer was " + edward + ", better luck next time!");
		}
		}
		}





	}
}
