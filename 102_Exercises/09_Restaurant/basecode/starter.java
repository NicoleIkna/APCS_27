/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("=======================================");
		System.out.println("       WELCOME RESTAURANT OWNER      ");
		System.out.println("=======================================");
		System.out.println(" ");
		System.out.print("What's the name of your restaurant? ");
		String restaurantname = sc.nextLine();
		System.out.println(" ");
		System.out.print("What's your name? ");
		String name = sc.nextLine();
		System.out.println(" ");
		System.out.println("Great to see you, " + name + "! Let's set up a menu for " + restaurantname + "!");
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println(" ");
		System.out.println("---Item #1---");
		System.out.print("Item name: ");
		String itemone = sc.nextLine();
		System.out.println(" ");
		System.out.print("Price of " + itemone + " ($): ");
		int priceone = sc.nextInt();
		System.out.println(" ");
		System.out.print("How many of " + (itemone) + " would you like? ");
		int manyone = sc.nextInt();
		System.out.println(" ");
		System.out.println("Added " + manyone + "x " + (itemone) + " to your order! (" + (manyone*priceone) + ")");
		System.out.println(" ");
		System.out.println("---Item #2---");
		Scanner cs = new Scanner (System.in);
		System.out.print("Item name: ");
		String itemtwo = cs.nextLine();
		System.out.println(" ");
		System.out.print("Price of " + (itemtwo) + " ($): ");
		int pricetwo = cs.nextInt();
		System.out.println(" ");
		System.out.print("How many " + (itemtwo) + " would you like? ");
		int manytwo = cs.nextInt();
		System.out.println(" ");
		System.out.println("Added " + manytwo + "x " + (itemtwo) + " to your order! (" + (manytwo*pricetwo) + ")");
		System.out.println(" ");
		System.out.println("---Item #3---");
		Scanner abc = new Scanner (System.in);
		System.out.print("Item name: ");
		String itemthree = abc.nextLine();
		System.out.println(" ");
		System.out.print("Price of " + itemthree + " ($): ");
		int pricethree = abc.nextInt();
		System.out.println(" ");
		System.out.print("How many " + (itemthree) + " would you like? ");
		int manythree = abc.nextInt();
		System.out.println(" ");
		System.out.println("Added " + (manythree) + "x " + (itemthree) + " to your order! (" + (manythree*pricethree) + ")");
		System.out.print("Nice choices! What tip percentage would you like to leave? (ex: 15, 18, 20): ");
		int percentage = abc.nextInt();
		System.out.println(" ");
		System.out.println("========================================");
		System.out.println("         " + (restaurantname) + " - Menu For Today");
		System.out.println("========================================");
		System.out.println("Owner: " + (name));
		System.out.println("----------------------------------------");
		System.out.println("Item              Qty     Price");
		System.out.println("----------------------------------------");
		System.out.println((itemone) + "              " + (manyone) + "     " + (priceone*manyone));
		System.out.println((itemtwo) + "              " + (manytwo) + "     " + (pricetwo*manytwo));
		System.out.println((itemthree) + "              " + (manythree) + "     " + (pricethree*manythree));
		System.out.println("----------------------------------------");
		System.out.println("Subtotal:                 " + ((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree)));
		System.out.println("Tax (9.75%):              " + (0.0975*((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree))));
		System.out.println("Tip:                      " + (percentage));
		
		double mathmath = percentage/100.0;
		double tipamount = (((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree))*(mathmath));
		
		System.out.println("Tip Amount:               " + (tipamount));
		System.out.println("========================================");
		System.out.println((percentage*0.01)*((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree)) + (0.975*((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree))) + ((manyone*priceone)+(manytwo*pricetwo)+(manythree*pricethree)));
		System.out.println("========================================");
		System.out.println("  ");
		System.out.println("Thanks for eating at " + (restaurantname)+ "!");
		System.out.println("Come back soon --- we'll always have a byte for you!");











	}
}
