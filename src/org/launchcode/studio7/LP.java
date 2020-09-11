package org.launchcode.studio7;

import java.util.List;

/**
 * @author Oksana
 */
public class LP extends BaseDisc implements OpticalDisc {
   public LP(String name, int capacity, Type type, int speedMin, int speedMax, List<String> contents) {
      super(name, capacity, Type.LP, speedMin, speedMax, contents);
   }
   @Override
   public void storeData(String str) {
      List<String> contents = getContent();
      contents.add(str+"\n");
      contents.forEach(System.out::print);

   }
}
