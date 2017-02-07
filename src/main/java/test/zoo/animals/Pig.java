package test.zoo.animals;

import test.zoo.Animal;
import test.zoo.Bacon;
import test.zoo.Meat;
import test.zoo.Plant;
import test.zoo.animals.abilities.Omnivore;
import test.zoo.animals.abilities.Talking;

/**
 * Created by gol on 07.02.2017.
 */
public class Pig extends Animal implements Omnivore, Talking {
    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }

    @Override
    public void eat(Plant plant) {
        System.out.println(this + " is eating a " + plant);
    }

    public Bacon produce(){
        return new Bacon();
    }

    @Override
    public String saySomething() {
        return "Oink oink!";
    }
}
