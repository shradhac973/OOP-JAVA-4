package lab_sheet_4;

// Change a private bank balance only through a validated deposit method.
// Sample output:
// Deposit successful.
// Balance: 750.0
// Deposit amount must be positive.
class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Question07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        account.deposit(250.0);
        account.displayBalance();
        account.deposit(-10.0);
    }
}