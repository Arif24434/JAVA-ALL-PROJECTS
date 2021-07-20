import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        String reply;
        Scanner input = new Scanner(System.in);
        System.out.println("Is it raining Today?");
        reply = input.nextLine();

        if (reply.equalsIgnoreCase("yes")){

            System.out.println("Take umbrella with you");

        } else {
            System.out.println("Leave umbrella al home");
        }

    }
}
