import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gol on 07.02.2017.
 */
public class ListTest {

    @Test
    public void test() {

        //List<String> stringList=new LinkedList<>();
        List<String> stringList = new ArrayList<>();

        // adding items
        stringList.add("Peter");
        stringList.add("René");
        stringList.add("Thomas");

        // size
        System.out.println("List has " + stringList.size() + " items");

        // getting items by index
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(i);
            System.out.println("Item at index " + i + ": " + s);
        }

        // iterating over lists
        for (String s : stringList) {
            System.out.println("Item: " + s);
        }

        // removing items
        System.out.println("Removing René: " + stringList.remove("René"));
        System.out.println("Removing Cosimo: " + stringList.remove("Cosimo"));
        System.out.println("Removing René again: " + stringList.remove("René"));

        System.out.println("List has " + stringList.size() + " items");
        for (String s : stringList) {
            System.out.println("Item: " + s);
        }
    }
}
