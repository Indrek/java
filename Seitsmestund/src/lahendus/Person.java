package lahendus;

public class Person {

    private String name;
    private Job job;

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return job.getSalary();
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }


}
