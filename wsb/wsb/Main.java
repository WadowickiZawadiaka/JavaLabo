package wsb;

import Creatures.Animal;
import devices.*;
import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Integer x = 3;
        Animal dog = new Animal("canis") {
        };
        Animal cat = new Animal("felis") {
        };

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


        me.pet = dog;
        me.pet.feed(2.5);
        me.pet.takeForAWalk();


        me.getSalary();
        me.setSalary(-1.0);
        me.setSalary(3500.0);

        try {
            System.out.println(me.getCar().model);
        } catch (Exception e) {
            System.out.println("You don't have a car");
        }

        Device washingMashine = new Device("Siemens", "KUTANABOL", 2020, 1500.0);
        System.out.println(washingMashine);

        Human zbyszek = new Human();
        zbyszek.cash = 1500.0;
        Human mareczek = new Human();
        mareczek.cash = 2000.0;

        Car fiat = new LPG();
        fiat.value = 1500.0;
        Car lambiedini = new LPG();
        lambiedini.value = 10000.0;
        Car passerati = new Diesel();
        passerati.value = 5000.0;
        Car lada = new Electric();
        lada.value = 1000.0;
        me.setSalary(8000.0);

        zbyszek.addCar(lambiedini);
        zbyszek.addCar(passerati);
        zbyszek.addCar(lada);

        Animal pierdziel = new Animal("felis"){
        };

        pierdziel.feed(1.0);

        me.pet = pierdziel;
        pierdziel.sale(me, zbyszek, 100.0);
        System.out.println("My pet status: " + me.pet);
        System.out.println("Buyer pet status: " + zbyszek.pet);

        Phone samsung = new Phone();
        Phone hujwej = new Phone();
        hujwej.os = "Michaelsoft Binbows";
        hujwej.screenSize = 4.5;
        me.phone = hujwej;
        samsung.sale(me, zbyszek, 10.0);
        hujwej.sale(me, zbyszek,20.0);

        me.pet = mareczek;
        mareczek.sale(me, zbyszek, 1.0);
/*
        hujwej.installAnApp("Benis calculator", "6.9", "bialystok.com");
        samsung.installAnApp("Ganja spotter", "4.20");
        samsung.installAnApp("Hardbass player", "0.01 unstable broken alpha cracker");
        samsung.installAnApp("pinder");
*/
/*      me.setCar(lambiedini);
        me.addCar(fiat);
        me.getCar();
        lada.sale(me, zbyszek, 50.5);
        fiat.sale(me, zbyszek, 10999.0);
        fiat.sale(me, zbyszek, 1.0);
*/
        zbyszek.getValue();

    }
}
