abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    protected double balance;
    public BankAccount(String accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
  }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }else{
            System.out.println("Invalid deposit amount.");
      }
 }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else{
            System.out.println("Invalid or insufficient balance.");
      }
 }
    public abstract void calculateInterest();
    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
  }
}
class SavingsAccount extends BankAccount{
    private double interestRate = 0.07; // 7% annual interest
    public SavingsAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }
    public void calculateInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
   }
}
class CurrentAccount extends BankAccount{
    private double interestRate = 0.02; // 2% annual interest
    public CurrentAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
   }
    public void calculateInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
   }
}

interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
class LoanAccount extends BankAccount implements Loanable{
    private double loanAmount;
    private boolean loanApproved;

    public LoanAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }
    public void applyForLoan(double amount){
        if (calculateLoanEligibility()){
            loanAmount = amount;
            loanApproved = true;
            System.out.println("Loan approved for: " + amount);
        } else {
            System.out.println("Loan not approved.");
        }
    }
    public boolean calculateLoanEligibility(){
        return balance > 5000;
    }
    public void calculateInterest(){
        System.out.println("Loan accounts do not have savings interest.");
    }
}
public class BankingSystemAbstraction4{
    public static void main(String[] args){
        BankAccount savings = new SavingsAccount("321", "John", 10000);
        savings.deposit(2000);
        savings.calculateInterest();
        savings.displayDetails();
        BankAccount current = new CurrentAccount("456", "Rahul", 5000);
        current.withdraw(1000);
        current.calculateInterest();
        current.displayDetails();
        LoanAccount loanAccount = new LoanAccount("123", "Rohan", 6000);
        loanAccount.applyForLoan(10000);
        loanAccount.displayDetails();
  }
}
