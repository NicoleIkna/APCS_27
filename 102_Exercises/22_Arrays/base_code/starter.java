/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int [1001];
		 int x = 0;
		 while(x<arr1.length){
			arr1[x]=(x+1)*3;
			x++;
		 }
		 
		 x=0;
		 while(x<arr1.length){
			System.out.print(arr1[x] + ", ");
			x++;
		 }

		 System.out.print("----------------------------------------------------------------------------------------------------------------------");

		 int [] arr2 = new int [1000];
		 x = 0;
		 
		 while(x<arr2.length){
			arr2[x] = (1000-x);
			x++;
		 }
		x=0;
		 while(x<arr2.length){
			System.out.print(arr2[x] + ", ");
			x++;
		 }

		 
	}
}
