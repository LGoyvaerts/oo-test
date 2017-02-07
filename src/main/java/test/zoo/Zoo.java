package test.zoo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by gol on 07.02.2017.
 */
public class Zoo {

    private List<Animal> animals = new LinkedList<>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
