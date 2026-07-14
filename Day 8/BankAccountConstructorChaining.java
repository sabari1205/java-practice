public class BankAccountConstructorChaining {
    public static void main(String[] args) {
        System.out.println("=== BankAccount Constructor Chaining Demo ===");
        
        System.out.println("1. Opening account with no initial deposit (Default 0.0):");
        ChainedAccount acc1 = new ChainedAccount("ACC-101", "Alice");
        acc1.display();

        System.out.println("\n2. Opening account with custom initial deposit:");
        ChainedAccount acc2 = new ChainedAccount("ACC-102", "Bob", 2500.0);
        acc2.display();

        System.out.println("\n3. Opening VIP account with custom deposit and branch code:");
        ChainedAccount acc3 = new ChainedAccount("ACC-103", "Charlie", 10000.0, "NY-BR-01");
        acc3.display();
    }
}

class ChainedAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String branchCode;

    // 2-arg constructor chaining to 3-arg constructor
    public ChainedAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0);
        System.out.println(" -> [2-Arg Constructor Chained]");
    }

    // 3-arg constructor chaining to 4-arg master constructor
    public ChainedAccount(String accountNumber, String holderName, double initialDeposit) {
        this(accountNumber, holderName, initialDeposit, "GEN-BR-00");
        System.out.println(" -> [3-Arg Constructor Chained]");
    }

    // Master constructor where fields are initialized
    public ChainedAccount(String accountNumber, String holderName, double initialDeposit, String branchCode) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialDeposit;
        this.branchCode = branchCode;
        System.out.println(" -> [4-Arg Master Constructor Executed]");
    }

    public void display() {
        System.out.printf("Account [%s] Holder: %-8s | Balance: $%-8.2f | Branch: %s%n", accountNumber, holderName, balance, branchCode);
    }
}
