package com.btaylor.zoo;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public void displayEnergy() {
		System.out.println(energyLevel);
	}
	
}
