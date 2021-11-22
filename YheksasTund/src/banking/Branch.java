package banking;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        //Boolean sellepärast, et kui anname customeri, kes on juba olemas, siis tahame,
        //et meetod failiks (false)
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
    //findCustomer on sisemiselt kasutatav meetod
    private Customer findCustomer(String customerName) {
        for(int i = 0; i<this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i); //natuke ilusam
            if(checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null; //no matches. customer not on file
    }

}
