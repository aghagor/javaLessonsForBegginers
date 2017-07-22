package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Car {
    private String maker;
    private String color;
    private String bodyType;

    public static final String COLOR = "Red";
    public static final String BODY_TYPE = "Cupe";

    public Car() {
        maker = "Porsche";
        color = "Black";
        bodyType = "Sedan";
    }

    public static String accelerate() {
        String motion = "Speeding...";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " color " + color);
        System.out.println(maker + " body type " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}
