public class Main {

    public static void main(String[] args) {

        //interface
        //interface on abstraktne

        ITelephone jukuPhone;
        jukuPhone = new DeskPhone(123);
        jukuPhone.powerOn();
        jukuPhone.callPhone(123);
        jukuPhone.answer();

        jukuPhone = new MobilePhone(234);
        jukuPhone.powerOn();
        jukuPhone.callPhone(234);
        jukuPhone.answer();

        //me saime teha uue instantsi, MobilePhone, täiesti uue klassina kasutades sama muutujat
        //(jukuPhone)

        //class Bird extends Animal implements IWalk, IFly
        //class Dog extends Animal implements IWalk
    }

}
