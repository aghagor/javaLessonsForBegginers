package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Multi {

    public static void main(String[] args) {
        String msg = "This is local string in class Multi";
        System.out.println(msg);

        System.out.println(Data.txt);
        Data.greeting();
        Draw.line();
    }

}
