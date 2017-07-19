package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Convert {
    private static float daysFloat = 365.25f;
    private static String weeksString = "52";

    public static void main(String[] args) {
        int days = (int) daysFloat;
        int weeksInt = Integer.parseInt(weeksString);
        int week = days / weeksInt;

        System.out.println("Days in week: " + week);

    }
}
