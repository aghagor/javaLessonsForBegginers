package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Args {
    static String[] array = {"16", "/", "4"};

    public static void main(String[] args) {
        args = array;

        if (args.length != 3) {
            System.out.println("Incorect arguments number");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        String msg = args[0] + args[1] + args[2] + "=";

        if (args[1].equals("+")) {
            msg += num1 + num2;
        } else if (args[1].equals("-")) {
            msg += num1 - num2;
        } else if (args[1].equals("x")) {
            msg += num1 * num2;
        } else if (args[1].equals("/")) {
            msg += num1 / num2;
        } else msg = "Unknown operator";
        System.out.println(msg);
    }

}
