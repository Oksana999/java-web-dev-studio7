package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.List;

public class CD extends BaseDisc implements OpticalDisc{

   private static int speed;

   public CD(String name, int capacity,  Type type, int speedMin, int speedMax, List<String> contents) {
      super(name, capacity, Type.CD, speedMin, speedMax, contents);
      this.speed = speed;

   }

//   @Override
//   public void spinDisc() {
//      System.out.println("Disc spinning with speed = "+ speed);
//
//   }
//
//   @Override
//   public void storeData(String str) {
//      List<String> contents = super.getContent();
//      contents.add(str+"\n");
//     contents.forEach(System.out::print);
//
//   }

//   @Override
//   public void readData() {
//      super.getContent().forEach(System.out::print);
//
//   }

//   @Override
//   public void reportInformation() {
//
//      System.out.println(this.toString());
//   }

   public  int getSpeed() {
      return this.speed;
   }




   // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
