package ImmutableObjects;

import java.util.Objects;

public final class Engine {
    private int horsePower;
    private int volume;
    private String engineType;
    private Wheel wheel;

    public Engine(int horsePower, int volume, String engineType, Wheel wheel) {
        this.horsePower = horsePower;
        this.volume = volume;
        this.engineType = engineType;
        this.wheel = wheel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Wheel getWheel() {
        return radiusCopy(wheel);
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    private Wheel radiusCopy(Wheel radiusCopy){
        return new Wheel(radiusCopy.getRadius(),radiusCopy.getWidth());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return horsePower == engine.horsePower && volume == engine.volume && Objects.equals(engineType, engine.engineType) && Objects.equals(wheel, engine.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, volume, engineType, wheel);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", volume=" + volume +
                ", engineType='" + engineType + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}

