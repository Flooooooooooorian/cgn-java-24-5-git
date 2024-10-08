package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[5];

        List<String> namesList = new ArrayList<String>();

        namesList.add("Florian");
        namesList.add("Martin");
        namesList.add(String.valueOf(2));

        System.out.println(namesList);
        System.out.println(namesList.getFirst());

        namesList.removeFirst();

        System.out.println(namesList);


        List<User> users = new ArrayList<>();

        User user1 = new User("Florian", 28);
        User user2 = new User("Martin", 0);

        users.add(user1);
        users.add(user2);

        System.out.println(users);

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        for (String currentName : namesList) {
            System.out.println(currentName);
        }
    }

    public void printLastElement(List<String> list) {
        System.out.println(list.getLast());
    }
}
