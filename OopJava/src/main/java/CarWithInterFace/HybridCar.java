package CarWithInterFace;

public class HybridCar extends Car implements Tankable,Chargable {
    public HybridCar(String manufacturer, int model) {
        super(manufacturer, model);
    }

    @Override
    public void Chargable() {
        System.out.println("If the chargable: TANK IT and CHARGE IT");
    }

    @Override
    public void tankable() {
        System.out.println("If the tankable: RE-FUEL IT");
    }

    @Override
    public String getManufacturer() {
        return getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        setManufacturer(manufacturer);
    }

    @Override
    public int getModel() {
        return getModel();
    }

    @Override
    public int setModel(int model) {
        return setModel(model);
    }
}
