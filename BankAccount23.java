class BankAccount {
   
     String accountNumber;
     String accountHolderName;
     double balance;

     void openAccount(String accNo, String Name, double bal) {
         accountNumber = accNo;
         accountHolderName = Name;
         balance = bal;
     }
     
     void deposit(double amount) {
         balance = balance + amount;
     }

     void withdraw(double amount) {
         if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Vrunda Vaghela (250393107016)\n");

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {

    void calculateInterest() {
        double interest = balance * 0.04 / 100;
        System.out.println("Saving Account Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    void maturityAmount(int years) {
        double rate = 0.06;
        double maturity = balance + (balance * rate * years) / 100;
        System.out.println("FD Maturity Amount: " + maturity);
    }
}

class BankAccount23 {

    public static void main(String[] args) {

        SavingAccount s = new SavingAccount();
        s.openAccount("101", "Siya", 10000);
        s.deposit(2000);
        s.withdraw(1000);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount("102", "Tiya", 20000);
        f.deposit(5000);
        f.checkBalance();
        f.maturityAmount(3);
    }
}