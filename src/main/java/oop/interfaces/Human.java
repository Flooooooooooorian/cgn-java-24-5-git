package oop.interfaces;


public class Human extends Creature {


    @Override
    public void makeSound() {
        System.out.println("Hallo, ich bin: " + getName());
    }
}
