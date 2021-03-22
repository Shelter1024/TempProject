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

        int[] nums = new int[] {0,0,1,1,1,1,2,3,3};
        int length = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int duplicateCount = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] < nums[j] || duplicateCount < 2) {
                i++;
                if (nums[i] != nums[j]) {
                    duplicateCount = 1;
                } else {
                    duplicateCount++;
                }
                nums[i] = nums[j];
            } else {
                duplicateCount++;
            }
        }
        return i + 1;
    }
}