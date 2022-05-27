package bank;

public abstract class BankAccount {

    // Code W3-1
    protected double balance;
    protected String accountId;
    protected Customer accountOwner;

    public void open(double initialBalance){}

    public double deposit(double amount) {
        return amount;
    }

    public double withdraw(double amount) {
        return 0;
    }
}
