package LaptopCloning;

public class LaptopCloning implements Cloneable {

public String brand;
public String model;
public int amountOfMemory;

    public LaptopCloning(String brand, String model, int amountOfMemory) {
        this.brand = brand;
        this.model = model;
        this.amountOfMemory = amountOfMemory;

    }
public static LaptopCloning from (LaptopCloning another){
   return new LaptopCloning(another.getBrand(), another.model, another.getAmountOfMemory());
}


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }
}
