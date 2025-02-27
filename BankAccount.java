// Related to account operation like balance check, deposit, withdrawal, and transaction history.

import java.util.ArrayList;

public class BankAccount {
    private double balanace;
    private int pin;
    private ArrayList<String> transactionHistory = new ArrayList<>();

    public BankAccount(double balanace, int pin) {
        this.balanace=balanace;
        this.pin=pin;
    }

    public boolean verifyPin(int userPin) {
        return this.pin == userPin;
    }

    //! ----- checkbalance ----- 
    public void checkBalance() {
        System.out.println("Your balance is: Rs."+balanace);
    }

    //! ----- deposit ----- 
    public void deposit(double amount) {
        if(amount > 0) {
            balanace += amount;
            transactionHistory.add("Deposited: Rs."+amount);
            System.out.println("Deposited: Rs."+amount);
            System.out.println("Invalid deposit amount");
        }
    }

    //! ----- withdraw ----- 
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balanace) {
            balanace -= amount;
            transactionHistory.add("Withdrawn: Rs."+amount);
            System.out.println("Withdrawn: Rs."+amount);
            System.out.println("Insufficient balance");
        }
    }

    //! ----- showTransactionHistory ----- 
    public void showTransactionHistory() {
        if(transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        }
        else {
            System.out.println("Transaction History.");
            for(String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}