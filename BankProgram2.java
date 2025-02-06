import java.util.ArrayList;
class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
  }
    public void openAccount(Customer customer, double initialDeposit){
        BankAccount account = new BankAccount(this, initialDeposit);
        customer.addAccount(account);
        customers.add(customer);
    }
    public String getName(){
        return name;
  }
}
class Customer{
    private String name;
    private ArrayList<BankAccount> accounts;
    public Customer(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
  }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }
    public void viewBalance(){
        System.out.println("Customer: " + name);
        for (BankAccount account : accounts){
            System.out.println("Bank: " + account.getBank().getName() + ", Balance: " + account.getBalance());
     }
  }
}
class BankAccount{
    private Bank bank;
    private double balance;
    public BankAccount(Bank bank, double initialDeposit){
        this.bank = bank;
        this.balance = initialDeposit;
   }
    public Bank getBank(){
        return bank;
  }
    public double getBalance(){
        return balance;
    }
}
public class BankProgram2{
    public static void main(String[] args) {
        Bank bank1 = new Bank("National Bank");
        Customer customer1 = new Customer("Shiva");        
        bank1.openAccount(customer1, 1000.0);
        customer1.viewBalance();
    }
}
