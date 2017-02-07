package test.zoo;

import test.zoo.animals.abilities.Talking;

/**
 * Created by gol on 07.02.2017.
 */
public abstract class Animal extends Meat {

    public abstract int getNumberOfLegs();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
