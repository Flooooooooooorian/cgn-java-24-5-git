public class ArraysLoops {

    public static void main(String[] args) {


        String name1 = "Florian";
        String name2 = "Robert";
        String name3 = "Tobias";
        String name4 = "Aygul";
        String name5 = "Dario";
        String name6 = "Malek";


        String[] names = new String[8];


        names[0] = "Florian";
        names[1] = "Robert";
        names[2] = "null";
        names[3] = null;
        names[4] = "Tobias";

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hallo: " + names[i]);
        }

        for (String currentName : names) {
            System.out.println("Bye: " + currentName);
        }
    }
}
