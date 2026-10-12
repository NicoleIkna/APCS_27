/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		int number = (int) (Math.random()*1000);
		System.out.print("Please guess a number: ");
		int guess = sc.nextInt();
		System.out.println(" ");

		while(true){
			if(guess>number){
				System.out.println("The number is lower.");
				System.out.println("Please guess a number: ");
				guess = sc.nextInt();
				
			}
			if(guess<number){
				System.out.println("The number is higher.");
				System.out.println("Please guess a number: ");
				guess = sc.nextInt();
				
			}
			if(guess==number){
				System.out.println("You got the number!");
				break;
			}
		}
		




		
	}
}
