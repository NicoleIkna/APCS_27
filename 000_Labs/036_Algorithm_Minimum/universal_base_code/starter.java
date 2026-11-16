/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int [] a = new int[ (int) (Math.random()*150 + 51)];
		
	
		for(int y = 0; y<a.length; y++){
			int abc = (int) (Math.random()*100 + 1);
			a[y] = abc;
		}
		
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<a.length; i++){
			if(a[i] < min){
				min = a[i];
			}
		}
		System.out.println(min);
		
		
		int max = 0;
		for(int x = 0; x<a.length; x++){
			if(a[x] > max){
				max = a[x];
			}
		}
		System.out.println(max);

		int total = 0;
		int avg = 0;
		for(int x = 0; x < a.length; x++){
			total = total + a[x];
		}
		avg = total/a.length;
		System.out.println(avg);

		System.out.println(a.length);
	
	
	}



}
