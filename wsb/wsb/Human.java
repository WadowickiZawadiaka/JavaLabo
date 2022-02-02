package wsb;

import Creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Human extends Animal {

    private static final int DEFAULT_GARAGE_SIZE = 5;
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    public Animal pet;
    public Double cash = 10000.0;
    public Phone phone;
    public Car[] garage;


    Human() {
        super("Human");
        this.salary = 5000.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

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

    public void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            for (int i = 0; i < this.garage.length; i++){
                if (this.hasFreeParkingLot() == true) {
                    this.garage[i] = newCar;
                System.out.println("You bought a car for cash");
                break;
                }
            }
        } else if (this.salary > newCar.value / 12) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.hasFreeParkingLot() == true) {
                    this.garage[i] = newCar;
                    System.out.println("You bought a car on instalments");
                    break;
                }
            }
        } else {
            System.out.println("Without cash, you can't buy anything :(");
        }
    }

    public Car getCar() {
        for (int i = 0; i < garage.length; i++) {
            System.out.println("Your cars " + garage[i]);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(age, human.age) && Objects.equals(salary, human.salary) && Objects.equals(pet, human.pet) && Objects.equals(cash, human.cash) && Objects.equals(phone, human.phone) && Arrays.equals(garage, human.garage);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), firstName, lastName, age, salary, pet, cash, phone);
        result = 31 * result + Arrays.hashCode(garage);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", pet=" + pet +
                ", cash=" + cash +
                ", phone=" + phone +
                ", garage=" + Arrays.toString(garage) +
                '}';
    }

    public boolean hasCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeParkingLot() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++){
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++){
            if (this.garage[i] == null) {
                this.garage[i] = car;
                return;
            }
        }
    }
}
