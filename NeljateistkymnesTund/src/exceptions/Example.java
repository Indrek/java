package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        try {
            int x = getInt();
            int y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No suitable input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempted to divide by 0");
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");

        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Please enter a number using digits 0-9");
            }
        }
    }
}
