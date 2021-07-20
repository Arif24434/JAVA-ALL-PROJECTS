import java.util.Scanner;
public class TrafficLight {
    public static void main(String[] args) {

        String reply, reply1, reply2, reply3;
        Scanner input = new Scanner(System.in);
        System.out.println("Which light is Blinking?");
        reply = input.nextLine();

        if (reply.equalsIgnoreCase("red")){

            System.out.println("Stay there");
        }

        else  {
            System.out.println("Soon journey will start");
        }

        System.out.println("Which light is Blinking, Now?");
        reply1 = input.nextLine();

        if (reply1.equalsIgnoreCase("yellow+red")){

            System.out.println("Get ready to go");

        } else {
            System.out.println("Stay there");
        }

        System.out.println("Which light is Blinking, Now?");
        reply2 = input.nextLine();

        if (reply2.equalsIgnoreCase("yellow")){

            System.out.println("prepare to start within few seconds");

        } else {
            System.out.println("Stay there");
        }

        System.out.println("Which light is Blinking, Now?");
        reply3 = input.nextLine();

        if (reply3.equalsIgnoreCase("Green")){

            System.out.println("G0..Go..Go..");

        } else {
            System.out.println("Stay there");
        }

    }
}
