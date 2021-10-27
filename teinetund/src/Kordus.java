public class Kordus {

    public static void main(String[] args) {
        int a; // täisarv (-9, 0, 100)
        double d; // komakohaga arvud (-5.2, 0.0, 7.5)
        boolean b; // true / false
        String s; // "tekst"

        /*
        tehted
        + - liitmine
        - - lahutamine
        * - korrutamine
        / - jagamine
        % - jääk
         */

        /*
        põhilised loogikaoperatsioonid
        && - ja
        || - või
        ! - inversioon (not)
         */

        /*
        == - võrdub (kontrollib, kas mõlemad pooled on samad)
        < - väiksem
        > - suurem
        <= - väiksemvõrdne
        >= - suuremvõrdne
        != - ei võrdu
         */

        int number1 = 1;
        int number2 = 1;
        int number3 = 3;
        if (number1 < number2) {
            System.out.println("-2 on suurem kui 1");
            if (number2 > number3) {
                System.out.println("-2 on suurem kui 3");
            } else {
                System.out.println("-2 on väiksem kui 3");
            }
        } else {
            System.out.println("-1 ei ole suurem kui 2");
        }

        if (number1 > number2) {
            System.out.println("1 on suurem kui 2");
        } else if (number2 > number1) {
            System.out.println("2 on suurem kui 1");
        } else {
            System.out.println("1 = 2");
        }
        System.out.println("Kood läheb edasi");
    }
}
