import java.util.Scanner;

public class BankAccount {

    Scanner input = new Scanner(System.in);

    String accountNumber;
    protected double accountBalance;
    private String accountHolderName;

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountHolderName(String accountHolder) {
        this.accountHolderName = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected BankAccount(String accountNumber, double accountBalance, String accountHolderName) {

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;

    }

    // 1 Deposit

    public void deposit(double deposit) {

        accountBalance = accountBalance + deposit;

        System.out.println("Current Balance (RM): " + accountBalance);

    }

    // 2 Withdraw

    public double withdraw(double withdraw) {

        do {
            System.out.println("Account Balance (RM): " + accountBalance);
            System.out.print("Your withdraw amount is excess Account Balance, Please Re-enter amount (RM): ");
            withdraw = input.nextDouble();
            System.out.println();
        } while (withdraw > accountBalance);

        accountBalance = accountBalance - withdraw;

        System.out.println("Current Balance (RM): " + accountBalance);

        return accountBalance;

    }

    // 3 Retrieve Account Number

    public void RetrieveAccountNumber() {
        System.out.println("Account Number: " + accountNumber);

    }

    // 4 Retrieve Account Balance

    public void RetrieveAccountBalance() {
        System.out.println("Account Balance (RM): " + accountBalance);

    }

    // 5 Retrieve Account Holder Name
    public void RetrieveAccountHolderName() {
        System.out.println("Account Holder Name: " + accountHolderName);

    }

    // 6 Display

    public void display() {
        System.out.println("Account Number: " + accountNumber);

        System.out.println("Account Balance: " + accountBalance);

        System.out.println("Account Holder Name: " + accountHolderName);

    }

}
