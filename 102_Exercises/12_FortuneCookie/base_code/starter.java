/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String password = "wowowow";
		System.out.print("Password: ");
		String guess = sc.nextLine();
		
		boolean answer = password.equals(guess);
		if (!answer){
			System.out.println("Password incorrect.");
			System.out.println(" ");
			int a = (int) (Math.random()*7+1);
			if (a==2){
				System.out.println("Luck is on your side today.");
			}
			if (a==2){
				System.out.println("You will get tickets to your favorite singer's concert.");
			}
			if (a==3){
				System.out.println("A twenty dollar bill will stick to the bottom of your shoe.");
			}
			if(a==4){
				System.out.println("You will get a 5 on your AP exam.");
			}
			if(a==5){
				System.out.println("You will get extra credit in English class.");
			}
			if (a==6){
				System.out.println("The difference between Ser and Estar in Spanish will come easily to you.");
			}
			if (a==7){
				System.out.println("You will be a brain surgeon (whether you want to or not).");
			}
		}
		
		if (answer){
			System.out.println("Password correct.");
			int b = (int) (Math.random()*7+1);
			if (b==1){
				System.out.println("Your perfect vision will come in handy.");
			}
			if(b==2){
				System.out.println("You work hard. You big money.");
			}
			if(b==3){
				System.out.println("Hard work doesnt entail success.");
			}
			if(b==4){
				System.out.println("You might step on a frog.");
			}
			if(b==5){
				System.out.println("A gummy bear will get stuck in your throat.");
			}
			if(b==6){
				System.out.println("You will fall in love with the eldery.");
			}
			if(b==7){
				System.out.println("You are the goat.");
			}
			
		}
		
		
		
	}
}
