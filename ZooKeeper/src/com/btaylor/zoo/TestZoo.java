package com.btaylor.zoo;

public class TestZoo {

	public static void main(String[] args) {
		Gorilla myGorilla = new Gorilla();
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.throwSomething();
		myGorilla.eatBananas();
		myGorilla.eatBananas();
		myGorilla.climb();
		myGorilla.displayEnergy();
		
		Bat myBat = new Bat();
		myBat.attackTown();
		myBat.attackTown();
		myBat.attackTown();
		myBat.eatHumans();
		myBat.eatHumans();
		myBat.fly();
		myBat.fly();
		myBat.displayEnergy();
	}

}
