import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    //me ei defineeri tüüpi (int,  String, jms). ArrayList hoiab objekte (<> vahel)
    //ArrayList on klass, sp on (). (konstruktor)

    //nr-d pole. ei pea pikkust määrama


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //Kuidas lisada?
    public void addGroceryItem(String item) {
        //peame kutsuma meetodi, mis on ArrayList klassis
        groceryList.add(item); //java teeb ise raske töö ära, kuhu midagi salvestade jne.
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in grocery list");
        for (int i = 0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i)); //get leiab elemendi
            //i+1 sellepärast, et inimesed alustavad lugemist 1-st (mitte 0-st)
        }
    }
    //Kuidas muuta elemente?
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem); //sarnane arrayle
        System.out.println("Grocery item " + (position + 1) + "has  been modified");
    }
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position,newItem);
        }

    }

    //Kuidas muuta
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    //Kuidas leida?
//    public String findItem(String searchItem) {
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile (String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
        //saab teha if-ga (natuke rohkem kirjutamist)
    }

}
