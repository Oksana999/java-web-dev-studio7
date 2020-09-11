package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oksana
 */
public abstract class BaseDisc implements OpticalDisc{
   private static int counter = 1;
   private String name;
   private int capacity;
   private Type type;
   private int speedMin;
   private int speedMax;
   private List<String> contents = new ArrayList<>();

   public BaseDisc(String name, int capacity, Type type, int speedMin, int speedMax, List<String> contents) {
      this.name = name;
      this.capacity = capacity;
      this.type = type;
      this.contents = contents;
      this.speedMin = speedMin;
      this.speedMax = speedMax;
   }

   public static int getCounter() {
      return counter;
   }

   public String getName() {
      return name;
   }

   public int getCapacity() {
      return capacity;
   }

   public Type getType() {
      return type;
   }

   public int nexId(){
      return counter++;
   }

   public List<String> getContent() {
      return contents;
   }

   public int getSpeedMin(){
      return this.speedMin;
   }
   public int getSpeedMax(){
      return this.speedMax;
   }


   @Override
   public void spinDisc() {
      System.out.println("A CD spins at a rate of "+ this.speedMin+" - "+this.speedMax+" rpm.");

   }

   @Override
   public void storeData(String str) {
      List<String> contents = getContent();
      contents.add(str+"\n");
      contents.forEach(System.out::print);

   }

   @Override
   public void readData() {
      getContent().forEach(System.out::print);
     // System.out.println();
   }

   @Override
   public void reportInformation() {

      System.out.println(this.toString());
   }


   @Override
   public String toString() {
      return nexId() + " Name: " + name +
              ", capacity: " + capacity +
              ", type: " + type;
   }
}
