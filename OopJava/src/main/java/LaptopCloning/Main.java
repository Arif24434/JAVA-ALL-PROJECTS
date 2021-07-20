package LaptopCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        LaptopCloning hp = new LaptopCloning("hp","ProBook",500);
        LaptopCloning toshiba = new LaptopCloning("toshiba","GalaxyNovo",750);

        LaptopCloning asus =LaptopCloning.from(toshiba);
        System.out.println(asus.getModel());
        System.out.println(asus.getAmountOfMemory());


    }
}
