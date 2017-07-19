package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Option {
    static String[] arr = {"-es", "-es"};

    public static void main(String[] args) {
        args = arr;

        if (args[0].equals("-en")) {
            System.out.println("Options for English");
        } else if (args[0].equals("-es")) {
            System.out.println("Options for Spain");
        } else System.out.println("Unknown option");


    }

}
