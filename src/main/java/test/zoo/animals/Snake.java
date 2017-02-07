package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Meat;
import test.zoo.animals.abilities.Carnivore;
import test.zoo.animals.abilities.Talking;

/**
 * Created by gol on 07.02.2017.
 */
public class Snake extends Animal implements Carnivore, Talking {
    @Override
    public int getNumberOfLegs() {
        return 0;
    }

    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }

    @Override
    public String saySomething() {
        return "zzzzzzzzzz!";
    }
}
