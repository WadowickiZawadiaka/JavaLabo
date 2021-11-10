package wsb;

import devices.Device;
import devices.Phone;
import devices.Car;

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


        me.pet = dog;
        me.pet.feed();
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
        zbyszek.cash = 1000.0;
        Car fiat = new Car();
        me.setSalary(8000.0);
        me.setCar(fiat);
        fiat.sale(me, zbyszek, 2000.0);

        Animal pierdziel = new Animal("felis");
        me.setPet(pierdziel);
        pierdziel.sale(me, zbyszek, 100.0);
        System.out.println("My pet status: " + me.pet);
        System.out.println("Seller pet status: " + zbyszek.pet);
    }
}
