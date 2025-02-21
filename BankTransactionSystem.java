import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient balance!");
 }
}
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
  }
  public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException{
        if(amount<0){
            throw new IllegalArgumentException("Invalid amount!");
  }
        if(amount > balance){
            throw new InsufficientBalanceException();
   }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
  }
}
public class BankTransactionSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        try{
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        }catch(InsufficientBalanceException | IllegalArgumentException e){
            System.out.println(e.getMessage());
  }
 }
}

