package devices;

import wsb.Human;
import Creatures.Saleable;

import java.util.Objects;

public class Phone extends Device implements Saleable {

    public Double screenSize;
    public String os;

    public Phone() { super("Szajsung", "S69", 2021); }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return producer.equals(phone.producer) && model.equals(phone.model) && screenSize.equals(phone.screenSize) && os.equals(phone.os) && yearOfProduction.equals(phone.yearOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, screenSize, os, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os=" + os +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void sale (Human seller, Human buyer, Double price) {
        if (buyer.cash < price) {
            System.out.println("You don't have enough money!");
        } else if (seller.phone == null) {
            System.out.println("Seller doesn't have any phone");
        } else if (!seller.phone.equals(this)) {
            System.out.println("Seller doesn't have this one phone");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Successful transaction, you bought a phone");
        }
    }
}
