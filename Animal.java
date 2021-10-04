package com.company;

import org.w3c.dom.ls.LSOutput;

public class Animal {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive = true;

    Animal(String species) {
        this.species = species;
        this.alive = true;
        if (this.species == "canis") {
            this.weight = 12.0;
        } else if (this.species == "felis") {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
    }

    void introduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species == "felis" && foodType == "mouse") {
            System.out.println("yes, I like" + foodType);
        } else {
            System.out.println("no you idiot");
        }
    }

    Integer getHumanAge() {
        if (this.species == "canis") {
            return this.age * 7;
        } else if (this.species == "felis") {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    void feed() {
        this.weight += 1;
        System.out.println("Your pet is getting FAT");
        System.out.println("Weight after feeding: " + this.weight);

    }

    Double takeForAWalk() {
        this.weight -= 1;
        System.out.println("Your pet is losing weight");
        System.out.println("Weight after walk: " + this.weight);
        if (this.weight < 1) {
            System.out.println("Your pet is dead!!!!!!!!!!!!");
        }
        return this.weight;
    }
}
