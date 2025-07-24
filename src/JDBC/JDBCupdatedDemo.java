package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCupdatedDemo {

    public static final String URL = "jdbc:mysql://localhost:3306/javabatch";
    public static final String USER = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //step 1
//        String url = "jdbc:mysql://localhost:3306/javabatch";
//        String user = "root";
//        String password = "root";


        while (true) {

            //step2
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enthe the update ID");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the name");
            String name = scanner.nextLine();

            System.out.println("Enter the rollNo");
            int rollno = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the city");
            String city = scanner.nextLine();

            //step 3
            String sql = "update student set name=?,rollno=?,city=? where id=?";

            //step 4

            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 5
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, rollno);
            preparedStatement.setString(3, city);
            preparedStatement.setInt(4, id);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println(" student update....!");
            } else {
                System.out.println("Student Id is Not found.");
            }
            preparedStatement.close();
            connection.close();
            //scanner.close();


        }
    }
}