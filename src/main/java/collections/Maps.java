package collections;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();

        //  Key      Value
        Map<String, Integer> phonesNumberMap = new HashMap<>();

        phonesNumberMap.put("florian", 57812);
        phonesNumberMap.put("martin", 95645);

        System.out.println(phonesNumberMap);

        System.out.println(phonesNumberMap.get("florian"));

        for (Integer value : phonesNumberMap.values()) {
            System.out.println(value);
        }

        System.out.println("---------------");

        Set<String> names = new HashSet<>();

        names.add("Florian");
        names.add("Martin");
        names.add("Florian");

        System.out.println(names);

//        Kein Zugriff auf einezelne ELemente
//        names.get();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
