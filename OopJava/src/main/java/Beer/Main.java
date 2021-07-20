package Beer;

public class Main {
    public static void main(String[] args) {

       Beer tiskie = new Beer("Tiskie","Strong",6);
       Beer zubr = new Beer("Zubr","Strong",4);

        Beer tiskie2 = new Beer("Tiskie","Strong",6);

       Beer third = tiskie;
       System.out.println(tiskie==zubr);
        System.out.println(tiskie.equals(tiskie2));
        System.out.println(tiskie.equals(zubr));
        System.out.println(zubr.hashCode());
        System.out.println(tiskie.hashCode());




    }


}
