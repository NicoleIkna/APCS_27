/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static int pow(int base, int exponent){
		int x = 0;
		int answer = 0;
		while(true){
			if((x==exponent) && (exponent!=1)){
				answer = base*(base*x);
				break;
			}
			else if((x==exponent) && (exponent==1)){
				answer = base;
				break;
			}
			else{
				x = x + 1;
			}
		}
		return answer;
}
	

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println(" ");
		System.out.println("What is your exponent number?");
		int exponent = sc.nextInt();
		int answer = pow(base, exponent);
		System.out.println("Your answer is " + answer);
		
	}
}
