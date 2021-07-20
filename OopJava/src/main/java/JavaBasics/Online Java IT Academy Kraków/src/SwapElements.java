public class SwapElements {
    public static void main(String[] args) {

        int ints[] = {10, 20, 30, 40};

         int src=0;
         int dest=1;
         int temp= ints[src];
         ints[0]=ints[1];
         ints[1]= temp;

        System.out.println(ints[0] + "" + ints[1] + "" + ints[2]+ "" + ints[3] );

   }
}
