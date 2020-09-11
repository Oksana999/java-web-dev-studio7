package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> content1 = new ArrayList<>();
        content1.add("Music of silence, ");
        content1.add("Moonlight Sonata ");
        BaseDisc myCd = new CD("cd", 100, Type.CD, 200, 500, content1);
        BaseDisc myDvd = new DVD("dvd", 200, Type.DVD, 570, 1600, content1);
        List<BaseDisc> discs = new ArrayList<>();
        discs.add(myCd);
        discs.add(myDvd);


        // TODO: Call each CD and DVD method to verify that they work as expected.

        for (BaseDisc disc:discs) {
            System.out.println("Report Information of disc:");
            disc.reportInformation();
            disc.spinDisc();
            System.out.println("Disc contents: ");
            disc.readData();
            System.out.println();
            System.out.println("Add new content \'New data\': ");
            disc.storeData("New data");
            System.out.println("Disc read data:");
            disc.readData();
            System.out.println("----------------------------------------------");
        }
//        ((CD) cd).spinDisc();
//        ((CD) cd).storeData("New data");
//        ((CD) cd).readData();
//        ((CD) cd).reportInformation();
//        System.out.println("-------------------------------------");
//        System.out.println("DVD: ");
//        ((CD) dvd).spinDisc();
//        ((CD) dvd).storeData("New data");
//        ((CD) cd).readData();
//        ((CD) cd).reportInformation();
    }
}
