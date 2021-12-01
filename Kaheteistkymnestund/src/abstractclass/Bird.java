package abstractclass;

public abstract class Bird extends Animal implements CanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
