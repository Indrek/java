public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        result = result - 1; // 3 - 1 = 2
        System.out.println(result);

        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(result);

        result = result % 3; // jääk 4 % 3 = 1
        System.out.println(result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; // 2 - 1 = 1
        System.out.println(result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println(result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println(result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println(result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println(result);


        boolean isAlien = true;

        if (isAlien == true) {
            System.out.println("See on tulnukas!");
            System.out.println("Ma kardan tulnukaid");
        }

        int topScore = 81;

        if (topScore == 100) {
            System.out.println("Sa said parima skoori!");
        }

        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Sinu skoor on parem kui teine ja hea tulemus");
        }

        if (((topScore > 90) || (secondTopScore <= 90)) && (topScore == 81)) {
            System.out.println("Üks või mõlemad on tõesed");
        }

        // && - ja (mõlemad tingimused peavad olema täidetud)
        // || - või (vähemalt üks tingimus peab olema täidetud)
        // võib olla rohkem tingimusi

        boolean isCar = false;
        if (isCar) { // if (isCar == true)
            System.out.println("This is a car");
        }

        if (!isCar) {// if (isCar == false) (hüüumärk)
            System.out.println("This is not a car");
        }

        /*
        == (peab olema võrdne)
        > (suurem)
        < (väiksem)
        <= (väiksemvõrdne)
        >= (suuremvõrdne)
        != (ei tohi võrduda)
        true / false
         */

        isCar = true;

        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        System.out.println(isEighteenOrOver);

        /*
        ülesanne:
        1) double = 20
        2) double2 = 80
        3) liida numbrid ja korruta 100-ga
        4) leia jääk saadud summa ja 40 vahel (summa jagatud 40, vajame jääki)
        5) tee boolean, mis annab vastuse true kui jääk on 0 ja false kui ei ole 0
        6) printi booleani väärtus
        7) kirjuta if konditsioon, mis ütleb "Jääki jäi üle" kui boolean punktis 5 ei ole true.
         */

        double d1 = 20; // punkt 1
        double d2 = 80; // punkt 2
        double vaheSum = d1 + d2; // punkt 3
        double sum = vaheSum * 100; // punkt 3
        double remainder = sum % 40; // punkt 4
        System.out.println("Jääk on " + remainder);
        boolean isRemainder = (remainder != 0) ? true : false; //punkt 5
        System.out.println(isRemainder); //punkt 6
        if (isRemainder) { //punkt 7
            System.out.println("Jääki jäi üle");
        }
        // && || !(not)
        /*
        1 2 && || !1
        T T  T  T  F
        T F  F  T  F
        F T  F  T  T
        F F  F  F  T
        loogikatabel
         */
    }

}
