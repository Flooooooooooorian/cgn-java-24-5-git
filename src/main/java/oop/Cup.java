package oop;

import java.math.BigDecimal;

public class Cup {

    public static final int FULL_AGE = 18;

    final String color;

    boolean handle;
    String print = "Text";
    int size;
    String material;

    //Default Constructor
    public Cup() {
        color = "rot";
    }

    public Cup(boolean handle) {
        System.out.println(handle);
        this.handle = handle;
        this.print = "Hello";
        color = "rot";
    }

    public Cup(boolean handle, String material) {
        System.out.println(handle);
        this.handle = handle;
        this.material = material;
        color = "rot";
    }

    public Cup(boolean handle, String color, String print, int size, String material) {
        this.handle = handle;
        this.color = color;
        this.print = print;
        this.size = size;
        this.material = material;
    }


    public static void myStaticMethod() {
        System.out.println("static");
//        System.out.println("Color: " + color);
    }

    public void myNonStaticMethod() {
        System.out.println("non static");
        System.out.println("Color: " + color);
    }
}
