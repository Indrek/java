package encapsulationchallenge;



public class Main {

    //Tee klass ja näita korrektset kapseldamist
    //Klass on Printer (simuleerib päris printerit)
    //Tal peaks olema väljad:
    //  1) värvide tasemete kohta
    //  2) mitu lehte prinditud
    //  3) kas on duplex printer (ehk kas ta prindib mõlemale lehepoolele)
    //Lisa meetodid värvi lisamiseks (kuni 100%)
    //Lisa meetod, et simuleerida lehe printimist (suurendab prinditud lehtede välja)
    //Otsusta, kas kasutada konstruktoreid v muid vajalikke asju, mida võib vaja minna

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count " + printer.getPagesPrinted());

        int pagesPrinted = printer.print(5);
        System.out.println("Pages prinnted was " + pagesPrinted +
                ", new total print count " + printer.getPagesPrinted());

        pagesPrinted = printer.print(3);
        System.out.println("Pages prinnted was " + pagesPrinted +
                ", new total print count " + printer.getPagesPrinted());

        printer.addToner(-2);
        //Kui sa oled keegi, kes seda printeri klassi kasutab, siis sa ei tea, mis seal klassisiseselt toimub
    }

}
