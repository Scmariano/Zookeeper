package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("The gorilla is throwing something");
		this.setEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("I love bananas");
		this.setEnergyLevel(10);
	}
	
	public void climb() {
		System.out.println("Climbing is tiring!");
		this.setEnergyLevel(-10);
	}

}
