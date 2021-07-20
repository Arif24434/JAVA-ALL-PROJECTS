public class FindMinimumNumber {

    public static void main(String[] args){
        String s = "1 2 -3 10 -5 0";

        String[] arr = s.split(" ");

        int result = Integer.parseInt(arr[0]), temp;
        for(int i = 1; i<arr.length; i++) {
            temp = Integer.parseInt(arr[i]);
            //store lowest in result
            if(result>temp)
                if(temp<result) {
                    result = temp;
                }
        }


        System.out.println(result);

    }


}


