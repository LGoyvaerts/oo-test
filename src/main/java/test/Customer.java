package test;

/**
 * Created by gol on 07.02.2017.
 */
public class Customer extends Person {

    private long customerId;

    public static void main(String[] args) {

        Customer customer = new Customer(12345, "Lorris");
        System.out.println(customer);
    }

    public Customer(long customerId, String name) {

        // use specific super constructor (from Person)
        super(name);
        this.customerId = customerId;
    }

    public long getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {

        // use super implementation (from Person) and enrich with customer id
        return "Customer " + super.toString() + " with id " + customerId;
    }
}
