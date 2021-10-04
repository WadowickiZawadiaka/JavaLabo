package com.company;

import java.util.Date;

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

}
