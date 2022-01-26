package Creatures;

import wsb.Human;

public interface Saleable {
    //wszystkie metody public i abstract

    void sale(Human seller, Human buyer, Double price);
}
