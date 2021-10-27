public class NaidisYlesanne {
    public static void main(String[] args) {
        double centimeters = calcCentimeters(1000);
        System.out.println(centimeters);
        System.out.println(5/3);
        System.out.println(5%3);
    }
    // Tee meetod nimega calcCentimeters
// Sellel meetodil on 2 parameetrit
// Esimene on jalad (feet), teine on tollid (inches)

// Kontrolli, et esimene parameeter (feet) oleks >=0
// Kontrolli, et teine parameeter oleks >= 0 ja <= 12 (0 ja 12 vahel, kaasaarvatud)
// return -1, üks neist ei vasta tõele.

// Kui parameetrid on õiged, arvuta, kui mitu sentimeetrit need jalad ja tollid annavad
// return see väärtus

// Tee teine meetod sama nimega (calcCentimeters)
// Selle meetodi parameetriks on ainult tollid
// Kontrolli, et see oleks >= 0
// return -1, kui ei ole
// Kui on, arvuta, mitu jalga nendes tollides on
// Kasuta selleks esimest meetodit (mis võttis 2 sisendit)
// Vihje: Kasuta double andmetüüpi

// 1 toll = 2.54 cm, 1 jalg = 12 tolli
// Õige meetodi kasutamine sõltub ainult parameetrite arvust, antud juhul kas 2 või 1.

    public static double calcCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " jalga ja " + inches + " tolli on " + centimeters + "cm");
        return centimeters;
    }
    public static double calcCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12; //
        double remainingInches = (int) inches % 12; // 25 % 12 = 1
        System.out.println(inches + " tolli on " + feet + " jalga ja " + remainingInches + " tolli");
        return calcCentimeters(feet, remainingInches);

    }

}
