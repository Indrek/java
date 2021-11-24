package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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
        addInOrder(placesToVisit, "Rapla");
        printList(placesToVisit);

//        placesToVisit.remove(4); //[3]
//        printList(placesToVisit);
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator(); //
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("***************************");
    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); //ei viita veel esimesele sisenile
        //peab .next() panema, et hakkaks esimesele viitama
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
            } else if (comparsion < 0) {
                //iteraator liigub edasi, ei puutu midagi. (midagi ei muutu)
                continue;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in list");
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
        }
        printMenu();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("Available options: \npress:");
        System.out.println( "0 - to quit\n" +
                            "1 - go to the next city\n" +
                            "2 - go to the previous city\n" +
                            "3 - print menu options");
    }

}
