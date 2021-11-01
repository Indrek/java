public class ForLoop {

    public static void main(String[] args) {
        System.out.println("Number 1");
        System.out.println("Number 2");
        System.out.println("Number 3");
        System.out.println("Number 4");
        System.out.println("Number 5");
        //System.out.println("10 000 eur 2% intressiga = ");

        //Koosneb kolmest osast:
        // 1) Kood, mis täidetakse tsükli alguses
        // 2) Tingimuslause (senikaua, kuni vastab tõele, tsükkel käib)
        // 3) Kood, mis täidetakse igal tsükli sammul (iteratsioonil).
        // for(int i = 0; i < 5; i++)
        for(int i = 0; i < 5; i++) {
            System.out.println(i + ". iteratsioon");
            if (i == 2) {
                break;
            }
        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10 000 eur " + i + "% intressiga = "
                    + String.format("%.2f",calculateInterest(10000, i)));
            // Stringi format meetod, paneb numbri 2 komakohaga
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return ((amount) * (interestRate / 100));
    }
}
