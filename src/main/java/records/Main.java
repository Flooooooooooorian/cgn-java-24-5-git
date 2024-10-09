package records;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Car2 car2 = new Car2();

        car2.setColor("color");
//        car2.color = "color";

        Car car = new Car("VW", "Polo", "blau", 5, new BigDecimal("20"), "Brumm");

        System.out.println(car);
//        car.makeSound();

        System.out.println(car.brand());


        Car updatedCar = new Car(car.brand(), car.model(), "rot", car.countDoors(), car.price(), car.sound());

        System.out.println(car);
        System.out.println(updatedCar);

    }
}
