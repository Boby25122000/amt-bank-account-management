// Varification pin means control sysytem.

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000, 4321); //! ----- balance and pin 

        System.out.println("Enter your PIN: ");
        Scanner scanner = new Scanner(System.in);
        int userPin = scanner.nextInt();

        if(!account.verifyPin(userPin)) {
            System.out.println("Invalid PIN! Exiting....");
            scanner.close();
            return;
        }

        ATMMenu menu = new ATMMenu(account);
        menu.displayMenu();
    }
}