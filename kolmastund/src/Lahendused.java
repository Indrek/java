public class Lahendused {

    public static void main(String[] args) {
        // 1. harjutus (void)
        // Tee meetod (sisend int), mis ütleb, kas number on negatiivne, 0 või positiivne
        meetod(-1);
        meetod(0);
        meetod(1);
        conversion(100);
        System.out.println(getDuration(66, 59));
        System.out.println(getDuration(3666));
    }
    public static void meetod(int number) {
        if (number < 0) { //kui see on true, siis teeb selle koodibloki
            System.out.println("Number on negatiivne");
        } else if (number == 0) {
            //kui esimene on false ja see true, siis see koodiblokk)
            System.out.println("Number on 0");

        } else { //kui üksi pole tõene, siis see
            System.out.println("Number on positiivne");
        }
    }
    // 2. harjutus (double)
    // Kontrolli, et sisend poleks negatiivne (return -1 kui on)
    // tee meetod (sisend double), mis konverteerib kilomeetrid miilideks
    // miil = kilomeeter / 1.609

    public static double kmToMiles(double kiloMeters) {
        if (kiloMeters < 0) {
            return -1;
        }
        return (kiloMeters / 1.609);
    }
    // 2.1 (void)
    // Kontrolli, et sisend poleks negatiivne (return -1 kui on)
    // Tee meetod (sisend double), mis võtab 2. harjutusest tulemuse ja kuvab:
    // X km/h on Y mi/h

    public static void conversion(double kilometers) {
        if (kilometers < 0) {
            System.out.println("Invalid value");
        } else {
            double miles = kmToMiles(kilometers);
            System.out.println(kilometers + " km/h = " + miles + " mi/h");
        }
    }
    // 3. (String) (analoogne jala-tolli näitele)
    // tee meetod nimega getDuration, mis returnib Stringi
    // esimene parameeter minutid, teine sekundid (soovitatav int)
    // kontrolli, et minutid oleksid >= 0
    // kontrolli, et sekundid oleksid >= 0 ja <= 59
    // meetod peaks tagastama "Invalid value", kui kumbki neist tingimustest pole täidetud

    // kui parameetrid on õiged, returni String kujul "XXh YYm ZZs", kus XX on tunnid, YY minutid ja ZZ sekundid.
    // (näide: 10h 36m 15s)

    // tee teine (sama nimega) meetod, kus parameetriks on ainult sekundid
    // kontrolli, et sisend oleks >= 0
    // kui mitte, returni "Invalid value"
    // pärast kontrolli, kasuta esimest meetodit, et arvutada tunnid, minutid ja sekundid

    // 1 min = 60 sek
    // 1 h = 60 min, 3600 sek

    // Boonus:
    // Kui on ühekordne number (0-9), kuva 0 nr ette
    // näide: 1h 0m 8s -> 01h 00m 08s

    public static String getDuration (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        }
        int hours = minutes / 60; // 66 -> 66 / 60 = 1 (tund)
        int remainingMinutes = minutes % 60; // 66 -> 66 / 60 = 6 (minutit)

        //boonus
        String hoursString = hours + "h"; // "1h"
        if (hours < 10) {
            hoursString = "0" + hoursString; // "0" + "1h" -> "01h"
        }
        String minutesString = remainingMinutes + "m"; // "1m"
        if (hours < 10) {
            minutesString = "0" + minutesString; // "0" + "1m" -> "01m"
        }
        String secondsString = seconds + "s"; // "6s"
        if (hours < 10) {
            secondsString = "0" + secondsString; // "0" + "6s" -> "06s"
        }

        //return hours + "h " + remainingMinutes + "m " + seconds + "s";
        return hoursString + " " + minutesString + " " + minutesString;

    }
    public static String getDuration (int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDuration(minutes,remainingSeconds);
    }
    // stackoverflow (kõik progremisega seotud küsimused)
}
