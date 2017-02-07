package test.zoo.animals;

import test.zoo.Plant;
import test.zoo.animals.abilities.Flying;
import test.zoo.animals.abilities.Herbivore;
import test.zoo.animals.species.Bird;

/**
 * Created by gol on 07.02.2017.
 */
public class Flamingo extends Bird implements Flying, Herbivore {
    @Override
    public void eat(Plant plant) {
        System.out.println(this + " is eating a " + plant);
    }

    @Override
    public String saySomething() {
        return "Gaaarg!";
    }
}
