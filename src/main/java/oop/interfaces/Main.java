package oop.interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Vom Interface können keine Objekte erzeugt werden
//        Animal animal1 = new Animal();

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        System.out.println(Animal.name);


        cat1.catOnly();

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        //Klassen spezifische Methoden können nicht aufgerufen werden
        //animal1.catOnly();

        System.out.println(animal1);
        animal1.makeSound();

        myAnimal(cat1);
        myAnimal(dog1);
        myAnimal(animal2);


        Animal[] myAnimals = new Animal[5];

        myAnimals[0] = animal1;
        myAnimals[1] = cat1;
        myAnimals[2] = dog1;

        System.out.println(Arrays.toString(myAnimals));

        System.out.println(myAnimals[2]);
    }

    public static void myAnimal(Animal a) {
        System.out.println(a);
    }
}
