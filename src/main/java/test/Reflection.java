package test;

import java.lang.reflect.Method;

/**
 * Example: class and instance methods, instance creation with 'new', constructors, constructor/method overloading, initializers
 *
 * Created by gol on 07.02.2017.
 */
public class Reflection {

    public static void main(String[] args) throws Exception {

        Person p1=new Person("Lorris Goyvaerts");

        Class c = p1.getClass();
        System.out.println(c.getName());
        System.out.println(c.getSuperclass().getName());
        for (Method m : c.getMethods()) {
            System.out.println("- " + m);
        }
    }

}
