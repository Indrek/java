package inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("Moving muscles");
    }

    private void moveBackFin() {
        System.out.println("Moving back fin");
    }
    public void swim(int speed) {
        System.out.println("Swimming");
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
