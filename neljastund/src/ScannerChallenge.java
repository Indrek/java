import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {
        //Challenge
        // Loe kasutajalt 10 nr-t (scanner)
        // Kasuta hasNextInt() meetodit, et kontrollida, kas kasutaja sisestas int-i
        // Kui hasNextInt() on false, printi "Invalid number". Jätka lugemist, kuni on loetud 10 nr-t
        // Kasuta nextInt() meetodit, et number kätte saada ja summase lisada.
        // Enne, kui kasutaja sisestab nr-i, printi "Enter number #x:", kus x on loendus (nt 1, 2, 3, jne)

        // Vihjed:
        // kasuta while loopi
        // kasuta counter muutujat, et loendada korrektseid numbreid
        // Sulge scanner, kui seda enam vaja ei lähe

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter != 10) { // kuni leitud 10 numbrit
            int order = counter + 1;
            System.out.println("Enter number #" + order + ".");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number; // sum = sum + number
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Summa = " + sum);



        scanner.close();

    }

}
