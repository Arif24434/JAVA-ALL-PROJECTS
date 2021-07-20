public class SplitWord {

    public static void main(String[] args) {

                //Initialize the String which needs to be split
                String str = "TEXT";

                //Use the Split method and store the array of Strings returned in a String array.
                String[] arr = str.split("(?!^)");

                //Printing the characters using for-each loop
                for(String character : arr)
                    System.out.print(character+"          ");

    }

}
