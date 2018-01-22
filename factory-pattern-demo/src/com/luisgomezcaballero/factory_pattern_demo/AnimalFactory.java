package com.luisgomezcaballero.factory_pattern_demo;

public class AnimalFactory {

	public static Animal getAnimal(String type) {
		if ("cat".equals(type)) {
			return new Cat();
		} else {
			return new Dog();
		}
		
	}
}
