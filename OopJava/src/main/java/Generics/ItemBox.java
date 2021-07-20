package Generics;

public class ItemBox <K extends Item> {
    String item;

    void put (String item){this.item=item;}
    String getItem(){return item;}


}
