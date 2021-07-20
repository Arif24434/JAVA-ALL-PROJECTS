package ImmutableObjects;

import java.util.HashMap;
import java.util.Map;


public class ImmutableMain {
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());
        Wheel nike=new Wheel(25,50);
        Engine suzuki=new Engine(420,80,"automatic",nike);
        ImmutableCar jaguar =new ImmutableCar("jaguar","AE121",suzuki);

        Wheel nike1=new Wheel(20,40);
        Engine suzuki1=new Engine(400,70,"automatic",nike1);
        ImmutableCar jaguar1 =new ImmutableCar("jaguar1","AE242",suzuki1);

        System.out.println(jaguar);

        Map< ImmutableCar, String> color = new HashMap<>();
        color.put(jaguar, "Red");
        color.put(jaguar1, "Green");

        System.out.printf("jaguar's color is:%s,%n",color.get(jaguar));
        System.out.printf("jaguar1's color is:%s,%n",color.get(jaguar1));
        System.out.println(color);
        System.out.printf("jaguar1 hashcode before name change:%d,%n:",jaguar1.hashCode());
        /*jaguar1.setManufacturer("jaguar1-jaguar");
        System.out.printf("jaguar1's color is:%s,%n",color.get(jaguar1));*/
        System.out.printf("jaguar1 hashcode after name change:%d,%n:",jaguar1.hashCode());

        Wheel jaguar1Wheel=jaguar1.getEngine().getWheel();
        jaguar1Wheel.setRadius(10);
        System.out.println(color);
        System.out.printf("jaguar1's color is:%s,%n",color.get(jaguar1));
        System.out.printf("jaguar1 hashcode before name change:%d,%n:",jaguar1.hashCode());
        System.out.printf("jaguar1 hashcode after radius change:%d,%n:",jaguar1.hashCode());



    }
}
