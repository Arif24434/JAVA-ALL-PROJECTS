package ClassesObjects;

public class CloningDemo {

    public static void main(String[] args) {

        MobilePhone Samsung = new MobilePhone("SamsungGalaxy",
                "HLX", 1000,
                95, 500, 200, "GoogleMap",700,50);


        System.out.println(Samsung.getBrand());
        System.out.println(Samsung.getModel());
        System.out.println(Samsung.getBatteryCapacity());
        System.out.println(Samsung.getBatteryAmount());
        System.out.println(Samsung.getMemory());
        System.out.println(Samsung.getFreeMemory());
        System.out.println(Samsung.getAppInstallation());
        System.out.println(Samsung.getUsedCapacity());
        Samsung.installApplication("uber",150);
        Samsung.installApplication("Pokymon",75);
        Samsung.batteryUsed(1000,200);
    }








}
