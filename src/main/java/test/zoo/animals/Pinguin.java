package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Meat;
import test.zoo.animals.abilities.Carnivore;
import test.zoo.animals.species.Bird;

/**
 * Created by gol on 07.02.2017.
 */
public class Pinguin extends Bird implements Carnivore {

    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }
}
