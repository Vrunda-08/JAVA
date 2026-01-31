class BankAccount14
{
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal){
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues(){
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args){
        BankAccount14 a1 = new BankAccount14();
        BankAccount14 a2 = new BankAccount14();

        a1.assignValues("A101", "Rahul", 5000);
        a2.assignValues("A102", "Neha", 8000);

        System.out.println("Account 1 Details:");
        a1.displayValues();

        System.out.println("\nAccount 2 Details:");
        a2.displayValues();

        if(a1.accountId.equals("A102")){
            System.out.println("\nSearched Account Found:");
            a1.displayValues();
        }
        else if(a2.accountId.equals("A102")){
            System.out.println("\nSearched Account Found:");
            a2.displayValues();
        }
        else{
            System.out.println("\nAccount not found");
        }
    }
}
