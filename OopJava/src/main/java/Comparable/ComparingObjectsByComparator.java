package Comparable;
import java.util.Comparator;
public class ComparingObjectsByComparator implements Comparator <ComparingObjects>{

    @Override
    public int compare(ComparingObjects one, ComparingObjects another) {
        return one.getItems().compareTo(another.getItems());
    }

}
