package lahendus;

public class Main {

    public static void main(String[] args) {
        //Kodutöö
        //Tee kaks klassi Person ja Job
        //Job klassis peaks olema 2 välja nime ja tasu kohta (name & salary)
        //Person klassis nimi ja töö
        //Tee konstruktorid ning vastavad getterid ja setterid, mis tunduvad loogilised
        //Testi oma koodi main meetodis (loo uus person, määra talle töö ja tasu jms)

        Job unemployed = new Job("Unemployed", 0);

        Person person = new Person("Juku", unemployed);

        System.out.println(person.getName());
        System.out.println(person.getSalary());
        System.out.println(person.getJob().getRole());

        Job job = new Job("CEO", 15000);
        person.setJob(job);
        System.out.println(person.getSalary());
        System.out.println(person.getJob().getRole());
    }
}
