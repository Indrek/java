package abstractclass;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out");
    }
    //interface puhul olid ainult meetodid, mis olid abstraktsed
    //abstract klasside puhul saaame lisada väljasid, meetodeid + abstraktseid
}
