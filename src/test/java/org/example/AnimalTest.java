package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testAnimal() {
        Animal animal = new Animal();
        animal.animalSound();
        Pig pig = new Pig();
        pig.animalSound();
        Dog dog = new Dog();
        dog.animalSound();
    }
}