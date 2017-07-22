package lesson7;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Goro on 22.07.2017.
 */
public class Format {

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("\nNumber: " + nf.format(123456789));

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\nMoney: " + cf.format(1234.50f));

        NumberFormat pf = NumberFormat.getPercentInstance();
        System.out.println(String.format("\nPercent: " + pf, 0.75f));

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy");
        System.out.println("\nDate: " + now.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a");
        System.out.println("\nTime: " + now.format(tf));

    }
}
