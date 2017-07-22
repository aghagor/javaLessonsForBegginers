package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class SafeInstance {


    public static void main(String[] args) {
        Car porsche = new Car();

        porsche.setCar("Porsche", "Red", "Sedan");
        porsche.getCar();

        Car bentley = new Car();
        bentley.setCar("Bentley", "Black", "Sport");
        bentley.getCar();
    }
}
