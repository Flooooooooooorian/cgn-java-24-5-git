package lombokLib;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("VW", "Golf", "Gold", 120, 5);

        Car c6 = Car.builder().build();


        Car2 c3 = new Car2("VW", "Golf", "Gold", 120, 5, 3);

        Car2 c4 = c3.withColor("Blau");

        System.out.println(c3);
        System.out.println(c4);

        Car2 c5 = Car2.builder()
                .power(120)
//                .color("Rot")
                .model("Polo")
                .brand("VW")
                .countSeats(3)
                .build();

        System.out.println(c5);
    }
}
