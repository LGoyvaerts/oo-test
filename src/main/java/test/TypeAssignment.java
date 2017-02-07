package test;

import test.zoo.Animal;
import test.zoo.Meat;
import test.zoo.animals.Flamingo;
import test.zoo.animals.abilities.Flying;
import test.zoo.animals.abilities.Herbivore;
import test.zoo.animals.abilities.Talking;
import test.zoo.animals.species.Bird;

public class TypeAssignment {

    public static void main(String[] args) throws Exception {

        Flamingo something = new Flamingo();

        Flamingo flamingo = something;
        // String string=something;
        Object object = something;

        Animal animal = something;
        Bird bird = something;
        Herbivore herbivore = something;
        // Carnivore carnivore=something;
        // Omnivore omnivore=something;
        // Tiger tiger=something;
        // Bacon bacon=something;
        Meat meat = something;

        Talking talking = something;
        Flying flying = something;
    }
}
