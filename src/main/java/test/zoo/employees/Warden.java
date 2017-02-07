package test.zoo.employees;

import test.zoo.Meat;
import test.zoo.animals.species.Human;

/**
 * Created by gol on 07.02.2017.
 */
public class Warden extends Human {


    @Override
    public void eat(Meat meat) {
        System.out.println(this + " is eating " + meat);
    }

    @Override
    public String saySomething() {
        return "Hi, I'm here for the security!";
    }
}


