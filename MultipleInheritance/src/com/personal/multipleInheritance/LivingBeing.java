package com.personal.multipleInheritance;


public class LivingBeing implements Human, Animal {

    @Override
    public void speak() {
        System.out.println("Humans communicate using speech.");
    }

    @Override
    public void makeSound() {
        System.out.println("Animals produce various sounds.");
    }
}