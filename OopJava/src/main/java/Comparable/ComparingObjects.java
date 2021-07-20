package Comparable;

import java.util.Objects;

public class ComparingObjects implements Comparable<ComparingObjects> {

private String items;
private int price;

    public ComparingObjects(String items, int price) {
        this.items = items;
        this.price = price;
    }
    public String getItems() {
        return items;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "ComparingObjects{" +
                "items='" + items + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if(o==null || getClass() != o.getClass());return false;
    }
    @Override
    public int hashCode () {
        return Objects.hash(items,price);
    }

    @Override
    public int compareTo(ComparingObjects anotherComparingObiject) {
        return this.price- anotherComparingObiject.price;
    }
}
