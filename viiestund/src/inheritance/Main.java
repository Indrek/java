package inheritance;

public class Main {

    public static void main(String[] args) {
        // inheritance (alamklassid ja ülemklassid)
        Dog dog = new Dog("Puudel", 10, 2, 2, 4, 1, 20, "Karvane");
//        dog.eat();
//        dog.walk();
//        dog.run();
//        dog.move(15);

        Fish fish = new Fish("Heeringas", 3, 1, 2,2,3);
        fish.swim(5);
    }
}
