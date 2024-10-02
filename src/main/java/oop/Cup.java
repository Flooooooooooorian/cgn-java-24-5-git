package oop;

public class Cup {

    boolean handle;
    String color;
    String print = "Text";
    int size;
    String material;

    //Default Constructor
    public Cup() {

    }

    public Cup(boolean handle) {
        System.out.println(handle);
        this.handle = handle;
        this.print = "Hello";
    }

    public Cup(boolean handle, String material) {
        System.out.println(handle);
        this.handle = handle;
        this.material = material;
    }

    public Cup(boolean handle, String color, String print, int size, String material) {
        this.handle = handle;
        this.color = color;
        this.print = print;
        this.size = size;
        this.material = material;
    }
}
