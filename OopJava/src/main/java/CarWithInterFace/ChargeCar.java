package CarWithInterFace;

public class ChargeCar extends Car implements Chargable {
    public ChargeCar(String manufacturer, int model) {
        super(manufacturer, model);
    }

    @Override
    public void Chargable() {
        System.out.println("If the chargable: CHARGE IT");
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
