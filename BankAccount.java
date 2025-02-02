import java.util.Scanner;
class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else{
            System.out.println("Deposit amount must be positive.");
     }
  }
    public void withdraw(double amount){
        if (amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }else{
            System.out.println("Insufficient balance or invalid amount.");
    }
}
    static class SavingsAccount extends BankAccount{
        public SavingsAccount(int accountNumber, String accountHolder, double initialBalance){
            super(accountNumber, accountHolder, initialBalance);
        }
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
   }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(accNumber, accHolder, initialBalance);
        SavingsAccount savings = new SavingsAccount(accNumber, accHolder, initialBalance);
        savings.displayAccountDetails();
        account.deposit(1000);
        account.withdraw(500);
        System.out.println("Current Balance: " + account.getBalance());
  }
}

