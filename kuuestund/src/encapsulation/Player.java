package encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;
    //siin praegu public, see on OK, ainult näiteks
    //konstruktorit ei tee

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
