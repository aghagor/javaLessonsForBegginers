package lesson3;

/**
 * Created by Goro on 18.07.2017.
 */
public class Label {
    public static void main(String[] args) {
        outLoop:
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("outerloop continuing work from line i = " + i + " j = " + j);
                    continue outLoop;
                }
                if (i == 3 && j == 1) {
                    System.out.println("Exit from outerloop in line i = " + i + " j = " + j);
                    break outLoop;
                }

                System.out.println("Running i=" + i + " j=" + j);
            }
        }
    }
}
