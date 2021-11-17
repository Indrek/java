import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
//        int[] myArray = new int[10];
        //Loend (List)
        //Korrastatud andmekogum, mis tähendab, et säilitab elementide järjekorra.
        //Kui lisada elemente loendisse, siis hiljem on nad lugemisel täpselt samas järjekorras
        //kui sisestamisel.
        //Enimkasutatavad loendid on ArrayList ja List.

        //ArrayList
        //Dünaamiline massiiv (array)
        //Töötab enamjaolt nagu massiiv, aga pikkus on dünaamiline
        //Loomisel ei pea pikkust (suurust) määrama
        //Loend suureneb ise vastavalt vajadusele.

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                case 7:
                    processArrayList();
                    break;
            }
        }
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t0 - To print choice options");
        System.out.println("\t1 - To print the list of grocery items");
        System.out.println("\t2 - To add an item to the list");
        System.out.println("\t3 - To modify an item in the list");
        System.out.println("\t4 - To remove for an item in the list");
        System.out.println("\t5 - To search for an item in the list");
        System.out.println("\t6 - To quit the application");
    }
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list.");
        } else {
            System.out.println(searchItem + " is not in the grocery list.");
        }
    }
    public static void processArrayList() {
        //Kuidas copyda?
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //array copy

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        //tavaliseks arrayks
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }


}
