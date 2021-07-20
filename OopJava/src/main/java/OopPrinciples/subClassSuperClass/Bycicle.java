package OopPrinciples.subClassSuperClass;

 class Bycicle extends Bike {
     @Override
     public void MakeSound(){
         System.out.println("Bycicle is Making Sound --> TING, TING");
     }
     @Override
     protected void TransportName(String TransportName)
     { System.out.println("MotorBike is a :"+" "+TransportName);   }

     @Override
     protected void PassengerNo(int PassengerNo)
     {        System.out.println("MotorBike contains approximately passenger:"+" "+PassengerNo);    }

     @Override
     protected void NumberOfWheels(String NumberOfWheels)
     { System.out.println("MotorBike contains approximately Wheels:"+" "+NumberOfWheels); }

     @Override
     protected void ExistanceOfEngine(String ExsistanceOfEngine)
     { System.out.println("MotorBike contains :"+" "+ExsistanceOfEngine+" "+"Engine");    }

     @Override
     protected void TypeOfClass(String TypeOfClass)
     {        System.out.println("Bycicle is a :" +" "+TypeOfClass );  }

 }
