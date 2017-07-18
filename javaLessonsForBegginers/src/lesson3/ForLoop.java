package lesson3;

/**
 * Created by Goro on 18.07.2017.
 */
public class ForLoop {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i < 4; i++) {
            System.out.println("outline loop i=" + i);

            for (int j = 1; j < 4; j++) {
                System.out.print("\tinner loop j=" + j);
                System.out.println("\t\t exactly num=" + ++num);
            }
        }
    }
}
