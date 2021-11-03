public class WhileLoop {

    public static void main(String[] args) {
        //while loop, do-while loop
        //while loop töötab ainult siis, kui tingimus on täidetud
        //do-while loop, töötab alati vähemalt 1 korra sõltumata sellest, kas tingimus on täidetud.

        int count = 0;
        while (count != 5) {
            System.out.println("Count value = " + count);
            count++;
        }
        System.out.println("*******************************");

        for (int i = 0; i != 5; i++)  {
            System.out.println("Count value = " + i);
        }
        System.out.println("*******************************");

        count = 0;
        while(true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value = " + count);
            count++;
        }
        System.out.println("*******************************");

        // do-while jooksutab koodi alati vähemalt 1 korra

        //do {} while (tingimus);
        count = 4;
        do {
            System.out.println("Count value = " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 5);

        System.out.println("*******************************");
        int number = 4;
        int finishNumber = 20;


        // Muuda alumist koodi:
        // Loenda, kui mitu paaris numbrit on leitud
        // break-i tsüklist välja, kui on leitud 5 numbrit
        // Kõige lõpuks printi, mitu paaris numbrit on leitud
        int numberFound = 0;
        while (number < finishNumber) {
            number++;
            if(!isEvenNumber(number)) { // ! - NOT
                // continue ei jooksuta koodi, mis on allpool ja läheb algusesse tagasi,
                // kui loopi tingimus on endiselt täidetud.
                continue;
            }
            System.out.println("Even number: " + number);
            numberFound++;
            if (numberFound >= 5) {
                //System.out.println("Paaris numbreid leitud: " + numberFound); - võib siin sees ka olla
                break;
            }
        }
        System.out.println("Paaris numbreid leitud: " + numberFound); // võib üleval enne break-i ka olla

        // tee meetod, mis ütleb, kas sisestatud number on paaris või paaritu (boolean) (true / false)
        // kasuta %
        // paaris arvud jaguvad kahega

        // Muuda ülemist  koodi:
        // Loenda, kui mitu paaris numbrit on leitud
        // break-i tsüklist välja, kui on leitud 5 numbrit
        // Kõige lõpuks printi, mitu paaris numbrit on leitud
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0; // true kui on paaris, false kui on paaritu
    }


}
