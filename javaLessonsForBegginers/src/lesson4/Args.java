package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Args {
    static String[] array = {"16", "/", "4"};

    public static void main(String[] args) {

        if (array.length != 3) {
            System.out.println("Incorect arguments number");
            return;
        }

        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[2]);

        String msg = array[0] + array[1] + array[2] + "=";

        if (array[1].equals("+")) {
            msg += num1 + num2;
        } else if (array[1].equals("-")) {
            msg += num1 - num2;
        } else if (array[1].equals("x")) {
            msg += num1 * num2;
        } else if (array[1].equals("/")) {
            msg += num1 / num2;
        } else msg = "Unknown operator";
        System.out.println(msg);
    }

}
