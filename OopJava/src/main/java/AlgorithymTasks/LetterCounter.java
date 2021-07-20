package AlgorithymTasks;

import java.util.Scanner;

public class LetterCounter {

    public static void main(String[] args) {

        System.out.println("Enter the sentences or Word:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 1;

        for (i = 0; i < s.length() - 1; i++)
        {

            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                i++;
            }
        }
        System.out.println("Number of Letter:"+i);


    }


}
