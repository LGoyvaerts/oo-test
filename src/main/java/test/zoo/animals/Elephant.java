package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Plant;
import test.zoo.animals.abilities.Herbivore;
import test.zoo.animals.abilities.Talking;

/**
 * Created by gol on 07.02.2017.
 */
public class Elephant extends Animal implements Herbivore, Talking {

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void eat(Plant plant) {
        System.out.println(this + " is eating a " + plant);
    }

    @Override
    public String saySomething() {
        return "Tööröö!";
    }
}
