public class FizzBuzz {

    public static void main(String[] args) {
        //Printi numbrid 1-100
        //Kõik nr-d, mis jagunevad 3-ga, printi nr asemel "Fizz"
        //Kõik nr-d, mis jagunevad 5-ga, printi nr asemel "Buzz"
        //Kõik nr-d, mis jagunevad nii 3 kui 5-ga, printi "FizzBuzz"


        for(int i = 0; i <= 100 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // kitsamad tingimused ette
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz"); // laiemad tingimused alla
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
