/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime number until that number: ");
		int number = sc.nextInt();
		sc.nextLine();
		printPrimes(number);
	}

	public static boolean checkPrime(int num){
		if(num<=1){
			return false;
		}

		int divisor = 2;

		while(divisor<num){
			if(num%divisor==0){
				return false;
			}
			divisor++;
		}

		return true;
	}

	public static void printPrimes(int number){
		int i = 2;
		while(i<number){
			if(checkPrime(i)){
				System.out.println(i);
			}
			i++;
		}

	}
}
