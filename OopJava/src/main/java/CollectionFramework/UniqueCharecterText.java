package CollectionFramework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharecterText {
    public static void main(String[] args) {
        String Text="This is a text";

        Set<Character> HashSetText=new HashSet<>();
        HashSetText.add('T');
        HashSetText.add('h');
        HashSetText.add('i');
        HashSetText.add('s');
        HashSetText.add('i');
        HashSetText.add('s');
        HashSetText.add('a');
        HashSetText.add('t');
        HashSetText.add('e');
        HashSetText.add('x');
        HashSetText.add('t');

        System.out.println(HashSetText);
    }


    public static class UniqueSymbol {

        public static void main(String[] args) {

            Scanner kb = new Scanner(System.in);
            String word = "";

            System.out.println("Enter a word/sentence: ");
            word = kb.nextLine();

            uniqueCharacters(word);
        }

        public static void uniqueCharacters(String test) {
            String temp = ",";
            for (int i = 0; i < test.length(); i++) {

                if (temp.indexOf(test.charAt(i)) == -1) {
                    temp = temp + (test.charAt(i)+ ",");
                }
            }

            System.out.println(temp + ",");

        }
    }
}
