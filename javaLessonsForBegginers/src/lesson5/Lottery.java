package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class Lottery {

    private static int[] nums = new int[50];

    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            nums[i] = i;
        }

        for (int i = 1; i < 50; i++) {
            int r = (int) Math.ceil(Math.random() * 49);
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(Integer.toString(nums[i]) + " ");
        }

    }
}
