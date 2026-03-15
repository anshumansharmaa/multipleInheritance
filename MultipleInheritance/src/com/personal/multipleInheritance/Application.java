package com.personal.multipleInheritance;

public class Application {

	public static void main(String[] args) {

		Human human = new LivingBeing();
		human.speak();

		Animal animal = new LivingBeing();
		animal.makeSound();
	}
}