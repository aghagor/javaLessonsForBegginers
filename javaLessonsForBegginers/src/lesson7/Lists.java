package lesson7;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by Goro on 22.07.2017.
 */
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alfa");
        list.add("Delta");
        list.add("Charlie");
        System.out.println("List: " + list);

        System.out.println("Replaising: " + list.get(1) + "\n");
        list.set(1,"Bravo");


        list.forEach((String x)-> System.out.println("Element: "+x));
    }
}
