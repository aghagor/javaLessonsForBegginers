package lesson2;

/**
 * Created by Goro on 18.07.2017.
 */
public class Bitwise {
    public static void main(String[] args) {
        int fs = 53;

        System.out.println("Flag 1 : " + (((fs & 1) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 2 : " + (((fs & 2) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 3 : " + (((fs & 4) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 4 : " + (((fs & 8) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 5 : " + (((fs & 16) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 6 : " + (((fs & 32) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 7 : " + (((fs & 64) > 0) ? "ON" : "OFF"));
        System.out.println("Flag 8 : " + (((fs & 128) > 0) ? "ON" : "OFF"));
    }
}