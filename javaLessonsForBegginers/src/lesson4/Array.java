package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Array {
    public static void main(String[] args) {
        String[] strings = {"Java ", "is ", "a ", "good ", "programming ", "language"};

        int[] num = new int[3];
        num[0] = 100;
        num[1] = 200;

        strings[0] = "Android ";

        System.out.println("Lenght of the string array: " + strings.length);
        System.out.println("Lenght of the integers array: " + num.length);
        System.out.println(num[0] + "," + num[1] + "," + num[2]);

        System.out.println(strings[0] + strings[1] + strings[2] + strings[3] + strings[4] + strings[5]); //book example

        // my initialization
        String text="";
        for (int i = 0; i < strings.length; i++) {
            text+=strings[i];
        }
        System.out.println( text);

    }
}
