package OopPrinciples.subClassSuperClass;

 class Train extends Transport {

    @Override
    protected void TransportName(String TransportName)
    { System.out.println("Train is a :"+" "+TransportName);   }

    @Override
    protected void PassengerNo(int PassengerNo)
    {        System.out.println("Train contains approximately passenger:"+" "+PassengerNo);    }

    @Override
    protected void TypeOfClass(String TypeOfClass)
    {        System.out.println("Train is a :" +" "+TypeOfClass );  }
}
