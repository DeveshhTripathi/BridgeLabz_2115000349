import java.util.Queue;
import java.util.*;
class Banking{
    private Map<Integer, Double> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();
    public void createAccount(int accountNumber, double initialBalance){
        accounts.put(accountNumber, initialBalance);
 }
    public void deposit(int accountNumber, double amount){
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }
    public void requestWithdrawal(int accountNumber){
        if(accounts.containsKey(accountNumber)){
            withdrawalQueue.offer(accountNumber);
        }else{
            System.out.println("Account not found!");
    }
}
    public void processWithdrawals(double amount){
        while (!withdrawalQueue.isEmpty()){
            int accountNumber = withdrawalQueue.poll();
            if (accounts.get(accountNumber) >= amount) {
                accounts.put(accountNumber, accounts.get(accountNumber) - amount);
                System.out.println("Withdrawal of " + amount + " from Account " + accountNumber + " processed.");
         }else{
            System.out.println("Insufficient balance in Account " + accountNumber + "!");
    }
   }
}
    public void displayBalances(){
        System.out.println("Account Balances:");
        for(Map.Entry<Integer, Double> entry : accounts.entrySet()){
            System.out.println("Account " + entry.getKey() + ": " + entry.getValue());
   }
 }
    public void displaySortedAccounts(){
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for(Map.Entry<Integer, Double> entry : accounts.entrySet()){
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts Sorted by Balance:");
        for(Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()){
            System.out.println("Account " + entry.getValue() + ": " + entry.getKey());
   }
  }
}
public class BankingSystem{
    public static void main(String[] args){
        Banking bank = new Banking();
        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 7000);
        bank.deposit(101, 1000);
        bank.deposit(102, 500);
        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(103);
        bank.displayBalances();
        System.out.println();
        bank.processWithdrawals(2000);
        System.out.println();
        bank.displayBalances();
        System.out.println();
        bank.displaySortedAccounts();
    }
}
