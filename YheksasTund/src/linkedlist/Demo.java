package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder(placesToVisit, "Tartu");
        addInOrder(placesToVisit, "Pärnu");
        addInOrder(placesToVisit, "Haapsalu");
        addInOrder(placesToVisit, "Narva");
        addInOrder(placesToVisit, "Valga");
//        placesToVisit.add("Tartu");
//        placesToVisit.add("Pärnu");
//        placesToVisit.add("Haapsalu");
//        placesToVisit.add("Narva");
//        placesToVisit.add("Valga");

        printList(placesToVisit);

//        placesToVisit.add(1,"Rapla");
        addInOrder(placesToVisit, "Rapla");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("***************************");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparsion = stringListIterator.next().compareTo(newCity);
            if(comparsion == 0) {
                //võrdsed, ära lisa
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparsion > 0) {
                //uus linn peaks oleme enne praegust (eelmist) linna
                stringListIterator.previous();
                stringListIterator.add(newCity);
                //list iterator lubab tagasi minna
                return true;
            } else if (comparsion > 0) {
                //iteraator liigub edasi, ei puutu midagi. (midagi ei muutu)
                continue;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
