package AlgorithymTasks;

public class TheLongestAndShortestWord {

    public static void main(String[] args) {
     String sentence=  "Oleg is our best instructor and he teaches us java programming very well.";
     String[] s = sentence.split(" ");
     String shortest = s[0];
     String longest = s[1];

     for (String s1:s){

         if (s1.length()<shortest.length())
         {
             shortest=s1;
         }
         else if (s1.length()>longest.length())
         {
             longest=s1;
         }
     }
        System.out.println("Shortest Word =" + shortest);
        System.out.println("Longest Word =" + longest);


    }
}
