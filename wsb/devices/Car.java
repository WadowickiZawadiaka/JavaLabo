package devices;

import java.util.Objects;

    public class Car extends Device {


    public String color;
    public Double value = 60000.0;

    Car() {
        super("Ferrari", "Enzo", 2015);
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
}


