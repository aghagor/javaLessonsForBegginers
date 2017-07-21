package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class Pi {
    public static void main(String[] args) {
        float radius = Float.parseFloat(String.valueOf(5));
        float shortPi = (float) Math.PI;

        float circ = shortPi * (radius + radius);
        float area = shortPi * (radius * radius);

        System.out.print(Math.PI);
        System.out.println(" " + radius);
        System.out.println(" " + circ);
        System.out.println(" " + shortPi);
        System.out.println(" " + area);

    }

}
