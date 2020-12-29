package com.example.lib;

public class TestClass {

    public static void main(String[] args) {
        //简单工厂模式
//        Animal cat = AnimalFactory.createAnimal("Cat");
//        cat.eat();

        //工厂方法模式
//        AnimalFactory animalFactory = new DogFactory();
//        Animal animal = animalFactory.createAnimal();
//        animal.eat();

        //抽象工厂模式
        AnimalFactory femaleAnimalFactory = new FemaleAnimalFactory();
        Animal dog = femaleAnimalFactory.createDog();
        dog.eat();
        Animal cat = femaleAnimalFactory.createCat();
        cat.eat();
    }
}