package oop.interfaces;

import java.util.Calendar;

public class Cat extends Object implements Animal, Moveable{
    @Override
    public void makeSound() {
        System.out.println("miau");
    }

    public void catOnly() {
        System.out.println("im a cat");
    }

    @Override
    public String toString() {
        return "Cat{}";
    }

    @Override
    public void drive() {

    }
}
