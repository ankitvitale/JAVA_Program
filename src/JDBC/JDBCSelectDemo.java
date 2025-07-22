package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelectDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javabatch";
        String user = "root";
        String password = "root";

        String sql = "SELECT * FROM student ";

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection connection = DriverManager.getConnection(url, user, password);

            // Create statement and execute query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Process result
            System.out.println("ID\tName\tRollNo\tCity");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int rollNo = resultSet.getInt("rollNo");
                String city = resultSet.getString("city");

                System.out.println(id + "\t" + name + "\t" + rollNo + "\t" + city);
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
