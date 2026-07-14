public class BankAccountDepositWithdrawal {
    public static void main(String[] args) {
        System.out.println("=== Bank Account Deposit & Withdrawal Demo ===");
        BankAccount acc = new BankAccount("AC1001", "John Doe", 1000.0);
        acc.displayBalance();

        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.withdraw(2000.0); // Insufficient balance test
        acc.displayBalance();
    }
}

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f | New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.printf("Withdrawal Failed: Insufficient funds to withdraw $%.2f! Current Balance: $%.2f%n", amount, balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.printf("Withdrawn: $%.2f | New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayBalance() {
        System.out.printf("Account [%s - %s] Balance: $%.2f%n", accountNumber, accountHolder, balance);
    }
}
