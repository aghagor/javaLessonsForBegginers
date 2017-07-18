package lesson2;

/**
 * Created by HCAV on 18.07.2017.
 */
public class Comparison {

    private static String text = "Fantastic";
    private static String lang = "Java";
    private static boolean state = (text == lang);
    private int dozen = 12;
    private int score = 20;

    public static void main(String[] args) {
        Comparison comparison = new Comparison();
        int dozen = comparison.dozen;
        int score = comparison.score;

        System.out.println("Is Strings the same?? " + state);

        state = (text != lang);
        System.out.println("Is Strings the same?? " + state);

        state = (dozen > score);
        System.out.println("Is big?? " + state);

        state = (dozen < score);
        System.out.println("Is small?? " + state);
    }

}
