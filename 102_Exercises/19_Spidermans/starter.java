/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobeyMaguire = new Spiderman();
		tobeyMaguire.setActor("Tobey Maguire");
		tobeyMaguire.setAge(48);
		tobeyMaguire.setVillian("Green Goblin");
	
	
		Spiderman andrewGarfield = new Spiderman();
		andrewGarfield.setActor("Andrew Garfield");
		andrewGarfield.setAge(40);
		andrewGarfield.setVillian("Electro");

	
		Spiderman tomHolland = new Spiderman("Tom Holland", 27, "The Vulture");
		tomHolland.setActor("Tom Holland");
		tomHolland.setAge(27);
		tomHolland.setVillian("The Vulture");
	
	
		Spiderman elinMarghosian = new Spiderman();
		elinMarghosian.setActor("Elin Marghosian");
		elinMarghosian.setAge(15);
		elinMarghosian.setVillian("English BOOOOOOOO");


		
	}
}
