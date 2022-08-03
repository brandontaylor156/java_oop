package com.btaylor.zoo;

public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Flying away");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Eating human");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("Town being attacked");
		energyLevel -= 100;
	}
}
