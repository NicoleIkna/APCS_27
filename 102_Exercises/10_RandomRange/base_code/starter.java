/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int integerone = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first): ");
		int integertwo = sc.nextInt();
		System.out.println(" ");
		System.out.println("Your range is " + integerone + " to " + integertwo + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		int range1 = (int) (Math.random()*(integertwo-integerone) + (integerone));
		int range2 = (int) (Math.random()*(integertwo-integerone) + (integerone));
		int range3 = (int) (Math.random()*(integertwo-integerone) + (integerone));
		int range4 = (int) (Math.random()*(integertwo-integerone) + (integerone));
		int range5 = (int) (Math.random()*(integertwo-integerone) + (integerone));
		System.out.println(range1 + ", " + range2 + ", " + range3 + ", " + range4 + ", " + range5);

	}
}
