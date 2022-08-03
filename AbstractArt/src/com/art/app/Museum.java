package com.art.app;

import java.util.ArrayList;
import java.util.Random;

public class Museum {

	public static void main(String[] args) {
		Painting paint1 = new Painting("Title1", "Author1", "Description1", "PaintType1");
		Painting paint2 = new Painting("Title2", "Author2", "Description2", "PaintType2");
		Painting paint3 = new Painting("Title3", "Author3", "Description3", "PaintType3");
		
		Sculpture sculpture1 = new Sculpture("Title4", "Author4", "Description4", "Material1");
		Sculpture sculpture2 = new Sculpture("Title5", "Author5", "Description5", "Material2");
		
		ArrayList<Art> museum = new ArrayList<Art>();
		
		museum.add(paint1);
		museum.add(paint2);
		museum.add(paint3);
		museum.add(sculpture1);
		museum.add(sculpture2);
		
		// Create instance of random class
		Random randMachine = new Random();
		
		// For loop starting from back of list
		for (int i = museum.size()-1; i > 0; i--) {
			// j set to random index, bounds based on size of i
			int j = randMachine.nextInt(i+1);
			
			// Swap art at position i with art at position j, continue until all indexes (back to front) have been swapped once.
			Art temp = museum.get(i);
			museum.set(i,  museum.get(j));
			museum.set(j, temp);
			museum.get(i).viewArt();
			
		}
		
	}

}
