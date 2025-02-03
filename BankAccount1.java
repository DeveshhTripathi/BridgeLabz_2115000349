import java.util.Scanner;
public class BankAccount1{
	private static String bankName = "Bank of Baroda";
	private String accountHolderName;
	private final int accountNumber;
	private static int totalCount=0;

	public BankAccount1(String accountHolderName,int accountNumber){
	this.accountHolderName = accountHolderName;
	this.accountNumber = accountNumber;
	totalCount++;
	}

	public static void getTotalAccounts(){
		System.out.println("The total number of accounts are " +totalCount);
	}
	public void displayAccountDetails(){
        if(this instanceof BankAccount1){
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
	public static void main(String args[]){
	BankAccount1 obj1 = new BankAccount1("abc",54546);
	BankAccount1 obj2 = new BankAccount1("qwe",45484);
	obj1.displayAccountDetails();
	BankAccount1.getTotalAccounts();
	}
}
