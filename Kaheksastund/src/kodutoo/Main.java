package kodutoo;

public class Main {

    //Kodutöö (esmaspäevaks)
    //Programmi idee on aidata fiktiivset firmat Juku Burgerid
    //Programm aitab Jukul valida burgerite tüüpe ja lisasid, mis burgeriga kaasas käivad + hinnad
    //Teeme baas-tüüpi burgeri ja kaks teist tüüpi burgerit, mis on Juku poes populaarsed

    //Baas-burgeril peaks olema järgmised esemed (komponendid):
    //Leiva tüüp (bread roll type), liha (meat) ja veel kuni 4 lisa (salat, tomat, porgand, jne),
    //mida klientt saab valida ja burgerile lisada

    //Iga lisa eest võetakse lisatasu, seega leia viis, et trackida,
    //kui mittu lisa lisati ja arvuta burgeri hind (baas-burger + lisad)
    //Selle burgeri hind on baas-burgeri hinnd + lisad, kõik eraldi (kuni 4 lisa)

    //Tee Hamburger klass, mis sellega tegeleks
    //Selle konstruktor peaks võtma ainult leiva/saiatüübi (bread roll type), liha (meat)
    //ja hinna(price)
    //Võib lisada ka nime (konstruktorisse) või kasutada setterit

    //Lisa veel 2 burgeritüüpi hamburgereid (Hamburger alamklass):

    //A) Healthy burger (rukkileivaga) + 2 võimalikku lisa
    //Healthy burgeril võib olla 6 lisa
    //Vihje: 2 ekstra lissagga on ilmselt mõistlik alamklassis teggeleda, mitte baas-klassis(Hamburger)
    //kuna need 2 ekstra lisa  käivad ainult seda tüüpi burgeri kohta

    //B) Deluxe burger - tuleb friikate ja joogiga, aga rohkem lisasid pole lubatud
    //Vihje: Leia viis, kuidas automaatselt need lisad burgerile lisada deluxe burgeri objekti loomise hetkel
    //(ehk deklareerides) ning takista rohkemate llisade lisamist.

    //Kõik 3 klassi  peaksid omama meetoditr, mis näitab burgeri baas-hinda + lisasid,
    //igal ühel lisa nimi ja lisamishind, ja lõpphind (total) kogu burgeri eest (burger + lisad).
    //Lisaburgerite puhul võib hindasid vaadata baas-klassist ja lisada sealt total lõpphinnale.

    //Lisad võib teha omaette väljadena (2 välja: nimi + hind) või kasutada massiive (array)




}
