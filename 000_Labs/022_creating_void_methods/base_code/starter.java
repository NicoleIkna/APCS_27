/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void toString(String sentenceOne){
		System.out.println(sentenceOne);
	}
	
	public static void toStringCombined(String sentenceOne, String sentenceTwo){
		System.out.println(sentenceOne + " " + sentenceTwo);
	}

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence! ");
		String sentenceOne = sc.nextLine();
		
		
		System.out.println(" ");
		
		System.out.println("Write a sentence!");
		String sentenceTwo= sc.nextLine();
		

		System.out.println("This is using the methods:");
		toString(sentenceOne);
		toStringCombined(sentenceOne, sentenceTwo);
	

		
	}
}
