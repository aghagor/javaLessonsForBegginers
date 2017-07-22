package lesson6;

/**
 * Created by Goro on 22.07.2017.
 */
public class Constructor {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.getCar();
        Car ferrari = new Car();
        ferrari.setCar("Ferrari", "Red", "Sport");
        ferrari.getCar();
    }
}
