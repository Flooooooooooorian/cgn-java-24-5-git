package oop;

public class Main {

    public static void main(String[] args) {
        //                  Konstruktor
        Cup robersCup = new Cup(true);

        robersCup.material = "Keramik";

        System.out.println(robersCup.color);
        System.out.println(robersCup.material);
        System.out.println(robersCup.handle);
        System.out.println(robersCup.print);

        Cup oleCup = new Cup(false, "Keramik");

        oleCup.size = 250;
        System.out.println(oleCup.size);
        System.out.println(oleCup.material);
        System.out.println(oleCup.print);

        Cup dariosCup = new Cup(true, "weiß", null, 250, "Keramik");


    }
}
