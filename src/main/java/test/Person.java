package test;

/**
 * Created by gol on 07.02.2017.
 */
public class Person {

    private String name;

    public static void main(String[] args) throws Exception {

        // creating instances with 'new'
        Person p1 = new Person("Lorris Goyvaerts");
        Person p2 = new Person("Peter Walser");
        Person p3 = new Person();

        // using instances
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // variables point to (primitive) values or instances

        Person me = p1;
        System.out.println("Hello, I am " + me);
    }

    public Person() {
        this.name = "unknown";
    }

    public Person(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
