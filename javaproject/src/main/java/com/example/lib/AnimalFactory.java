package com.example.lib;

/**
 * @author: Shelter
 * Create time: 2020/12/28, 14:47.
 */
public interface AnimalFactory {
    //简单工厂
//    private static Dog createDog() {
//        return new Dog();
//    }
//
//    private static Cat createCat() {
//        return new Cat();
//    }
//
//    public static Animal createAnimal(String type) {
//        if ("Dog".equals(type)) {
//            return createDog();
//        } else if ("Cat".equals(type)) {
//            return createCat();
//        } else {
//            return null;
//        }
//    }

    Animal createDog();

    Animal createCat();
}
