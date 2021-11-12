package encapsulationchallenge;

//Tee klass ja näita korrektset kapseldamist
//Klass on Printer (simuleerib päris printerit)
//Tal peaks olema väljad:
//  1) värvide tasemete kohta (toner)
//  2) mitu lehte prinditud
//  3) kas on duplex printer (ehk kas ta prindib mõlemale lehepoolele)
//Lisa meetodid värvi lisamiseks (kuni 100%)
//Lisa meetod, et simuleerida lehe printimist (suurendab prinditud lehtede välja)
//Otsusta, kas kasutada konstruktoreid v muid vajalikke asju, mida võib vaja minna

public class Printer {

    private int toner;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {
        if (toner >= 0 && toner <= 100) {
            this.toner = toner;
        } else {
            this.toner = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int amount) {
        if (amount > 0 && amount <= 100) {
            if (this.toner + amount > 100) {
                System.out.println("Remaining toner + added toner > 100");
                return -1;
            } else {
                this.toner += amount;
                return this.toner;
            }
        } else {
            System.out.println("Added toner <0 or >100");
            return -1;
        }
    }
    public int print(int pages) {
        //füüsiline paber, mis printerist läbi käib
        int pagesToPrint = pages;
        if (isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2); // 2 lehte-2/2 = 1, 2%2 =0 -> 1 // 3 lehte- 3/2 = 1, 3%2=1 -> 2
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
