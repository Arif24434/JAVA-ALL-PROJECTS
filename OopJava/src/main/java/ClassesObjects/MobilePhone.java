package ClassesObjects;

public class MobilePhone {

    protected String brand;
    protected String model;
    protected int batteryCapacity;
    protected int batteryAmount;
    protected int memory;
    protected int freeMemory;
    protected String appInstallation;
    protected int usedCapacity;
    protected  int batteryUsed;

    public MobilePhone(String brand, String model, int batteryCapacity, int batteryAmount, int memory, int freeMemory,
                       String appInstallation,int usedCapacity,int batteryUsed) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryAmount;
        this.memory = memory;
        this.freeMemory = freeMemory;
        this.appInstallation = appInstallation;
        this.usedCapacity=usedCapacity;
        this.batteryUsed=batteryUsed;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public int getBatteryAmount() {
        return batteryAmount;
    }
    public int getMemory() {
        return memory;
    }
    public int getFreeMemory() {
        return freeMemory;
    }

    public String getAppInstallation() {
        return appInstallation;
    }
    public int getUsedCapacity(){

        return usedCapacity;
    }

    public void installApplication(String applicationName, int applicationMemory) {
        if (freeMemory < applicationMemory) {

            System.out.println("Application" + applicationName + "can't be installed on" + brand + " " + model + " There are no enough memory");
        } else {

            freeMemory = freeMemory - applicationMemory;
            System.out.println("Application " + applicationName + " has been installed on " + brand + "  " + model + " remain memory " + freeMemory);

        }

    }
    public void batteryUsed (int batteryCapacity, int batteryFinished) {
        if (usedCapacity < batteryCapacity) {
            System.out.println( brand + " " + model + " need to charge");
        } else { batteryCapacity = batteryCapacity -batteryFinished;
            System.out.println( brand + "  " + model + " no need to charge ");
        }
    }
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
