/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
public static void main(String args[]){
Cipher message = new Cipher();

	Scanner sc = new Scanner(System.in);

		//String x = sc.nextLine();

		// One, two, three, five, and eight were without keys:
		//System.out.println(Cipher.encode(x));

		//Number four, the key was 33:
		//System.out.println(Cipher.keyedEncode(x,33));

		//Number six, the key was 8.5, so it was 8:
		//System.out.println(Cipher.keyedEncode(x,8));

		//Number seven, the keys were 13 and 29:
		//System.out.println(Cipher.keyedEncode(Cipher.keyedEncode(x,13),29));

		//Numbers nine and ten; the keys are missing. I used this code to print the de-coded message for all numbers 1-36 and take the correct one:
		/*
		int key = 0;
		while(key<36){
			System.out.println(key + ":" + Cipher.keyedEncode(x,key));
			key = key+1;
		}
		*/

		//To write my own message:
		//String x = "You dont want to know what I had to do to try and understand this assignment.";
		//System.out.println(Cipher.keyedEncode(x, 17));
	
	}
}
