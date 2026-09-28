/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your first number: "); 
		int a = sc.nextInt();
		System.out.println(" ");

		System.out.print("Please enter your second number: ");
		int b = sc.nextInt();
		System.out.println(" ");
		
		System.out.print("Please enter your third number: ");
		int c = sc.nextInt();
		System.out.println(" ");
		
		if (a>b){
			if(a>c){
				if (c<b){
					if(c<a){
						System.out.println("Your first number is the largest of the three!");
						System.out.println("The number was " + a + ".");
						System.out.println("Your third number is the smallest of the three!");
						System.out.println("The number was " + c + ".");
					}
				}
			}
		}
		
		if(b>a){
			if(b>c){
				if(c<a){
					if(c<b){
						System.out.println("Your second number is the largest of the three!");
						System.out.println("The number was " + b + ".");
						System.out.println("Your third number is the smallest of the three!");
						System.out.println("The number was " + c + ".");
					}
				}
			}
		}
		
		if(c>a){
			if(c>b){
				if(a<c){
					if(a<b){
						System.out.println("Your third number is the largest of the three!");
						System.out.println("The number was " + c + ".");
						System.out.println("Your first number is the smallest of the three!");
						System.out.println("The number was " + a + ".");
					}
				}
			}
		}
		
		if(a>b){
			if(a>b){
				if(b<c){
					if(b<a){
						System.out.println("Your first number is the largest of the three!");
						System.out.println("The number was " + a + ".");
						System.out.println("Your second number is the smallest of the three!");
						System.out.println("The number was " + b + ".");
					}
				}
			}
		}
		
		if(b>a){
			if(b>c){
				if(a<c){
					if(a<b){
						System.out.println("Your second number is the largest of the three!");
						System.out.println("The number was " + b + ".");
						System.out.println("Your first number is the smallest of the three!");
						System.out.println("The number was " + a + ".");
					}
				}
			}
		}
		
		if(c>a){
			if(c>b){
				if(b<a){
					if(b<c){
						System.out.println("Your third number is the largest of the three!");
						System.out.println("The number was " + c + ".");
						System.out.println("Your second number is the smallest of the three!");
						System.out.println("The number was " + b + ".");
					}
				}
			}
		}



	}
}
