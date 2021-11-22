package banking;

public class Main {

    //Lihtne pangahaldus app
    //Bank klass
    //ArrayList harude kohta
    //nimi
    //Suudab lisada uue haru
    //Suudab lisada uue kliendi harusse
    //Näeb kliente (valikuliselt klientide tehinguid) (vastava haru kohta)
    //Saab lisada klientidele tehinguid

    //Branch klass
    //ArrayList Customer kohta
    //nimi
    //Peab suutma lisada kliente koos esimese tehinguga

    //Customer klass
    //ArrayList Double transactions
    //nimi

    //Andmete valideerimine
    //Kontrolli, kas klient, haru, vms on olemas v mitte
    public static void main(String[] args) {

        Bank bank = new Bank("SEB");

        bank.addBranch("Kristiine");

        bank.addCustomer("Kristiine", "Juku", 50);
        bank.addCustomer("Kristiine", "Juhan", 100);
        bank.addCustomer("Kristiine", "Malle", 200);

        bank.addBranch("Tartu");
        bank.addCustomer("Tartu","Maie",300);

        bank.addCustomerTransaction("Kristiine", "Juku", 20);
        bank.addCustomerTransaction("Kristiine", "Juku", 70);
        bank.addCustomerTransaction("Kristiine", "Juhan", 10);

        bank.listCustomers("Kristiine", true);
        bank.listCustomers("Tartu", true);

        if (!bank.addCustomer("Rapla", "Toomas", 10)) {
            System.out.println("Error: Rapla haru pole olemas");
        }

        if (!bank.addBranch("Kristiine")) {
            System.out.println("Kristiine haru juba olemas");
        }
    }
}
