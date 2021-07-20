import java.util.Locale;
import java.util.Scanner;

public class TrafficLightSwitchCase {
    public static void main(String[] args) {

        String A = "red,red+yellow,yellow,green";
        Scanner input = new Scanner(System.in);
        System.out.println("Which light is Blinking?");
        A = input.nextLine();

        switch (A.toLowerCase(Locale.ROOT)) {
            case "red":
                System.out.println("Stay there");
                break;

            case "red+yellow":
                System.out.println("prepare to start within few seconds");
                break;

            case "yellow" :
                System.out.println("Get ready to go");
                break;
            case "green" :
                System.out.println("go..Go..Go");
                break;
        }

    }
}
