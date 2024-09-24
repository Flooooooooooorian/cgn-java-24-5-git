public class Main {


    public static void main(String[] args) {

        int age1 = 51;
        String name1 = "Florian";

        int age2 = 12;
        String name2 = "Martin";

        int age3 = 36;
        String name3 = "Dominic";

        boolean result = checkAge(age1);
        System.out.println(result);

        System.out.println(checkAge(age2));
        checkAge(96);
        checkAge(0);
        checkAge(-46);

        System.out.println("Ende");
    }

    public static boolean checkAge(int age) {

        if (age > 18) {
            System.out.println("Ja, die Person ist über 18 Jahre alt!");
            return true;
        } else if (age == 18) {
            System.out.println("Die Person ist genau 18 Jahre alt!");
            return true;
        } else {
            System.out.println("Nein, die Person ist unter 18 Jahre alt!");
            return false;
        }
    }

}
