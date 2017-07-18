package tasks;

/**
 * Created by Goro on 17.07.2017.
 */
public class Trreangle {
    public static void main(String[] args) {
        System.out.println(getRhombusStringRepresentation(11));

        // rectangle
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }

        int num =1;

        while (num<5){
            for (int k = 0; k < 10; k++) {
                System.out.print(" *");
            }
            num++;
            System.out.println(" ");
        }
        System.out.println();
        System.out.println();


        //treeangle
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" *");
//            }
//            System.out.println(" ");
//        }

        int num2 = 1;
        while (num2 <6){
            for (int i = 0; i < num2; i++) {
                System.out.print(" *");
            }
            num2++;
            System.out.println(" ");
        }

        // romb
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

