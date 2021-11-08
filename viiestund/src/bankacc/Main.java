package bankacc;

public class Main {
    //Teeme pangakonto
    //Kontonumber, kontojääk, kliendi nimi, email, tel nr
    //raha sisse, raha välja
    public static void main(String[] args) {

        Account account = new Account("123456",500,"Johan Johanson",
                "555 5555","johan@johanson.ee");
//        account.setAccNumber("123456");
//        account.setBalance(500);
//        account.setCustName("Johan Johanson");
//        account.setPhone("555 5555");
//        account.setEmail("johan@johanson.ee");
        System.out.println(account.getAccNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustName());
        System.out.println(account.getPhone());
        System.out.println(account.getEmail());

        System.out.println("*****************************");

        Account newAccount = new Account();
        System.out.println(newAccount.getAccNumber());
        System.out.println(newAccount.getBalance());
        System.out.println(newAccount.getCustName());
        System.out.println(newAccount.getPhone());
        System.out.println(newAccount.getEmail());

        System.out.println("*****************************");

        Account newNewAccount = new Account("Malle Kaigas",
                "malle@kaigas.ee", "123 456");
        System.out.println(newNewAccount.getAccNumber());
        System.out.println(newNewAccount.getBalance());
        System.out.println(newNewAccount.getCustName());
        System.out.println(newNewAccount.getPhone());
        System.out.println(newNewAccount.getEmail());

        System.out.println("*****************************");
        account.withdraw(600);
        account.deposit(500);
        account.withdraw(600);
        System.out.println(account.getBalance());
    }

}
