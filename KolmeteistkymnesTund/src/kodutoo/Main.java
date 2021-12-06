package kodutoo;

import java.util.Scanner;

public class Main {
    //Kirjuta väike programm, mis loeb integer tüüpi väärtusi klaviatuurilt
    //(kasutades Scannerit) ja printib korrutustabeli selle nr kohta 1-12

    //lubatud on nimetada "scanner" muutuja Scanner instantsi jaoks. Samuti võib kasutada nii palju
    //muutujaid, kui vaja, aga kõik peavad olema nimega "x",
    //sh klasside instantsid ja loopide sees olevad muutujad

    //Kui kasutada klassi, siis see klass peab olema nimega X (suur täht)
    //ning selle instantsid peavad olema nimega x (väike täht)
    //iga meetod, mis klassi läheb, peab olema ka nimega x

    //boonus:
    //tee kood selliselt, kõik muutujad (sh scanner) on nimega x.

    //Igaks juhuks mainin, et selliselt asjade nimetamine ei ole hea tava, aga võib-olla aitab
    //scopest rohkem aru saada
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");

        X x = new X(new Scanner(System.in));
        x.x();
    }
}
