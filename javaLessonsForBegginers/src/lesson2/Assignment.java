package lesson2;

/**
 * Created by Goro on 16.07.2017.
 * using statics and non statics
 */
public class Assignment {
    private static String text = "Fantastic ";
    private static String lang = "Java";
    private static int sum = 10;
    private static int num = 20;
    private int factor = 5;


    public static void main(String[] args) {

        //when using non static variables, we need to use class exemple.
        Assignment factorA = new Assignment();

        text += lang;
        System.out.println(text);
        sum += num;
        System.out.println(sum);
        sum *= factorA.factor;
        System.out.println(sum);
        sum /= factorA.factor;
        System.out.println(sum);
    }
}
