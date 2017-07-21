package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class CharacterSwap {

    private static String txt = "";

    public static void main(String[] args) {
        if (txt.isEmpty()) {
            txt = " Borokude ";
        }

        //original string
        System.out.println("String: " + txt);
        System.out.println("Length of start string: " + txt.length());


        //String after trimming - deleting spaces
        System.out.println();
        txt = txt.trim();
        System.out.println("String: " + txt);
        System.out.println("Length of string: " + txt.length());

        //Strings first letter
        System.out.println();
        char initial = txt.charAt(0);
        System.out.println("String's first letter: " + initial);

        //String's last letter
        System.out.println();
        initial = txt.charAt((txt.length() - 1));
        System.out.println("String's last letter: " + initial);

        //replacing letters
        System.out.println();
        txt = txt.replace('o', 'a');
        System.out.println("String: " + txt);
    }
}
