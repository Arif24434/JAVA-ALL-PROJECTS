package CarWithInterFace;

public class Main {
    public static void main(String[] args) {
     FuelCar Toyota = new FuelCar("Suzuki",4609);
        System.out.println(Toyota.getManufacturer());
             System.out.println(Toyota.getModel());
               Toyota.tankable();
     ChargeCar ToyotaNew = new ChargeCar("Suzuki",4620);
        System.out.println( ToyotaNew.getManufacturer());
        System.out.println( ToyotaNew.getManufacturer());
        ToyotaNew.Chargable();

       HybridCar ToyotaSuper = new HybridCar("Suzuki",5000);
        System.out.println(ToyotaSuper.getManufacturer());
        System.out.println(ToyotaSuper.getModel());
        ToyotaSuper.tankable();
        ToyotaSuper.Chargable();

    }


}
