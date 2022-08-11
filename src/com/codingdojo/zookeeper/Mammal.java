package com.codingdojo.zookeeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.printf("Energy Level is: %s\n", energyLevel);
		return	energyLevel;
	}
	
	public void setEnergyLevel(int energy) {
		energyLevel += energy;
	}
}
