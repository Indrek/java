package ArrayChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Sorteeri array numbrid kahanevas järjekorras
        //Sisend kasutajalt
        //meetodid, mida vaja:
        //getIntegers
        //printArray
        //sortIntegers

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i<array.length;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length;i++) {
//            sortedArray[i] = array[i];
//        } //sortedArray on (hetkel) koopia sisendarray'st
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            // element 0 50 -> 160
            // element 1 160 -> 50
            // element 2 40

            for (int i = 0; i < sortedArray.length-1; i++) {
                //kui -1 pole, siis
                // ERROR: Index 5 out of bounds for length 5
                //0, 1, 2, 3, 4; -> for loop tahab kätte saada indeksit 5. Seda pole olemas, seega error.
                //Miks tahab element 5 saada?
                if(sortedArray[i] < sortedArray[i+1]) { //sest siin on i+1
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1]; //(ja siin ka)
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }

}
