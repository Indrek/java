import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList items = new ArrayList();

        //int
        items.add(1); //automaatselt teeb Integer objektiks
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
        //public class Dog extends Animal
        //public class Animal (extends Object)
    }
    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
