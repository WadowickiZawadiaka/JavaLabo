package devices;

import java.util.Objects;

public class Phone extends Device {

    public Double screenSize;
    public String os;

    Phone() {
        super("Szajsung", "S69", 2021);

    }


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
}
