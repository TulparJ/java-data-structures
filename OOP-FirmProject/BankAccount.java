package oop;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }

    public void showBalance() {
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Tulpar", 150);

        acc.showBalance();
        acc.deposit(100);
        acc.withdraw(50);
        acc.withdraw(500);  // should fail
        acc.showBalance();
    }
}
