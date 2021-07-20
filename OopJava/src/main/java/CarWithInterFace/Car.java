package CarWithInterFace;

public abstract class Car {

    protected String Manufacturer;
    protected int Model;

    public Car(String manufacturer, int model) {
        Manufacturer = manufacturer;
        Model = model;
    }

    public String getManufacturer() {
        return Manufacturer;

    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public int getModel() {
        return Model;
    }

    public int setModel(int model) {
        Model = model;
        return model;
    }
}
