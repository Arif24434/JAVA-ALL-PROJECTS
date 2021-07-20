package ImmutableObjects;

import java.util.Objects;

public final class ImmutableCar {

   private String manufacturer;
   private String model;
   private Engine engine;

   public ImmutableCar(String manufacturer, String model, Engine engine) {
      this.manufacturer = manufacturer;
      this.model = model;
      this.engine = engine;
   }

   public String getManufacturer() {
      return manufacturer;
   }

  /* public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }*/

   public String getModel() {
      return model;
   }

   /*public void setModel(String model) {
      this.model = model;
   }*/

   public Engine getEngine() {
      return engine;
   }

   /*public void setEngine(Engine engine) {
      this.engine = engine;
   }*/


   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ImmutableCar that = (ImmutableCar) o;
      return Objects.equals(manufacturer, that.manufacturer) && Objects.equals(model, that.model) && Objects.equals(engine, that.engine);
   }

   @Override
   public int hashCode() {
      return Objects.hash(manufacturer, model, engine);
   }

   @Override
   public String toString() {
      return "ImmutableCar{" +
              "manufacturer='" + manufacturer + '\'' +
              ", model='" + model + '\'' +
              ", engine=" + engine +
              '}';
   }
}
