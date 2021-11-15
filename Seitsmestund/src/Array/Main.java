package Array;


import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myVariable; //array (massiiv)
        myVariable = new int[10]; //kantsulgudes mitu elementi

        double[] doubles = new double[5];
        String[] strings = new String[3];

        int[] myIntArray = new int[10]; //esimene element alati indeksiga 0
        myIntArray[5] = 50; //kuigi nr 5, siis ta on 6-s element.
        myIntArray[2] = 20;

        int[] newIntArray = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(newIntArray[0]);
//        System.out.println(newIntArray[6]);
//        System.out.println(newIntArray[9]);

        int[] forIntArray = new int[25];
        for(int i = 0; i<forIntArray.length; i++) {
            forIntArray[i] = i*10;
        }
        printArray(forIntArray);

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i<myIntegers.length;i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average was " + getAverage(myIntegers));



    }
    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}
