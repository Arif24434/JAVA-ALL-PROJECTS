package AlgorithymTasks;

import java.util.HashMap;
import java.util.Map;
public class LetterCounter2 {

    private static void LetterCount(String Words){

     Map<String, Integer >words = new HashMap<String,Integer>();
     String WordsChar[]= Words.split(" ");

     for (String Word: Words.split(" ")) {

        if (words.containsKey(Word)){
            words.put(Word,words.get(Word) + 1);

        } else{
            words.put(Word,1);

        }

     }
        System.out.println(words);
    }

    public static void main(String[] args) {

        LetterCount("A R I F E F T E K H A R A H M E D ");

    }

}
