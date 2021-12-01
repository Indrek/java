package challenge;

public interface NodeList {

    ListItem getRoot(); //root on listi pea, listi algus, esimene element
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
