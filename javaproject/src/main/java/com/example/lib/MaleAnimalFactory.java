package com.example.lib;

/**
 * @author: Shelter
 * Create time: 2020/12/28, 18:02.
 */
public class MaleAnimalFactory implements AnimalFactory{
    @Override
    public Animal createDog() {
        return new MaleDog();
    }

    @Override
    public Animal createCat() {
        return new MaleCat();
    }
}