package lahendus;

public class Job {

    private String role;
    private int salary;

    public Job(String role, int salary) {
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
