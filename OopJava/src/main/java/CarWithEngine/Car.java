package CarWithEngine;

public class Car{

  public   String carName;
  public   String fuelTankCapacity;
  public   String remainingFuelAmount;


    public Car(String carName, String fuelTankCapacity, String remainingFuelAmount) {
        this.carName = carName;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainingFuelAmount = remainingFuelAmount;

    }

    public String getCarName() { return carName; }

    public String getFuelTankCapacity() { return fuelTankCapacity; }

    public String getRemainingFuelAmount() { return remainingFuelAmount; }


}
