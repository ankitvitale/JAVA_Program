package JDBC;

import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {
    static final String URL = "jdbc:mysql://localhost:3306/javabatch";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            while (true) {
                System.out.println("\n=== Student CRUD Menu ===");
                System.out.println("1. Create Student");
                System.out.println("2. Read All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Choose option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Roll No: ");
                        int rollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter City: ");
                        String city = scanner.nextLine();

                        String insertSQL = "INSERT INTO student (id, name, rollNo, city) VALUES (?, ?, ?, ?)";
                        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
                        insertStmt.setInt(1, id);
                        insertStmt.setString(2, name);
                        insertStmt.setInt(3, rollNo);
                        insertStmt.setString(4, city);
                        int inserted = insertStmt.executeUpdate();
                        System.out.println(inserted > 0 ? "Student added." : "Insert failed.");
                        insertStmt.close();
                        break;

                    case 2:
                        String selectSQL = "SELECT * FROM student";
                        Statement selectStmt = conn.createStatement();
                        ResultSet rs = selectStmt.executeQuery(selectSQL);
                        System.out.println("ID\tName\tRollNo\tCity");
                        while (rs.next()) {
                            System.out.println(
                                rs.getInt("id") + "\t" +
                                rs.getString("name") + "\t" +
                                rs.getInt("rollNo") + "\t" +
                                rs.getString("city")
                            );
                        }
                        rs.close();
                        selectStmt.close();
                        break;

                    case 3:
                        System.out.print("Enter ID to Update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter New Roll No: ");
                        int newRollNo = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New City: ");
                        String newCity = scanner.nextLine();

                        String updateSQL = "UPDATE student SET name=?, rollNo=?, city=? WHERE id=?";
                        PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
                        updateStmt.setString(1, newName);
                        updateStmt.setInt(2, newRollNo);
                        updateStmt.setString(3, newCity);
                        updateStmt.setInt(4, updateId);
                        int updated = updateStmt.executeUpdate();
                        System.out.println(updated > 0 ? "Student updated." : "Update failed.");
                        updateStmt.close();
                        break;

                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        int deleteId = scanner.nextInt();

                        String deleteSQL = "DELETE FROM student WHERE id=?";
                        PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
                        deleteStmt.setInt(1, deleteId);
                        int deleted = deleteStmt.executeUpdate();
                        System.out.println(deleted > 0 ? "Student deleted." : "Delete failed.");
                        deleteStmt.close();
                        break;

                    case 5:
                        conn.close();
                        System.out.println("Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
