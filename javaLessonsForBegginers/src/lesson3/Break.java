package lesson3;

/**
 * Created by Goro on 18.07.2017.
 */
public class Break {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                if (i == 2 && j == 1) {
                    System.out.println("Exit from inner loop in line i = " + i + " j = " + j);
                    break;
                }
                if (i == 3 && j == 2) {
                    System.out.println("Continuing inner loop in line i = " + i + " j = " + j);
                    continue;
                }
                System.out.println("Iteration i = " + i + " j = " + j);
            }
        }
    }
}
