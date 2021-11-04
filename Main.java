package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.weight = 1.5;
        dog.age = 12;


        System.out.println(dog.name);

        cat.name = "BYDLAK";
        System.out.println("Is cat alive? " + cat.alive);
        System.out.println("Cat weight: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();


        Integer humanAge = dog.getHumanAge();
        System.out.println("If i'll be human, i'll be " + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Andrzej";
        me.lastName = "Golota";

        me.pet = dog;
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it: " + me.pet.name);


        Car merc = new Car();
        merc.producer = "Mercedes";
        merc.color = "black";
        merc.model = "W124";
        merc.yearOfProduction = 1992;

        Car poldek = new Car();
        poldek.producer = "Polonez";
        poldek.color = "red";
        poldek.model = "Caro";
        poldek.yearOfProduction = 1985;

        Car mietek1 = new Car();
        mietek1.producer = "Miercedes";
        mietek1.color = "red";
        mietek1.model = "Kaczka";
        mietek1.yearOfProduction = 1985;

        Car mietek2 = new Car();
        mietek2.producer = "Miercedes";
        mietek2.color = "red";
        mietek2.model = "Kaczka";
        mietek2.yearOfProduction = 1985;

        me.pet = dog;
        me.pet.feed();
        me.pet.takeForAWalk();


        me.getSalary();
        me.setSalary(-1.0);
        me.setSalary(3500.0);

        Car fiat = new Car();
        fiat.value = 12000.0;
        fiat.model = "bravo";

        me.setCar(fiat);
        if (me.getCar() != null) {
            System.out.println(me.getCar().model);
        }

        try {
            System.out.println(me.getCar().model);
        } catch (Exception e) {
            System.out.println("You don't have a car");
        }

        System.out.println("Is Mercedes equal to Polonez? " + merc.equals(poldek));

        System.out.println("Is mietek1 equal to mietek2? " + mietek1.equals(mietek2));
    }
}
