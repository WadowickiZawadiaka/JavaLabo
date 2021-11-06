package com.company.devices;

import java.util.Objects;

public class Phone {

    String producer;
    String model;
    Integer yearOfProduction;
    Double value = 2500.0;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return producer.equals(phone.producer) && model.equals(phone.model) && yearOfProduction.equals(phone.yearOfProduction) && value.equals(phone.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, yearOfProduction, value);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
