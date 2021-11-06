package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;
import java.util.Objects;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary = 1500.0;
    Animal pet;
    private Car car;

    Double getSalary() {
        System.out.println(new Date());
        System.out.println("Salary:" + this.salary);
        return this.salary;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Data sent to accouting system");
            System.out.println("Get your annex");
            System.out.println("ZUS is tracing you ( ͡° ͜ʖ ͡°)");
            this.salary = salary;
        } else {
            System.out.println("ERROR, salary under 0");
        }
    }

    void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            this.car = newCar;
            System.out.println("You bought a car for cash");
        } else if (this.salary > newCar.value / 12) {
            this.car = newCar;
            System.out.println("You bought a car on instalments");
        } else {
            System.out.println("Without cash, you can't buy anything :(");
        }
    }

    Car getCar() {
        return this.car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(age, human.age) && salary.equals(human.salary) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
