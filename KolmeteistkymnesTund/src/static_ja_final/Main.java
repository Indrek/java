package static_ja_final;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstance());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstance());

        //static väli (klassi väli) on seotud klassiga, mitte instantsiga.
        //klassid jagavad static muutujaid

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstance());
        //sama, mis meil oli näiteks Integer.parseInt();

        int answer = multiply(6);
        System.out.println("The answer is " + answer);

        //non-static saab static kasutada
        //static ei saa non-static kasutada

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        //inkrementeeritud väärtus salvestatakse väljana (mitte ei kutsu meetodiga)
        //iga instants säilitab oma väärtuse

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        //kuna see on final, siis ei saa innstantsi numbrit muuta.
//        one.instanceNumber = 4; //error
        //kui tead, et väärtust ei ole vaja muuta pärast initseerimist, siis võib final panna (nt konstant)
        System.out.println(Math.PI);

//        Math m = new Math();
        //class final = ei saa alamklasse teha
        //kui tahad, et meetodeid ei kirjutataks üle (override), siis saab need final panna.

        int pw = 4567;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(387465);
        password.letMeIn(4567);
    }
    public static int multiply(int number) {
        return number * multiplier;
    }

}
