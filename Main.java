import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount SavingAccount = new SavingAccount("1234", 5000.00, "Jimmy");
        BankAccount CurrentAccount = new CurrentAccount("5678", 5000.00, "Jim");
        int function;

        Scanner input = new Scanner(System.in);

        System.out.println("1: Saving Account");
        System.out.println("2: Current Account");
        System.out.println("3: Exit");
        System.out.print("Please Select your Account: ");

        int accountType = input.nextInt();

        if (accountType == 1) {

             do {
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Retrieve Account Number");
            System.out.println("4: Retrieve Account Balance");
            System.out.println("5: Retrieve holder's name");
            System.out.println("6: Display account information");
            System.out.println("7: Calculate interest");
            System.out.println("8: Exit");

            System.out.print("Please select function: ");

            function = input.nextInt();

           

                if (function == 1) {

                    System.out.print("How Much You want deposit (RM): ");

                    double deposit = input.nextDouble();

                    SavingAccount.deposit(deposit);

                }

                else if (function == 2 && accountType == 1) {

                    System.out.print("How Much You want withdraw (RM): ");

                    double withdraw = input.nextDouble();

                    SavingAccount.withdraw(withdraw);

                } else if (function == 3) {
                    SavingAccount.RetrieveAccountNumber();

                } else if (function == 4) {
                    SavingAccount.RetrieveAccountBalance();

                } else if (function == 5) {
                    SavingAccount.RetrieveAccountHolderName();
                } else if (function == 6) {
                    SavingAccount.display();
                }

                else if (function == 7) {
                    ((SavingAccount) SavingAccount).calInterest();
                }

                // code block to be executed
            } while (function <= 7 && function >= 0);

        }

        else if (accountType == 2) {

            do {

            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Retrieve Account Number");
            System.out.println("4: Retrieve Account Balance");
            System.out.println("5: Retrieve holder's name");
            System.out.println("6: Display account information");
            System.out.println("7: Exit");

            System.out.print("Please select function: ");

            function = input.nextInt();

            if (function == 1) {

                System.out.print("How Much You want deposit (RM): ");

                double deposit = input.nextDouble();

                CurrentAccount.deposit(deposit);

            }

            else if (function == 2) {

                System.out.print("How Much You want withdraw (RM): ");

                double withdraw = input.nextDouble();

                ((CurrentAccount) CurrentAccount).withdraw(withdraw);

            } else if (function == 3) {
                CurrentAccount.RetrieveAccountNumber();

            } else if (function == 4) {
                CurrentAccount.RetrieveAccountBalance();

            } else if (function == 5) {
                CurrentAccount.RetrieveAccountHolderName();
            }

            else if (function == 6) {
                CurrentAccount.display();
            }

                
            } while (function <= 6 && function >= 0);
                  }

    }
}
