package encapsulation;


public class Main {

    public static void main(String[] args) {
        //kapseldamine (encapsulation)
        //Takistame teisi klasse ligi pääsemast, et kogemata koodi ei lõhu vms.

        Player player = new Player();
        player.name = "Juku";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Health remaining: " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Health remaining: " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Juhan", 500, "Sword");
        //kui 500, läheb automaatselt 100 peale (vt enhancedPlayer klassi)
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
