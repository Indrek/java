public class Harjutused {
    public static void main(String[] args) {
        // 1. harjutus (void)
        // Tee meetod (sisend int), mis ütleb, kas number on negatiivne, 0 või positiivne

        // 2. harjutus (double)
        // Kontrolli, et sisend poleks negatiivne (return -1 kui on)
        // tee meetod, mis konverteerib kilomeetrid miilideks
        // miil = kilomeeter / 1.609

        // 2.1 (void)
        // Kontrolli, et sisend poleks negatiivne (return -1 kui on)
        // Tee meetod, mis võtab 2. harjutusest tulemuse ja kuvab:
        // X km/h on Y mi/h

        // 3.
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
    }
}
