package OopPrinciples.subClassSuperClass;

public class Main {

    public static void main(String[] args) {

        Airplane Raynir =new Airplane();
        Raynir.TransportName("Public Transport");
        Raynir.PassengerNo(250);
        Raynir.TypeOfClass("Child");

        System.out.println("============================");

        Train Intercity =new Train();
        Intercity.TransportName("Public Transport");
        Intercity.PassengerNo(1000);
        Intercity.TypeOfClass("Child");

        System.out.println("============================");

        Bus Flixbus =new Bus();
        Flixbus.TransportName("Public Transport");
        Flixbus.PassengerNo(80);
        Flixbus.TypeOfClass("Child");

        System.out.println("============================");

        MotorBike Honda = new MotorBike();
        Honda.TransportName("Public Transport");
        Honda.PassengerNo(2);
        Honda.NumberOfWheels("TWO");
        Honda.ExistanceOfEngine("One");
        Honda.TypeOfClass("Child");

        System.out.println("============================");
        Bycicle Rower = new Bycicle();
        Rower.TransportName("Public Transport");
        Rower.PassengerNo(2);
        Rower.NumberOfWheels("TWO");
        Rower.ExistanceOfEngine("No");
        Rower.TypeOfClass("Child");
        Rower.MakeSound();

    }
}
