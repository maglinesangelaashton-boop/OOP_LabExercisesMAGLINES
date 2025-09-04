import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

public class BankSystem {
    private Map<String, BankAccount> accounts;
    private Scanner scanner;

    public BankSystem() {
        this.accounts = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        accounts.put(accountNumber, new BankAccount(accountNumber, initialBalance));
        System.out.println("Account created successfully");
    }

    public void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        if (accounts.containsKey(accountNumber)) {
            accounts.get(accountNumber).deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        if (accounts.containsKey(accountNumber)) {
            accounts.get(accountNumber).withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        if (accounts.containsKey(accountNumber)) {
            accounts.get(accountNumber).checkBalance();
        } else {
            System.out.println("Account not found");
        }
    }

    public void run() {
        while (true) {
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();
        bankSystem.run();
    }
}
        