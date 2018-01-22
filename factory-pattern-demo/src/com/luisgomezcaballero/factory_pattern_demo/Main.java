package com.luisgomezcaballero.factory_pattern_demo;

public class Main {

	public static void main(String[] args) {
		
		Animal animal1 = AnimalFactory.getAnimal("cat");
		System.out.println("animal1 says: " + animal1.getSound());
		
		Animal animal2 = AnimalFactory.getAnimal("dog");
		System.out.println("animal2 says: " + animal2.getSound());
		
	}

}
