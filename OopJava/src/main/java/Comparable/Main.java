package Comparable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

List <ComparingObjects> comparingObjectsList=new ArrayList<ComparingObjects>();
     comparingObjectsList.add(new ComparingObjects("Shoe",360));
     comparingObjectsList.add(new ComparingObjects("Shirt",245));
     comparingObjectsList.add(new ComparingObjects("Pant",310));
     comparingObjectsList.add(new ComparingObjects("Hat",150));
     comparingObjectsList.add(new ComparingObjects("Trouser",110));
     comparingObjectsList.add(new ComparingObjects("Belt",80));
     comparingObjectsList.add(new ComparingObjects("Blazer",420));

     comparingObjectsList.sort((Comparator.naturalOrder()));
        System.out.println(comparingObjectsList);
        comparingObjectsList.sort((Comparator.reverseOrder()));
        System.out.println(comparingObjectsList);

     TreeSet<ComparingObjects> comparingObjectsSet = new TreeSet<>(comparingObjectsList);
        System.out.println(comparingObjectsSet);

     comparingObjectsList.sort(new ComparingObjectsByComparator());
        System.out.println(comparingObjectsList);

        TreeSet<ComparingObjects> comparingObjectsTreeSet = new TreeSet<>(new ComparingObjectsByComparator());
        System.out.println(comparingObjectsSet);
        comparingObjectsTreeSet.addAll(comparingObjectsList);
        System.out.println(comparingObjectsTreeSet);
    }
}
