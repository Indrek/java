import java.util.Scanner;

public class ScannerNaide {

    public static void main(String[] args) {
//        System.out.println();
        // Kasutajalt sisendi saamine
        // Scannner klass

        Scanner scanner = new Scanner(System.in);

        //System.out printis teksti konsooli
        //System.in võtab sisendi konsoolist

        System.out.println("Sisesta oma sünniaasta:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Sisesta oma nimi:");
            String name = scanner.nextLine();

            int vanus = 2021 - yearOfBirth;
            if (vanus >= 0 && vanus <= 100) {
                System.out.println("Sinu nimi on " + name + ", sinu vanus " + vanus);
            } else {
                System.out.println("Kahtlane sünniaasta");
            }
        } else {
            System.out.println("Ei saa parsida sünniaastat");
        }

        scanner.close();
    }
}
