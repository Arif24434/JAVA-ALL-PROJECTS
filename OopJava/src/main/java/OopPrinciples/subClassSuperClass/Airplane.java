package OopPrinciples.subClassSuperClass;

class Airplane extends Transport {


    @Override
    protected void TransportName(String TransportName)
    { System.out.println("AirPlane is a :"+" "+TransportName);   }

    @Override
    protected void PassengerNo(int PassengerNo)
    {        System.out.println("Airplane contains approximately passenger:"+" "+PassengerNo);    }

    @Override
    protected void TypeOfClass(String TypeOfClass)
    {        System.out.println("Airplane is a :" +" "+TypeOfClass );  }
}
