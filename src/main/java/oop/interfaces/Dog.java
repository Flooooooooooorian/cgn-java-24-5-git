package oop.interfaces;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println("wau");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }
}
