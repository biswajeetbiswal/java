class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private static final double MINIMUM_BALANCE = 1000.0;
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < MINIMUM_BALANCE) {
            throw new IllegalArgumentException("Initial balance cannot be less than the minimum balance.");
        }
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to be deposited must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount to be withdrawn must be greater than zero.");
        }
        if (balance - amount < MINIMUM_BALANCE) {
            throw new InsufficientFundException("Withdrawal not allowed. Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(5000.0);
            account.deposit(2000.0);
            account.withdraw(3000.0);
            account.withdraw(5000.0); // This will raise InsufficientFundException
        } catch (IllegalArgumentException | InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}