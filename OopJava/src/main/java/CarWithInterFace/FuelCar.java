package CarWithInterFace;

public class FuelCar extends Car implements Tankable {
    public FuelCar(String Manufacturer, int model) {
        super(Manufacturer, model);
    }

    @Override
    public void tankable() {
        System.out.println("If the tankable: RE-FUEL IT");
    }

    @Override
    public String getManufacturer() { return getManufacturer();}

    @Override
    public void setManufacturer(String manufacturer) {
        setManufacturer(manufacturer);
    }

    @Override
    public int getModel() {
        return Model;
    }

    @Override
    public int setModel(int model) {
        return setModel(model);
    }


}

