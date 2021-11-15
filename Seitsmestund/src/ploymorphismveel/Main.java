package ploymorphismveel;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }
    public String accelerate() {
        return "Car -> accelerate()";
    }
    public String brake() {
        return "Car -> brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {

        //auto analoog

        //baasklass Car
        //väljad, mis on tüüpilised suvalise auto kohta
        //nt mootor, silindrid, rattad jne
        //konstruktori
        //rattad 4, mootor true
        //meetod startEngine, accelerate ja brake
        //printime teksti iga meetodi jaoks baasklassis
        //alamklass
        //overridime vajalikud meetodid

        Car car = new Car(4, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(4, "Mitsu");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
    }
}
