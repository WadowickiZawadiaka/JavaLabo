package devices;

import java.util.Objects;

public class Device {

    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return producer.equals(device.producer) && model.equals(device.model) && yearOfProduction.equals(device.yearOfProduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
