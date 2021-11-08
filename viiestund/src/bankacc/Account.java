package bankacc;

public class Account {
    private String accNumber;
    private double balance;
    private String custName;
    private String email;
    private String phone;

    public Account() {
        this("000000", 0, "Default name", "default@hot.ee", "000 0000");
        System.out.println("Default constructor");
    }

    public Account(String custName, String email, String phone) {
        this("999999", 10, custName, email, phone);
        System.out.println("Osaline konstruktor");
    }

    public Account(String accNumber, double balance, String custName, String email, String phone) {
        // Konstruktor. Nimi peab olema sama, mis klassil (antud juhul Account)
        this.accNumber = accNumber;
        this.balance = balance;
        this.custName = custName;
        this.email = email;
        this.phone = phone;

        System.out.println("Terve konstruktor");
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit (double amount) {
        this.balance += amount;
        System.out.println(amount + " deposited to account. New balance is " + this.balance);
    }
    public void withdraw (double amount) {
        if (amount > this.balance) { // (this.balance - amount < 0)
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance is " + this.balance);
        }
    }
}
