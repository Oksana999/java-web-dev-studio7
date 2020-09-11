package org.launchcode.studio7;

import java.util.List;

/**
 * @author Oksana
 */
public class Wheel extends BaseDisc implements OpticalDisc {
   public Wheel(String name,  Type type, int speedMin, int speedMax) {
      super(name, Type.WHEEL, speedMin, speedMax);
   }

   @Override
   public void spinDisc() {
      System.out.println("A CD spins at a rate of "+ super.getSpeedMin()+" - "+super.getSpeedMax()+" rpm.");
   }

   @Override
   public void storeData(String str) {
      System.out.println("Can't store data");
   }

   @Override
   public void readData() {
      System.out.println("Can't read data");
   }

   @Override
   public void reportInformation() {
      System.out.println(this.toString());
   }

   @Override
   public String toString() {
      return nexId() + " Name: " + super.getName() +
              ", type: " + Type.WHEEL;
   }
}
