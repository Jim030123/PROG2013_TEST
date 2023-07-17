
public class SavingAccount extends BankAccount {

    protected SavingAccount(String accountNumber, double accountBalance, String accountHolderName) {
        super(accountNumber, accountBalance, accountHolderName);

    }

    private double interestRate = 0.05;
    public double interestAmount;

    public void calInterest() {

        interestAmount = accountBalance * interestRate;
        accountBalance = accountBalance * (1 + interestRate);

        System.out.println("Interest Amount (5%) (RM): " + interestAmount);
        System.out.println("Current Amount (RM): " + accountBalance);

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}