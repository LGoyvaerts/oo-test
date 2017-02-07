package test.zoo.animals.species;

import test.zoo.Animal;

/**
 * Created by gol on 07.02.2017.
 */
public abstract class Insect extends Animal {

    @Override
    public final int getNumberOfLegs() {
        return 6;
    }
}
