package src;

public class Account {
    private String customer;
    private double balance;

    // Constructor
    public Account() {};

    public Account(String name, double balance)  {
        this.customer = name;
        this.balance = balance;
    }

    public void printAccount() {
        System.out.println("Account Info");
    }

    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account("Boo", 2330.89);
        account.printAccount();
    }
}
