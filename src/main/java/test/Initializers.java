package test;

import java.lang.reflect.Method;

/**
 * Example: initializers
 * <p>
 * Created by gol on 07.02.2017.
 */
public class Initializers {

    static {
        System.out.println("Static constructor block");
    }

    {
        System.out.println("Instance constructor block");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Static method");
        new Initializers().test();
    }

    public Initializers() {
        System.out.println("Default constructor");
    }

    public void test(){
        System.out.println("Instance method");
    }

}
