/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] rand = new int [1001];
		int x = 0;
		while(x<rand.length){
			int y = (int) (Math.random()*100 + 1);
			rand[x] = y;
			System.out.println(rand[x]);
			x++;
		}
		


		
	}
}
