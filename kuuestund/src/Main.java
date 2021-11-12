public class Main {

    public static void main(String[] args) {
        //Challenge
        //Tee klass Vehicle, siis klass Car, mis on Vehicle alamklass
        //Tee uus klass spetsiifilise auto kohta, mis on Car alamklass
        //Roolimine, käigu vahetus, liikumine - meetodid
        //Otsusta, mis klassi need lähevad (sh muud asjakohased omadused)
        //spetsiifilise auto kohta lisa talle mingi spetsiifiline omadus

        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

    }
}
