/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] arr1 = new int[21];
		System.out.println("--------------------------------------------");
		System.out.println("These are the 20 numbers: ");
		for(int x = 0; x<arr1.length; x++){
			int rand = (int) (Math.random()*10 + 1);
			arr1[x] = rand;
			System.out.print(arr1[x] + " ");
		}
		System.out.println(" ");
		System.out.println("--------------------------------------------");

		int randnum = (int) (Math.random()*10+1);
		System.out.println("The random number to look for is " + randnum);
		
		int total = 0;
		for(int z = randnum + 1; z<arr1.length; z++){
				if(arr1[randnum] == arr1[z]){
					System.out.println("Duplicate found at index " + z);
					total++;
				}
			}
		
		System.out.println("The total number of duplicates is " + total);
		System.out.println("--------------------------------------------");
		
		System.out.println("Looking for two in a row: ");
		int xyz = (arr1.length - 1);
		for(int o = 0; o<xyz; o++){
			int p = arr1[o+1];
			if(arr1[o]==(arr1[p])){
				System.out.println("Two in a row found at indexes " + o + " and " + p + ". The number is " + arr1[0]);
			}
		}

		
		
	}
}
