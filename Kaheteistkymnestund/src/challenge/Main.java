package challenge;

public class Main {

    //teeme abstraktse klassi, et defineerida esemeid/objekte, mida saab listis hoida
    //hoiustab objekti ennast + viidet eelmisele ja järgmisele objektile

    //setPrevious()
    //setNext()
    //next()
    //previous()

    //teeme konkreetse klassi.
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "Tallinn Tartu Pärnu Valga Narva Kuressaare Tartu";
        String[] data = stringData.split(" ");
        for (String s : data) {
            //kood siia
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        System.out.println("***********************************");
        list.removeItem(new Node("Tartu"));
        list.traverse(list.getRoot());
    }


}
