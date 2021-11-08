import java.util.Scanner;

public class Lahendus2 {

    public static void main(String[] args) {
        // 2. min & max
        // Loe kasitaja poolt sisestatud nr-d, printi minimaalne ja maksimaalne sisestatud number
        // Enne, kui kasutaja sisestab numbri, printi "Sisesta number:"
        // Kui kasutaja sisestab mitte-numbri, break-i loopist välja ja printi min ja max numbrid

        // Vihjed:
        // Kasuta lõpmatut while-loopi

        Scanner scanner = new Scanner(System.in);

        boolean first = true;
        int min = 0;
        int max = 0;

        while (true) {
            System.out.println("Sisesta number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        if (first) {
            System.out.println("N/A");
        } else {
            System.out.println("Min number: " + min);
            System.out.println("Max number: " + max);
        }
        scanner.close();
    }

}
