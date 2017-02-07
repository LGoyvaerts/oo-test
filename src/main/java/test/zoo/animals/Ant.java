package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Meat;
import test.zoo.Plant;
import test.zoo.animals.abilities.Omnivore;
import test.zoo.animals.abilities.Talking;
import test.zoo.animals.species.Insect;

/**
 * Created by gol on 07.02.2017.
 */
public class Ant extends Insect implements Omnivore {

    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }
    @Override
    public void eat(Plant plant) {
        System.out.println(this + " is eating a " + plant);
    }


}
