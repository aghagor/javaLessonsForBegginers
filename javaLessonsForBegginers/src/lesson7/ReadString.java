package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Goro on 22.07.2017.
 */
public class ReadString {

    public static void main(String[] args) {
        System.out.println("Input the name of this book: ");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println("Exception!!!");
        }
        System.out.println("\nThank you, you are reading "+input);
    }
}
