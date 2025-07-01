class BankAccount {
    private int balance;

    public void Deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }

    }

    public void WithDrawn(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

}

public class Encapsulation {
    public static void main(String1[] args) {
        BankAccount account = new BankAccount();
        account.Deposit(1200000);
        account.WithDrawn(5000);
        // account.balance = 100000000; private variable cannot be accessed directly
        // System.out.println("Balance: " + account.balance); // This line would cause
        // an error
        // Instead, we can use methods to interact with the balance
    }
}