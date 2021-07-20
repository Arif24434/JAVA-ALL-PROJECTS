import java.util.Scanner;
public class PassCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String pass, pass1, pass2;
        System.out.println("Enter your Password:");
        pass = input.nextLine();


        if(pass.length() < 8){

            System.out.println("Password is Short, at least eight digit is needed");

        } else {
            System.out.println("Password length is ok");
        }

        System.out.println("Enter your Password Again:");
        pass1 = input.nextLine();

          if (pass1.equals(pass)){

            System.out.println("Password matched with previous password");

        } else {
            System.out.println("Password is ok Now");
        }

        System.out.println("Enter your Password Again:");
        pass2 = input.nextLine();

        if (pass1.equals(pass2)){

            System.out.println("Password is Accepted");

        } else {
            System.out.println("Several Wrong password, time is up");
        }

    }

}
