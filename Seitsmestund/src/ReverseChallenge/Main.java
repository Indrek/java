package ReverseChallenge;

import java.util.Arrays;

public class Main {

    // {5, 4, 3, 2, 1} -> {1, 2, 3, 4, 5}
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }
    private static  void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        //miks pool pikkusest?
        //Me vahetame elemente (esimese ja viimase). Me vahetame elemente.
        //Kui poolele jõuame, on teine pool juba vahetatud
        //kui kasutada array.length
        // {1,2,3} -> 1->3; {3,2,1} -> 2->2 {3,2,1}; -> 3->1 (tehniliselt 1->3 uuesti) {1,2,3}


        for(int i = 0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }

    }
}


