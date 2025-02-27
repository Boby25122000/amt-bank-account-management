// Display to menu for choice option.

import java.util.Scanner;

public class ATMMenu {
    private Scanner scanner;
    private BankAccount account;

    public ATMMenu(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    //! ----- Display menu for use AMT ----- 
    public void displayMenu() {
        while (true) {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.showTransactionHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM.");
                    scanner.close();
                    System.exit(0);
                    System.out.println("Invalid choice! Try again.");
                default:
                    throw new AssertionError();
            }
        }
    }
}