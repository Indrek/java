package collections;

public class Main {

    //oleme vaadanud List interface, arraylist, linkedlist. lisaks on veel sets, maps, queues
    //sellest kõigest samm üleval on collections

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Estonia", 8, 12);
        theatre.getSeats();
//
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }


}
