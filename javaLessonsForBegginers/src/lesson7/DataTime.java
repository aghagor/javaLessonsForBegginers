package lesson7;

import java.time.LocalDateTime;

/**
 * Created by Goro on 22.07.2017.
 */
public class DataTime {

    public static String fields;

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("\nNow " + date);

        date = date.withYear(2017);
        System.out.println("\nThen this time " + date);

        fields = "\nYear:\t\t\t" + date.getYear();
        fields += "\nMonth:\t\t\t" + date.getMonth();
        fields += "\nMonth number:\t\t\t" + date.getMonthValue();
        fields += "\nDay of week:\t\t\t" + date.getDayOfWeek();
        fields += "\nDay of month:\t\t\t" + date.getDayOfMonth();
        fields += "\nDay of year:\t\t\t" + date.getDayOfYear();
        fields += "\nHour:\t\t\t" + date.getHour();
        fields += "\nMinute:\t\t\t" + date.getMinute();
        fields += "\nSecond:\t\t\t" + date.getSecond();

        System.out.println(fields);
    }
}
