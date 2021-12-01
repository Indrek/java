package challenge;

public class MyLinkedList implements NodeList{

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //kontr vs pea, kas on empty. lisada õigesse kohta, kui pole empty
        if(this.root == null) {
            //list oli tühi
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) { //kui jõuame null-ni,
            // siis rohkem elemente listis pole
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //nexti pole olemas, lisa listi lõppu
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    //newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                //new item is less, move left if possible
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    //node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                    return true;
                }
            } else {
                //võrdne
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        //kood ei tohiks siia jõuda
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            //senikaua, kuni me pole leidnud objekti, mis on sama, ära tee midagi
            if (comparison == 0) {
                //oleme leidnud objekti, mida tahame kustutada
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // comparison > 0.
                // item not in list
                System.out.println("Item not found");
                return false;
            }
        }
        //reached end of flist without finding
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            //list tühi
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
