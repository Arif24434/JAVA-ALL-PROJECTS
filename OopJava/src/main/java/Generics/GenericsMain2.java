package Generics;

public class GenericsMain2 {

    public static void main(String[] args) {

        Box<Book> bookBox = new Box<>();
        bookBox.put("Novel");
        Box<Toy> toyBox = new Box<>();
        toyBox.put("FootBall");
        Box<Food> foodBox = new Box<>();
        foodBox.put("IceCream");

        System.out.println(bookBox.getItem()+" "+toyBox.getItem()+" "+foodBox.getItem());

        ItemBox <Fantasy> fantasyBooks=new ItemBox<>();
        fantasyBooks.put("HarryPorter Book");
        System.out.println(fantasyBooks.getItem());



    }


}
