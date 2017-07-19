package lesson4;

/**
 * Created by HCAV on 19.07.2017.
 */
public class Elements {

    private static int[] kiosk_q1 = {42000, 48000, 50000};
    private static int[] kiosk_q2 = {52000, 58000, 60000};
    private static int[] kiosk_q3 = {46000, 49000, 58000};
    private static int[] kiosk_q4 = {50000, 51000, 61000};


    private static int[] outlet_q1 = {57000, 63000, 60000};
    private static int[] outlet_q2 = {70000, 67000, 73000};
    private static int[] outlet_q3 = {67000, 65000, 62000};
    private static int[] outlet_q4 = {72000, 69000, 75000};

    private static int[] sum = new int[12];
    private static int total = 0;

    public static void main(String[] args) {
        for (int i = 0; i < kiosk_q1.length; i++) {
            sum[i] = kiosk_q1[i] + outlet_q1[i];
            sum[i + 3] = kiosk_q2[i] + outlet_q2[i];
            sum[i + 6] = kiosk_q3[i] + outlet_q3[i];
            sum[i + 9] = kiosk_q4[i] + outlet_q4[i];
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Month " + (i + 1) + " sallery:\t" + sum[i]);
            total += sum[i];
        }

        System.out.println("Yearly sale:\t\t"+total);
    }


}
