package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class FirstInstance {

    public static void main(String[] args) {
        System.out.println("Color: " + Car.COLOR);
        System.out.println("Body type: " + Car.BODY_TYPE);
        System.out.println(Car.accelerate());

        Car porsche = new Car();

        System.out.println("Porsche color: " + porsche.COLOR);
        System.out.println("Porsche body type: " + porsche.BODY_TYPE);
        System.out.println(porsche.accelerate());
    }
}
