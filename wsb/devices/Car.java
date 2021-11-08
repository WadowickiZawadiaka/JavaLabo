package devices;

import wsb.Human;
import wsb.Saleable;

import java.util.Objects;

public class Car extends Device implements Saleable {


    public String color;
    public Double value = 15000.0;

    public Car() {
        super(null, null, null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return producer.equals(car.producer) && model.equals(car.model) && yearOfProduction.equals(car.yearOfProduction) && color.equals(car.color) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, yearOfProduction, color, value);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("You don't have enough money!");
        } else if (seller.getCar() == null) {
            System.out.println("Seller doesn't have any car");
        } else if (!seller.getCar().equals(this)) {
            System.out.println("Seller doesn't have this one car");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Successful transaction");
        }
    }
}

