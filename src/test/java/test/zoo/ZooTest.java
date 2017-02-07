package test.zoo;

import org.junit.Test;
import test.zoo.animals.*;
import test.zoo.animals.abilities.Carnivore;
import test.zoo.animals.abilities.Flying;
import test.zoo.animals.abilities.Herbivore;
import test.zoo.animals.abilities.Omnivore;
import test.zoo.animals.species.Bird;
import test.zoo.animals.species.Insect;

/**
 * Created by gol on 07.02.2017.
 */
public class ZooTest {

    private Zoo zoo = new Zoo();

    public ZooTest() {
        zoo.add(new Dolphin());
        zoo.add(new Elephant());
        zoo.add(new Parrot());
        zoo.add(new Bee());
        zoo.add(new Snake());
        zoo.add(new Tiger());
        zoo.add(new Flamingo());
        zoo.add(new Pinguin());
        zoo.add(new Pig());
        for (int i = 0; i < 3; i++) {
            zoo.add(new Ant());
        }
    }

    @Test
    public void listAnimals() {
        System.out.println("Zoo has " + zoo.getAnimals().size() + " animals:");
        for (Animal a : zoo.getAnimals()) {
            System.out.println(a);
            System.out.println("- has " + a.getNumberOfLegs() + " legs");
            if (a instanceof Bird) {
                System.out.println("- is a bird");
            }
            if (a instanceof Insect) {
                System.out.println("- is a insect");
            }
            if (a instanceof Flying) {
                System.out.println("- can fly");
            }
            if (a instanceof Herbivore) {
                System.out.println("- eats plants");
            }
            if (a instanceof Carnivore) {
                System.out.println("- eats meat");
            }
            if (a instanceof Omnivore) {
                System.out.println("- eats everything");
            }
        }
    }

    @Test
    public void feed() {

        Tiger tiger = new Tiger();
        Parrot parrot = new Parrot();
        Pig pig = new Pig();
        Plant plant = new Plant();
        Bacon bacon = pig.produce();

        tiger.eat(tiger);
        tiger.eat(parrot);
        // tiger.eat(plant); won't work
        tiger.eat(pig);
        tiger.eat(bacon);

        //  parrot.eat(tiger);
        //  parrot.eat(parrot);
        parrot.eat(plant);
        //  parrot.eat(pig);
        //parrot.eat(bacon);

        pig.eat(tiger);
        pig.eat(parrot);
        pig.eat(plant);
        pig.eat(pig);
        pig.eat(bacon);
    }
}
