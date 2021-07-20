package Generics;

public class GenericsMain {

    public static void main(String[] args) {

        Box objectBox = new Box();
        objectBox.put(new String());
        objectBox.getItem();

        objectBox.put("Book");
        System.out.println(objectBox.getItem());
        objectBox.put("Toy");
        System.out.println(objectBox.getItem());
        objectBox.put("Food");
        System.out.println(objectBox.getItem());




    }


}
