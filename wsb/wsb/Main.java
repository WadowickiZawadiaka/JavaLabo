package wsb;

import Creatures.Animal;
import devices.*;
import org.w3c.dom.ls.LSOutput;

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

        Device washingMashine = new Device("Siemens", "KUTANABOL", 2020);
        System.out.println(washingMashine);

        Human zbyszek = new Human();
        zbyszek.cash = 1500.0;
        Human mareczek = new Human();
        mareczek.cash = 2000.0;

        Car fiat = new LPG();
        Car lambiedini = new LPG();
        Car passerati = new Diesel();
        Car lada = new Electric();
        me.setSalary(8000.0);
        me.setCar(fiat);
        zbyszek.setCar(lambiedini);
        zbyszek.setCar(passerati);
        zbyszek.setCar(lada);
        fiat.sale(me, zbyszek, 2000.0);
        fiat.sale(me, zbyszek, 1000.0);

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

        hujwej.installAnApp("Benis calculator", "6.9");
        samsung.installAnApp("Ganja spotter", "4.20");
        samsung.installAnApp("Hardbass player", "0.01 unstable broken alpha cracker");



    }
}
