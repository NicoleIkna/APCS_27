/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int a = 4;
		int b = 2;
		System.out.println("The first variable is " + a); 
		System.out.println("The second variable is " + b); 
		boolean answer = a == b;
		if (!answer){
			System.out.println("The variables are different");
		}
		if (answer){
			System.out.println("The variables are the same");
		}
	}
}
