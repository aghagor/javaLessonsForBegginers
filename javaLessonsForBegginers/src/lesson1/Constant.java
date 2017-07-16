package lesson1;

/**
 * Created by Goro on 16.07.2017.
 */
public class Constant {

    //constants
    public static final int TOUCHDOWN = 6;
    public static final int CONVERSION = 1;
    public static final int FIELDGOAL = 3;

    // in java we declare variables as a private
    private static int td;
    private static int fg;
    private static int pat;
    private static int total;

    // the main method
    public static void main(String[] args) {
        td = 4 * TOUCHDOWN; //4*6=26
        pat = 3 * CONVERSION; //3*1=3
        fg = 2 * FIELDGOAL; //2*3=6
        total = td + pat + fg; //26+3+6=33

        System.out.println("Count: " + total);
    }
}
