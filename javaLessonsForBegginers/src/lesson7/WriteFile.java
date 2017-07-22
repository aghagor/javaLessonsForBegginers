package lesson7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by Goro on 22.07.2017.
 */
public class WriteFile {

    public static void main(String[] args) {
        String time ="";
        try {
            FileWriter file = new FileWriter("C:\\Users\\Goro\\javaLessonsForBegginers\\" +
                    "javaLessonsForBegginers\\src\\lesson7\\Tam.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            for (int i = 0; i < 25; i++) {//time
                for (int j = 1; j < 60; j++) {//minute
                    for (int k = 1; k < 60; k++) {//second
                        time = i+":"+j+":"+k;
//                        System.out.println(time);
                        bufferedWriter.write(time);
                        bufferedWriter.newLine();
                    }
                }
            }


        } catch (IOException e) {
            System.out.println("Something gone wrong");
        }

    }
}
