package CarWithEngine;

public class Engine {

    protected String name;
    protected int horsePower;
    protected String capacity;
    protected String statusOfStrat;

    public Engine(String name, int horsePower, String capacity, String statusOfStrat) {
        this.name = name;
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.statusOfStrat = statusOfStrat;
    }

    public String getName() { return name; }

    public int getHorsePower() { return horsePower; }

    public String getCapacity() { return capacity; }

    public String getStatusOfStrat() { return statusOfStrat; }

    public void engineCondition (String capacity, String finalCapacity ){
        if (capacity == "500cc") {
            System.out.println( "Engine is Off");
        }
        else System.out.println("Engine is On");

    }
}



