
package CollectionFramework;
import java.util.*;
class Arrest
{
    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<String>();
        long start, end;

        for (int i = 0; i < 1000000; i++) {
            alist.add(String.valueOf(i));
        }

        ListIterator<String> it = alist.listIterator();

        start = System.currentTimeMillis();
        while (it.hasNext()) {
            String s = it.next();
        }
        end = System.currentTimeMillis();

        System.out.println("Iterator start: " + start + ", end: " + end + ", delta: "
                + (end - start));
        start = System.currentTimeMillis();
        int ixx = 0;
        for (int i = 0; i < 100000; i++) {
            String s = alist.get(i);
        }

        System.out.println(ixx);
        end = System.currentTimeMillis();
        System.out.println("for loop start: " + start + ", end: " + end + ", delta: "
                + (end - start));

    }
    {
        LinkedList<String> blist = new LinkedList<String>();
        long start, end;

        for (int i = 0; i < 1000000; i++) {
            blist.add(String.valueOf(i));
        }

        ListIterator<String> it = blist.listIterator();

        start = System.currentTimeMillis();
        while (it.hasNext()) {
            String s = it.next();
        }
        end = System.currentTimeMillis();

        System.out.println("Iterator start: " + start + ", end: " + end + ", delta: "
                + (end - start));
        start = System.currentTimeMillis();
        int ixx = 0;
        for (int i = 0; i < 100000; i++) {
            String s = blist.get(i);
        }

        System.out.println(ixx);
        end = System.currentTimeMillis();
        System.out.println("for loop start: " + start + ", end: " + end + ", delta: "
                + (end - start));

    }
}

