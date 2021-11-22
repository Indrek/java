package linkedlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //LinkedList - parem kasutada, kui on vaja kiirelt lisada v eemaldada listi elemente

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i< intList.size();i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1,2);
        System.out.println("*****************************");
        for(int i = 0; i< intList.size();i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
