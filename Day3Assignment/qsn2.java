import java.util.Scanner;

class Account {
    int accno;
    String name;
    double balance;

    Account(int accno, String name, double balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void display() {
        System.out.println("Account No: " + accno + ", Name: " + name + ", Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Account customer = new Account(123456, "John Doe", 10000.00);
        customer.display();

        customer.deposit(5000);
        customer.checkBalance();

        customer.withdraw(3000);
        customer.checkBalance();

        customer.display();
    }
}
