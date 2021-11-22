public class Main {

    public static void main(String[] args) {
        //Programmi idee on aidata fiktiivset firmat Juku Burgerid
        //Programm aitab Jukul valida burgerite tüüpe ja lisasid, mis burgeriga kaasas käivad ja hindasid
        //Teeme baas-tüüpi burgeri ja kaks teist tüüpi burgerit, mis on Juku poes populaarsed

        //Baas-burgeril peaks olema järgmised esemed:
        //Leiva tüüp (bread roll type), liha (meat) ja veel kuni 4 lisa (salat, tomat, porgand jne),
        //mida klient saab valida ja burgerile lisada.

        //Iga lisa eest võetakse lisatasu, seega
        //leia viis, et trackida, kui mitu lisa lisati ja arvuta burgeri hind (baas-burger + lisad)
        //Selle burgeri hind on baas-burgeri hind + lisad, kõik eraldi (kuni 4 lisa)

        //Tee Hamburer klass, mis sellega tegeleks
        //Selle konstruktor peaks võtma ainult leiva/saia tüübi (bread roll type), liha (meat) ja hinna (price)
        //Võib lisada ka nime (konstruktorisse) või kasutada setterit

        //Lisa veel 2 burgeritüüpi hamburgereid (Hamburger alamklass):

        //A) Healthy burger (rukkileivaga) + 2 võimalikku lisa
        //Healthy burgeril saab olla 6 lisa
        //Vihje: 2 ekstra lisaga on ilmselt mõistlik alamklassis tegeleda, mitte baas-klassis (Hamburger), kuna
        //need 2 ekstra lisa käivad ainult seda tüüpi burgeri kohta

        //B) Deluxe burger - tuleb friikate ja joogiga, aga rohkem lisasid pole lubatud
        //Vihje: Leia viis, kuidas automaatselt need lisad burgerile lisada deluxe burgeri objekti loomise hetkel
        //ning takista rohkemate lisade lisamist.

        //Kõik 3 klassi peaksid omama meetodit, mis näitab burgeri baas-hinda + lisasid,
        //igal ühel lisa nimi ja lisamishind, ja lõpphind (total) kogu burgeri eest (burger + lisad).
        //Lisaburgerite puhul võib hindasid vaadata baas-klassist ja lisada sealt total lõpp-hinnale.

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.14, "White");
        double price = hamburger.itemizeHamburger();
        System.out.println(price);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());
        System.out.println("****************************************");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.56);
        healthyBurger.addHamburgerAddition1("Egg", 0.4);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Pickles", 0.5);
        System.out.println("Total Healthy Burger price is "
                + healthyBurger.itemizeHamburger());
        System.out.println("****************************************");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not exist", 100);
        db.itemizeHamburger();

    }
}
