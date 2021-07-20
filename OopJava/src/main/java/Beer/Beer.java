package Beer;

public  class Beer {

    public String beerName;
    public String beerTpye;
    public int amountOfAlcohol;

    public Beer(String beerName, String beerTpye, int amountOfAlcohol) {
        this.beerName = beerName;
        this.beerTpye = beerTpye;
        this.amountOfAlcohol = amountOfAlcohol;


    }

    @Override
    public String toString() {
        return "Beer{" +
                "beerName='" + beerName + '\'' +
                ", beerTpye='" + beerTpye + '\'' +
                ", amountOfAlcohol=" + amountOfAlcohol +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Beer)){
            return false;
      }
      Beer another= (Beer) obj;
      if(!(beerName.equals(another.beerName))){
          return false;
        }
      if (!(beerTpye.equals(another.beerTpye))){
          return false;
      }
         return  amountOfAlcohol== another.amountOfAlcohol;
    }

    @Override
    public int hashCode() {
        return 22 * amountOfAlcohol+ beerTpye.length()+beerName.charAt(2);
    }

    public String getBeerName() {
        return beerName;
    }

    public String getBeerTpye() {
        return beerTpye;
    }

    public int getAmountOfAlcohol() {
        return amountOfAlcohol;
    }
}




