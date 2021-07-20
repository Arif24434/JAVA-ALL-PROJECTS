package ClassesObjects;

public class Cat extends Animal {
    @Override
    protected void name() {
        System.out.println("ClassesObjects.AnimalCatCatdemo.Cat name: TOM");
    }

    @Override
    protected void breathe() {
        System.out.println("TOM cat is BREATHING");
    }

    @Override
    protected void eat(String food) {
        System.out.printf("TOM is eating %s,%n",food);
    }

    @Override
    protected void makeSound(String sound) {
        System.out.printf("TOM makes sound %s,%n",sound);
    }
    /*  i am not sure that makeSound will be Override again? */

    @Override
    protected void sleep() {
            System.out.println("Tom is SLEEPING");
            System.out.println("Tom will wake up after 5 hour");
    }

    @Override
    protected void play() {

        System.out.println("Tom is PLAYING");
        System.out.println("Tom is PLAYING with a BALL");
    }
    public static void main(String[] args) {

        Cat TOM= new Cat();
        TOM.name();
        TOM.breathe();
        TOM.eat("Milk");
        TOM.makeSound("MEU");
        TOM.sleep();
        TOM.play();

    }
}
