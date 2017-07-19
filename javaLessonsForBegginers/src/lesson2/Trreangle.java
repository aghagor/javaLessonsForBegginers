package lesson2;

/**
 * Created by Goro on 17.07.2017.
 */
public class Trreangle {
    public static void main(String[] args) {

        // rectangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println();
        System.out.println();


        //treeangle
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        // romb
        System.out.println(getRhombusStringRepresentation(11));
    }

    private static String getRhombusStringRepresentation(int middleStarCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < middleStarCount * 2; i++) {
            if (i < middleStarCount) {
                int offset = middleStarCount - i;
                for (int j = 0; j < middleStarCount; j++) {
                    result.append(j < offset || (i - j) * offset < offset ? " " : "*");
                }
            } else {
                int offset = i - middleStarCount;
                for (int j = 0; j < middleStarCount; j++) {
                    result.append(j < offset || (middleStarCount - j) - 1 < offset ? " " : "*");
                }
            }
            result.append("\n");
        }
        return result.toString();

    }
}

