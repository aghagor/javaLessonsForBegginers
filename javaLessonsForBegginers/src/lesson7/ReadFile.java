package lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Goro on 22.07.2017.
 */
public class ReadFile {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Users\\Goro\\" +
                    "javaLessonsForBegginers\\javaLessonsForBegginers\\" +
                    "src\\lesson7\\Новый текстовый документ.txt");
            BufferedReader buffer = new BufferedReader(file);
            String line = "";
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            buffer.close();
        } catch (IOException e) {
            System.out.println("Something gona incorect");
        }


    }
}
