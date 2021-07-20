package CarWithEngine;

public class CarWithEngineMain {
    public static void main(String[] args) {
        Engine suzuki = new Engine("suzuki", 450, "1000 cc", "ON");

        System.out.println(suzuki.getName());
        System.out.println(suzuki.getHorsePower());
        System.out.println(suzuki.getCapacity());
        System.out.println(suzuki.getStatusOfStrat());


        Car toyota = new Car("Toyota", "280 litter", "190 Litter");
        System.out.println(toyota.getCarName());
        System.out.println(toyota.getFuelTankCapacity());
        System.out.println(toyota.getRemainingFuelAmount());

        suzuki.engineCondition("700","200");

    }

}
