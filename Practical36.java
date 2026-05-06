class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    public BankAccount() {
        balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}

public class Practical36 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        BankAccount acc = new BankAccount();

        acc.deposit(1000.00);

        try {
            acc.withdraw(400.00);
            acc.withdraw(300.00);
            acc.withdraw(500.00);
        }
        catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}