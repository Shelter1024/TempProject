package com.example.lib;

/**
 * @author: Shelter
 * Create time: 2020/12/28, 17:54.
 */
public class FemaleAnimalFactory implements AnimalFactory{

    @Override
    public Animal createDog() {
        return new FemaleDog();
    }

    @Override
    public Animal createCat() {
        return new FemaleCat();
    }
}