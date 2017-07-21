package lesson5;

/**
 * Created by Goro on 21.07.2017.
 */
public class StringSearch {

    private static String[] books = {
            "Java in easy steps", "XML in easy steps",
            "HTML in easy steps", "CSS in easy steps",
            "Gone With the Wind", "Drop the Defense"
    };

    private static int counter1 = 0;
    private static int counter2 = 0;
    private static int counter3 = 0;

    public static void main(String[] args) {
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].substring(0, 4) + " | ");

            if (books[i].endsWith("in easy steps")) {
                counter1++;
            }
            if (books[i].startsWith("Java")) {
                counter2++;
            }
            if (books[i].indexOf("easy") == -1) {
                counter3++;
            }
        }
        System.out.println();
        System.out.println("\nFind " + counter1 + " names from that string");
        System.out.println("\nFind " + counter2 + " names with Java");
        System.out.println("\nFind " + counter3 + " names from other string");
    }


}
