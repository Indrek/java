public class ForLoopChallenge {
    public static void main(String[] args) {
        //Tee loop, mille vahemik on 1-1000 (kaasaarvatud) (<=)
        //Liida kõik numbrid, mis jagunevad 3 JA 5-ga (nt 15) ( 3 % 3 = 0; 5 % 3 = 2) (jääk)
        //(kasuta kontrollil if-i)
        //Printi kõik numbrid, mis seda tingimust täidavad
        //break-i loopist vällja, kui on leitud 5 numbrit, mis seda tingimust täidavad
        //Pärast break-i, printi numbrite summa, mis täitsid seda tingimust
        //Kirjuta kood main meetodisse (eraldi meetodit pole vaja)

        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("3 ja 5-ga jagub number " + i);
                sum += i; // sum = sum + i, esimesel iteratsioonil 0 + 15, jne
                count++;
            }
            if (count == 5) {
                break;
            }
//            System.out.println(i);
        }
        System.out.println(sum);



    }
}
