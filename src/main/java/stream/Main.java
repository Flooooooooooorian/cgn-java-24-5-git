package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Florian", "Martin", "Max", "Ursula", "Emma"));

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            if (name.equals("Florian")) {
                for (char c : name.toCharArray()) {
                    System.out.println(c);
                }

            }
        }

        for (String name : names) {
            if (name.length() > 4) {
                System.out.println(name);
            }
        }

        List<String> greetings = names.stream()
                .filter(name -> name.length() > 4)
                .map(firstName -> "Hallo " + firstName)
                .collect(Collectors.toList());

//                .forEach(currywurst -> System.out.println(currywurst));


        System.out.println(names);
        System.out.println(greetings);

        Stream.of("Anton", "Berta", "Cäsar")
                .peek(System.out::println)
                .collect(Collectors.toList());


        int sum1 = List.of(1,2,3).stream().reduce(0, (a, b) -> a + b);
        int sum2 = List.of(1,2,3).stream().reduce(0, (a,b) -> Integer.sum(a, b));

        System.out.println(sum1);
        System.out.println(sum2);
    }


}
