package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class StringLength {
    private static String lang = "Java";
    private static String serias = " in easy steps!!!";

    private static String title = lang.concat(serias);

    public static void main(String[] args) {
        System.out.print("\"" + title + "\" include ");
        System.out.println(title.length() + " symbols");
    }
}
