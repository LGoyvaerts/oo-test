package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Meat;
import test.zoo.animals.abilities.Carnivore;

/**
 * Created by gol on 07.02.2017.
 */
public class Tiger extends Animal implements Carnivore {
    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }
}
