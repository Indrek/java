public class ByteLongIntShort {

    public static void main(String[] args) {
        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println(minIntValue);
        System.out.println(maxIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println(minByteValue);
        System.out.println(maxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long longValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        //komaga numbrid

        float floatValue = 5.5f; // 32 bit
        double doubleValue = 5.5d; // 64 bit

        // int ja double
        int myInt = 6;
        double myDouble = 6.5;

        float floatNaide = 5f / 3f;
        double doubleNaide = 5d / 3d;

        System.out.println(floatNaide);
        System.out.println(doubleNaide);

        /*
        ülesanne:
        Konverteeri naelad kilogrammideks
        1 nael = 0.45359237 kg
        vihje: kasuta double andmetüüpi
        printi X naela on Y kilo.

        NÄIDE: 3 naela on 1.36077...(siin õige number)..... kilo.
         */

        double naelKilodes = 0.45359237;
        double naelad = 3;
        double arvutus = naelad * naelKilodes;

        System.out.println(naelad + " naela on " + arvutus + " kilo.");

        // char
        char myChar = 'D';
        System.out.println(myChar);
        char uniCodeChar = '\u0045';
        System.out.println(uniCodeChar);

        char copyRightSymbol = '\u00A9';
        System.out.println(copyRightSymbol);

        // boolean
        // väärtused ainult true või false

        boolean trueBoolean = true;
        boolean falseBoolean = false;

        System.out.println(trueBoolean);
        System.out.println(falseBoolean);

        boolean isCustomerOverTwentyOne = true;

        // int, double, boolean

        // sõne (String)

        String myString = "See on sõne.";
        System.out.println(myString);
        myString = myString + " Veel mingi jutt";
        System.out.println(myString);
        myString = myString + "\u00A9 2021";
        System.out.println(myString);
        System.out.println("myString" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);

        String lastString = "10";
        int myInt2 = 50;
        lastString = lastString + myInt2;
        System.out.println(lastString);
        //1050 (mitte 60)

        String muutujaNimi = "asdasd";
        int minuNumber = 1;
        double minuKoma = 1.5;

        muutujaNimi = "asdf";
        minuNumber = 2;
        minuKoma = 3.5;

        minuNumber = minuNumber + 1;



    }

}
