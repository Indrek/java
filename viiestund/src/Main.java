public class Main {

    public static void main(String[] args) {
        //objektid
        //olek (state) - suurus, vanus, täis / tühi, kas on isemõtlev
        //käitumine (behaviour) - sööb, magab, kõnnib

        //klass
        //mall v joonis v plaan, kuidas objekt käitub

        Car porche = new Car();
//        porche.model = "Panamera"; // kui väljad Car klassis private, kuidas saame muuta ja printtida?
//        System.out.println(porche.model);

        porche.setModel("911");
        System.out.println(porche.getModel());

        Car opel = new Car();
        opel.setModel("Astra");
        System.out.println(opel.getModel());
    }

}
