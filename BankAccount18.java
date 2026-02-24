class BankAccount18 {

    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount18(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    void calculateInterest() {
        double interest = balance * interest_rate / 100;
        System.out.println("Interest Earned by " + account_holder_name + ": " + interest);
    }

    void display() {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate + "%");
    }

    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
        System.out.println("Interest Rate Updated to: " + interest_rate + "%");
    }

    public static void main(String[] args) {

        BankAccount18 a1 = new BankAccount18("Vaani", 10000);
        BankAccount18 a2 = new BankAccount18("Tirtha", 20000);

        a1.display();
        a1.calculateInterest();

        System.out.println();

        a2.display();
        a2.calculateInterest();

        System.out.println("\nUpdating Interest Rate...\n");

        BankAccount18.updateInterestRate(7.0);

        a1.calculateInterest();
        a2.calculateInterest();
    }
}