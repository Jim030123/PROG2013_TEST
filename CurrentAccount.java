
public class CurrentAccount extends BankAccount {

    protected CurrentAccount(String accountNumber, double accountBalance, String accountHolderName) {
        super(accountNumber, accountBalance, accountHolderName);
        
    }

    private double overDraftLimit = -5000;
    private double overDraftRate = 0.03;

    public double withdraw(double withdraw) {

        double overdraft = accountBalance - withdraw;
        
            accountBalance = overdraft;

        if (overdraft <= 0 && overdraft >= overDraftLimit) {

            double overdraftCharge = overdraft * overDraftRate;

            System.out.println("The overdraft charge (3%): " + -overdraftCharge);

            overDraftLimit = overDraftLimit - overdraft - overdraftCharge;

            System.out.println("Account Balance (RM): " + accountBalance);

            System.out.println("Overdraft Balance (RM): " + -overDraftLimit);

            return accountBalance;

        } else {

            System.out.println("Account Balance (RM): " + accountBalance);

            return accountBalance;
        }

    }

}
