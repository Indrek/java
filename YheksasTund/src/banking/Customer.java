package banking;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) { //Kuidas storeme amounti?
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);

    }
    //vajame meetodit, et lisada transactioneid
    public void addTransaction(double amount) { //primitiivne tüüp (double)
        this.transactions.add(amount); //convertib primitiivsest objektiks
    }
    //mõlemad getterid. äkki läheb vaja.
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
