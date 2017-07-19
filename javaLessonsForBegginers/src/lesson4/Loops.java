package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Loops {

    private static String[] array = {"Java", "in", "easy", "steps"};
    private static String[] html = {"HTML5", "in", "easy", "steps"};
    private static String[] xml = {"XML", "in", "easy", "steps"};

    public static void main(String[] args) {

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("args[" + i + "] - | " + array[i]);
            }
        }
        System.out.println();
        int j = 0;
        while (j < html.length) {
            System.out.println("html[" + j + "] - | " + html[j]);
            j++;
        }

        System.out.println();

        int k = 0;
        if (xml.length > 0) do {
            System.out.println("\t\txml[" + k + "] - | " + xml[k]);
            k++;
        } while (k < xml.length);
    }
}
