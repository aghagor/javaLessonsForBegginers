package lesson7;

import java.util.Arrays;

/**
 * Created by Goro on 22.07.2017.
 */
public class Sort {

    public static void main(String[] args) {
        String[] names = {"Hayk", "Gor", "Karen", "Vache", "Narek", "Mno"};
        int[] nums = {600, 200, 400, 300, 500, 100};

        display(names);
        display(nums);

        Arrays.sort(names);
        Arrays.sort(nums);

        display(names);
        display(nums);
    }

    public static void display(String[] elems) {
        System.out.println("\nStrings array:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Element " + i + " - " + elems[i]);
        }
    }

    public static void display(int[] elems) {
        System.out.println("\nIntegers array:");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Element " + i + " - " + elems[i]);
        }
    }
}
