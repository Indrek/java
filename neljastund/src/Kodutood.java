public class Kodutood {

    public static void main(String[] args) {
        // 1. ül (while) (ei ole scanneriga)
        // Kirjuta meetod sumDigits, millel on üks "int" parameeter nimega "number"
        // Kui number on >= 10, peaks meetod tagastama arvus olevate numbrite summa (125 ==> 1 + 2 + 5 = 8)
        // Kui on alla 10-ne (nt vahemikus 0-9, v neg arv), peaks meetod tagastama -1
        // Kutsu kood main meetodis välja ja testi erinevate arvudega (sh erineva pikkusega)

        //System.out.println((sumDigits(125))); -> 8
        //System.out.println((sumDigits(-125))); -> -1
        //System.out.println((sumDigits(4))); -> -1
        //System.out.println((sumDigits(32123))); -> 11

        //Vihjed:
        // Kasuta n % 10, et leida kõige väiksem number (nt 125 % 10 = 5)
        // Kasuta n = n / 10 (n /= 10), et eemaldada kõige väiksem number (nt 125 / 10 = 12)


        // 2. ül min & max (scanner)
        // Loe kasutaja poolt sisestatud nr-d, printi minimaalne ja maksimaalne sisestatud number
        // Enne, kui kasutaja sisestab numbri, printi "Sisesta number:"
        // Kui kasutaja sisestab mitte-numbri, break-i loopist välja ja printi min ja max numbrid


        //NÄITED
        //Sisesta number:
        // 6
        //Sisesta number:
        // abc
        //min = 6, max = 6

        //Sisesta number:
        // 9
        //Sisesta number:
        // 5
        //Sisesta number:
        // 11
        //Sisesta number:
        // a
        //min = 5, max nr = 11

        //Vihjed:
        // Kasuta lõpmatut while loopi.
    }
}
