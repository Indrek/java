package challenge;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) { //neg, kui enne; pos, kui pärast; 0 kui võrdne
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
            //noded -> konverteeritakse (ajutiselt) Stringiks
        } else {
            return -1; //iga väärtus on suurem kui null
        }
    }
}
