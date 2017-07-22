package tasks;

/**
 * Created by Goro on 22.07.2017.
 */
public class Time {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {//time
            for (int j = 1; j < 60; j++) {//minute
                for (int k = 1; k < 60; k++) {//second
                    String time = i+":"+j+":"+k;
                    System.out.println(time);
                }
            }
        }
    }
}
