/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();

		PooleDwarf d1 = new PooleDwarf(randName(), 20);
		PooleDwarf d2 = new PooleDwarf(randName(), 21);
		PooleDwarf d3 = new PooleDwarf(randName(), 22);
		PooleDwarf d4 = new PooleDwarf(randName(), 23);
		PooleDwarf d5 = new PooleDwarf(randName(), 24);
		PooleDwarf d6 = new PooleDwarf(randName(), 25);
		PooleDwarf d7 = new PooleDwarf(randName(), 26);
		
		int duplicates = 0;

		if(d1.isSameName(d2.getName())){
			duplicates++;
		}

		if(d1.isSameName(d3.getName())){
			duplicates++;
		}

		if(d1.isSameName(d4.getName())){
			duplicates++;
		}

		if(d1.isSameName(d5.getName())){
			duplicates++;
		}

		if(d1.isSameName(d6.getName())){
			duplicates++;
		}

		if(d1.isSameName(d7.getName())){
			duplicates++;
		}
		System.out.println(d1.getName() + " was the name with " + duplicates + " matches.");
		
	}
}
