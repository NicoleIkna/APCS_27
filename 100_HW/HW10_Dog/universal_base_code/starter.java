/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String dogName = sc.nextLine();
		Dog dog1 = new Dog(dogName);
		
		System.out.println("What age should " + dogName + " be?");
		int dogAge = sc.nextInt();
		dog1.setAge(dogAge);
		
		Dog dog2 = new Dog("Toto", "Carrien Terrier");

		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");

		boolean firstSleeping = dog1.isSleeping();
		boolean firstBarked = false;

		if(firstSleeping){
			System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
		}
		else{
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
			firstBarked = true;
		}

		boolean secondSleeping = dog2.isSleeping();

		if(secondSleeping){
			System.out.println(dog2.getName() + " is sleeping! Don't wake " + dog2.getName() + " up!");
			if(firstBarked){
				System.out.println(dog2.getName() + " hears " + dog1.getName() + "!");
				dog2.bark();
			}
		}
		
		else{
			System.out.println(dog2.getName() + " isn't sleeping! ");
			dog2.bark();

		}





	}
}
