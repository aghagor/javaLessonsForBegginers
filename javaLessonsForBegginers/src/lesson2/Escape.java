package lesson2;

/**
 * Created by Goro on 18.07.2017.
 */
public class Escape {
    public static void main(String[] args) {
        String header = "\n\tNew York weather for 3 days: \n";
        header += "\n\tDay\t\tMax\tMin\tRain\n";
        header += "\t---\t\t----\t---\t----------\n";

        String forecast = "\tSunday\t68F\t48F\tSunny\n";
        forecast += "\tMonday\t69F\t57F\tSunny\n";
        forecast += "\tThusday\t71\t50F\tRainy\n";

        System.out.println(header + forecast);
    }
}
