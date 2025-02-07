class BankAccount{
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayInfo(){
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountType(){
        System.out.println("Account Type: Savings Account, Interest Rate: " + interestRate);
  }
}
class CheckingAccount extends BankAccount{
    private double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountType(){
        System.out.println("Account Type: Checking Account, Withdrawal Limit: $" + withdrawalLimit);
  }
}
class FixedDepositAccount extends BankAccount{
    private int depositTerm;
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm){
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
  }
    public void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account, Deposit Term: " + depositTerm + " months");
  }
}
public class BankInheritance8{
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.00, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.00, 1000.00);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.00, 12);
        savings.displayInfo();
        savings.displayAccountType();
        checking.displayInfo();
        checking.displayAccountType();
        fixedDeposit.displayInfo();
        fixedDeposit.displayAccountType();
  }
}
