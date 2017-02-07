package test.zoo.animals;

import test.zoo.Plant;
import test.zoo.animals.abilities.Flying;
import test.zoo.animals.abilities.Herbivore;
import test.zoo.animals.species.Insect;

/**
 * Created by gol on 07.02.2017.
 */
public class Bee extends Insect implements Flying, Herbivore {

    @Override
    public void eat(Plant plant) {
        System.out.println(this + " is eating a " + plant);
    }
}
