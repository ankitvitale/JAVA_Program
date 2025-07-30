package JDBC;

import java.sql.*;

public class JDBCSelect {
    public static void main(String[] args)  {

        String url = "jdbc:mysql://localhost:3306/javabatch";
        String user = "root";
        String password = "root";

        String sql="select * from student";
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, user, password);


    // get data from table that why i can used Statemet
    Statement statement = connection.createStatement();
    //show data from database that why i can used ResultSet
    ResultSet resultSet = statement.executeQuery(sql);

    System.out.println("+-----+------+---------+---------+");
    System.out.println("|  ID | Name | RollNo  |  City    ");
    System.out.println("+--------------------------------+");
    while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        int rollno = resultSet.getInt("rollNo");
        String city = resultSet.getString("city");

        System.out.printf("| %-3d | %-6s | %-6d | %-8s |\n", id, name, rollno, city);

    }
    System.out.println("-------------------------------");
    resultSet.close();
    statement.close();
    connection.close();
    }catch(Exception e){
        e.printStackTrace();
    }
}

}
