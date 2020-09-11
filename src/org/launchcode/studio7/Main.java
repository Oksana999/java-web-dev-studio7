package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> content1 = new ArrayList<>();
        ArrayList<String> content2 = new ArrayList<>();
        ArrayList<String> content3 = new ArrayList<>();
        content1.add("Music of silence, ");
        content1.add("Moonlight Sonata, ");
        content2.add("Soul song, ");
        content2.add("Felicita, ");
        content3.add("Gray night, ");
        content3.add("Fantastic, ");
        BaseDisc myCd = new CD("cd", 100, Type.CD, 200, 500, content1);
        BaseDisc myDvd = new DVD("dvd", 200, Type.DVD, 570, 1600, content2);
        BaseDisc myLp = new LP("lp", 50, Type.LP, 100, 120, content3);
        BaseDisc myWheel = new Wheel("wheel", Type.WHEEL, 150, 300);
        List<BaseDisc> discs = new ArrayList<>();
        discs.add(myCd);
        discs.add(myDvd);
        discs.add(myLp);
        discs.add(myWheel);



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
