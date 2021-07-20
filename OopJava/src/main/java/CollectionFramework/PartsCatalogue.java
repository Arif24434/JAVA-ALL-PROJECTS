package CollectionFramework;
import java.util.*;

public class PartsCatalogue {
    public static void main(String[] args) {

        List<String> parts = new ArrayList<>();
        parts.add(0,"Tier");
        parts.add(1,"Mirror");
        parts.add(2,"Seatbelt");
        parts.add(3,"WindShild");
        parts.add(4,"SeatCover");
        parts.add(5,"GearBox");
        parts.add(6,"CarHeater");
        parts.add(7,"CarLight");

        System.out.println(parts.get(7));

        Map<Integer,String> Parts=new HashMap<>();
        Parts.put(1232,"Tier");
        Parts.put(2312,"Mirror");
        Parts.put(4532,"Seatbelt");
        Parts.put(8965,"Windshild");
        Parts.put(4321,"SeatCover");
        Parts.put(3098,"GearBox");
        Parts.put(7243,"CarHeater");
        Parts.put(12709,"CarLight");

        System.out.println(Parts.get(8965));



    }



}
