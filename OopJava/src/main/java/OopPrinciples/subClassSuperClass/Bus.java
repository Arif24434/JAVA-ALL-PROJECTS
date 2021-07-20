package OopPrinciples.subClassSuperClass;

 class Bus extends Transport{
    @Override
    protected void TransportName(String TransportName)
    { System.out.println("AirPlane is a :"+" "+TransportName);   }

    @Override
    protected void PassengerNo(int PassengerNo)
    {        System.out.println("Airplane contains approximately passenger:"+" "+PassengerNo);    }

    @Override
    protected void TypeOfClass(String TypeOfClass)
    {        System.out.println("Bus is a :" +" "+TypeOfClass );  }
}
