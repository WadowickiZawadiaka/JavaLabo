package Creatures;

import Creatures.Animal;
import wsb.Human;

public interface Edible {

    void eat(Human eater, Animal toEat, Double weight);
}
