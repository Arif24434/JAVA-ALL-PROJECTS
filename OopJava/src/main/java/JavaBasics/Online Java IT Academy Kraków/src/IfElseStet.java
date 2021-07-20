import java.util.Scanner;

public class IfElseStet {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Number");

        int number = scan.nextInt();
        System.out.println(number);

        if (number >= 10) {

            System.out.println("condition is True");

        } else {

            System.out.println(" condition is false");


        }

    }

}
