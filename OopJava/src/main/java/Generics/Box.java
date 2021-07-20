package Generics;

public class Box<I > {
 String item;                        // I is = Object

 void  put (String item){
     this.item =item;
   }

 String getItem(){
     return item;
   }

}
