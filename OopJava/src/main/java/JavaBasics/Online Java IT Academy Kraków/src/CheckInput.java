import java.util.Locale;
import java.util.Scanner;

public class CheckInput {
    public static void main(String[] args) {
        String reply, reply1, reply2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input any text, you wish:");
        reply = sc.nextLine();



       do {
           System.out.println("Enter another text please:");
           reply1 = sc.nextLine();

       } while ((!reply1.equalsIgnoreCase("exit"))); //Exit is case sensitive, need to type exit//

        System.out.println("The Game is OVER :)");

    }
}
