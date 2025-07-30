package JDBC.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BankService service = new BankService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bank Management Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Transactions");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> service.createAccount();
                case 2 -> service.deposit();
                case 3 -> service.withdraw();
                case 4 -> service.showTransactions();
                case 5 -> System.out.println("Goodbye.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}
