import java.util.Scanner;

public class ATMSimulation {

    // Class to represent the ATM and its functionality
    static class ATM {
        private double balance;

        // Constructor to initialize balance
        public ATM(double balance) {
            this.balance = balance;
        }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid amount.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Invalid amount.");
            }
        }

        // Method to check balance
        public void checkBalance() {
            System.out.println("Current balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000.00); // Initial balance set to $1000.00

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
