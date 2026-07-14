public class PaymentSystemPolymorphism {
    public static void main(String[] args) {
        System.out.println("=== Payment System Supporting UPI, Card, and Cash (Polymorphism) ===");
        PaymentMethod[] payments = {
            new UpiPayment("user@okaxis", 450.00),
            new CardPayment("4532-XXXX-XXXX-8901", "Alice Smith", 1250.50),
            new CashPayment(80.00)
        };

        for (PaymentMethod pm : payments) {
            pm.processPayment(); // Runtime Polymorphism
            pm.generateReceipt();
            System.out.println("----------------------------------------");
        }
    }
}

abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();

    public void generateReceipt() {
        System.out.printf("Receipt: Payment of $%.2f completed successfully.%n", amount);
    }
}

class UpiPayment extends PaymentMethod {
    private String upiId;

    public UpiPayment(String upiId, double amount) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        System.out.printf("[UPI Payment] Connecting to UPI server for ID: %s... Processed $%.2f%n", upiId, amount);
    }
}

class CardPayment extends PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CardPayment(String cardNumber, String cardHolder, double amount) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        System.out.printf("[Card Payment] Authenticating Card %s (%s)... Charged $%.2f%n", cardNumber, cardHolder, amount);
    }
}

class CashPayment extends PaymentMethod {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.printf("[Cash Payment] Received physical cash of $%.2f at counter.%n", amount);
    }
}
