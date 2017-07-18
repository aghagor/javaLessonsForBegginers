package lesson2;

/**
 * Created by HCAV on 18.07.2017.
 */
public class Logic {
    private boolean yes = true;
    private boolean no = false;

    public static void main(String[] args) {
        Logic logic = new Logic();
        boolean yes = logic.yes;
        boolean no = logic.no;

        System.out.println("Type YES and YES: "+(yes && yes));
        System.out.println("Type YES and NO: "+(yes && no));

        System.out.println("*******************");

        System.out.println("Type YES or YES: "+(yes || yes));
        System.out.println("Type YES or NO: "+(yes || no));
        System.out.println("Type NO or NO: "+(no || no));

        System.out.println("*******************");

        System.out.println("YES: "+yes);
        System.out.println("!YES: "+!yes);
    }
}
