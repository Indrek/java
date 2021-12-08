package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        //LBYL - Look before you leap
        System.out.println(divideLBYL(x, y));

        //EAFP - Easier to Ask Forgivness than Permission
        System.out.println(divideEAFP(x, y));

        int z = getIntEAFP();
        System.out.println("z is " + z);
    }

    private static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = s.next();
        for(int i = 0; i < input.length(); i++) {
            // ['a', 's', '3', 'd']
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try { //senikaua, kuni exceptioneid ei ole, siis try käib. kui error, otsib catch blokki vastava erroriga
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }


    private static int divideLBYL (int x, int y) { //look before you leap
        //Kõigepealt kontrollib, kas on 0, siis toimetab edasi
        if (y != 0) {
            return x / y;
        } else { // y == 0
            System.out.println("0-ga ei saa jagada");
            return 0;
        }
    }
    private static int divideEAFP(int x, int y) {
        //Toimetab sõltumata sellest kas 0 või mitte. Kui on, siis catchib exceptioni.
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("0-ga ei saa ikka jagada");
            return 0;
        }
    }

}
