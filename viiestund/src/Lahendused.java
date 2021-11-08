public class Lahendused {

    public static void main(String[] args) {
        // 1. nr-te summa (while ülesanne)
        // Kirjuta meetod sumDigits, millel on üks "int" paarameeter nimega "number".
        // Kui parameeter >=10, peaks meetod tagastama arvus olevate numbrite summa (nt 125 => 1 + 2 + 5 = 8)
        // Kui on alla 10-ne (nt vahemik 0-9 v neg arv), peaks meetod tagastama -1
        // Kutsu kood main meetodis välja ja testi seda erinevate arvudega (sh erineva pikkusega)
        System.out.println(sumDigits(125)); // 1 + 2 + 5 = 8
        System.out.println(sumDigits(-125)); // neg arv = -1
        System.out.println(sumDigits(4)); // <10 = -1
        System.out.println(sumDigits(32123)); // 3 + 2 + 1 + 2 + 3 = 11

    }
    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            //saame kätte viimase numbri
            int digit = number % 10; // 125 -> 125 % 10 = 5; //// 12 % 10 = 2 /// 1 % 10 = 1
            sum += digit;
            //eemaldame viimase numbri
            number /= 10; // number = number / 10; -> 125 / 10 = 12; //// 12 / 10 = 1 //// 1 / 10 = 0
        }
        return sum;
    }


        // System.out.println(sumDigits(125)); -> 8
        // System.out.println(sumDigits(-125)); -> -1
        // System.out.println(sumDigits(4)); -> -1
        // System.out.println(sumDigits(32123)); -> 11

        // Vihjed:
        // Kasuta n % 10, et leida kõige väiksem number (nt 125 % 10 = 5)
        // Kasuta n = n/10, et eemaldada kõige väiksem number (nt n = 125 / 10 = 12)

        // 2. min & max
        // Loe kasitaja poolt sisestatud nr-d, printi minimaalne ja maksimaalne sisestatud number
        // Enne, kui kasutaja sisestab numbri, printi "Sisesta number:"
        // Kui kasutaja sisestab mitte-numbri, break-i loopist välja ja printi min ja max numbrid

        // Vihjed:
        // Kasuta lõpmatut while-loopi


}
