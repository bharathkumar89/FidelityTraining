package com.Assignment2;
import java.util.*;

class Account {
    private int accno;
    private String name;
    private double balance;

    public Account(int accno, String name, double initialBalance) {
        this.accno = accno;
        this.name = name;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: Rs. %.2f%n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn: Rs. %.2f%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void checkBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder Name: " + name);
        System.out.printf("Balance: Rs. %.2f%n", balance);
        System.out.println("------------------------------");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account account = new Account(1001, "John Doe", 500.00);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1: Deposit");
            System.out.println("2: Withdraw");
            System.out.println("3: Check Balance");
            System.out.println("4: Display Account Details");
            System.out.println("5: Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
