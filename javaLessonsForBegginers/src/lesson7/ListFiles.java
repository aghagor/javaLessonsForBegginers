package lesson7;

import java.io.File;

/**
 * Created by Goro on 22.07.2017.
 */
public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Goro\\javaLessonsForBegginers\\javaLessonsForBegginers\\src\\lesson6");
        if (dir.exists()) {
            String[] files = dir.list();
            System.out.println(files.length + " files founded...");
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } else System.out.println("Catalog don't found");
    }
}
