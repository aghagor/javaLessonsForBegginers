package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Exception {
    private static String[] number = {"20"};

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(number[0]);
            System.out.println("You enter: " + num);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Need number");
        }finally {
            System.out.println("The program stop working");
        }
    }

}
