package JDBC.Bank;

import java.sql.*;
import java.util.Scanner;

public class BankService {
    private Scanner scanner = new Scanner(System.in);

    public void createAccount() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO account(name, balance) VALUES (?, 0)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.executeUpdate();
            System.out.println("Account created.");
        }
    }

    public void deposit() throws SQLException {
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);

            PreparedStatement update = conn.prepareStatement("UPDATE account SET balance = balance + ? WHERE id = ?");
            update.setDouble(1, amount);
            update.setInt(2, id);
            update.executeUpdate();

            PreparedStatement trans = conn.prepareStatement("INSERT INTO transaction(account_id, type, amount) VALUES (?, 'DEPOSIT', ?)");
            trans.setInt(1, id);
            trans.setDouble(2, amount);
            trans.executeUpdate();

            conn.commit();
            System.out.println("Deposit successful.");
        }
    }

    public void withdraw() throws SQLException {
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        try (Connection conn = DBConnection.getConnection()) {
            conn.setAutoCommit(false);

            PreparedStatement check = conn.prepareStatement("SELECT balance FROM account WHERE id = ?");
            check.setInt(1, id);
            ResultSet rs = check.executeQuery();
            if (rs.next() && rs.getDouble("balance") >= amount) {
                PreparedStatement update = conn.prepareStatement("UPDATE account SET balance = balance - ? WHERE id = ?");
                update.setDouble(1, amount);
                update.setInt(2, id);
                update.executeUpdate();

                PreparedStatement trans = conn.prepareStatement("INSERT INTO transaction(account_id, type, amount) VALUES (?, 'WITHDRAW', ?)");
                trans.setInt(1, id);
                trans.setDouble(2, amount);
                trans.executeUpdate();

                conn.commit();
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient balance.");
                conn.rollback();
            }
        }
    }

    public void showTransactions() throws SQLException {
        System.out.print("Enter account ID: ");
        int id = scanner.nextInt();

        try (Connection conn = DBConnection.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM transaction WHERE account_id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            System.out.println("ID | TYPE | AMOUNT | DATE");
            while (rs.next()) {
                System.out.printf("%d | %s | %.2f | %s\n",
                        rs.getInt("id"),
                        rs.getString("type"),
                        rs.getDouble("amount"),
                        rs.getTimestamp("timestamp"));
            }
        }
    }
}
