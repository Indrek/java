package interfaceyl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //teeme lihtsa interface, kuhu saab objekte salvestada (ISaveable)
    //interfacel 2 meetodit:
    //1, mis returnib arraylisti, kuhu andmeid salvestaada
    //2, mis täidab objekti väljad sealt arraylistist

    //overrideme toString() meetodi, et neid oleks lihtne printida
    //Mainis teeme meetodi, mis võtab objekti, mis kasutab seda interface'i
    //ja "salvestab" tema väärtused

    public static void main(String[] args) {
        Player juku = new Player("Juku", 10, 15);
        System.out.println(juku.toString());
        saveObject(juku);
//        loadObject(juku);
        juku.setHitPoints(8);
        System.out.println(juku);

        juku.setWeapon("Lightsaber");
        saveObject(juku);
//        loadObject(juku);
        System.out.println(juku);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf); //.toString(), mille overwritesime
        saveObject(werewolf);
//        double myDouble = 5.6;
//        System.out.println((int) myDouble);
        loadObject(werewolf);
        System.out.println(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n" +
                        "1 to enter a String\n" +
                        "2 to quit.");
        while(!quit) {
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 2:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) +
                    " to storage device");
        }
    }
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
