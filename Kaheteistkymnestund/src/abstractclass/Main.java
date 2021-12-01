package abstractclass;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Collie");
        dog.breathe();
        dog.eat();

        Parrot bird = new Parrot("Parrot");
        bird.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

        //interface vs abstract class
        //is-er, has-er
        //dog = animal
        //bird = animal
        //nahkhiir oskab lennata. flyinganimals klass?
        //nahkhiir sünnitab, lind muneb. flyinganimals inheritib mammalsandbirds kllassi
        //kõik loomad ei oska lennata.

        //kus me valesti läksime?
        //
    }

}
