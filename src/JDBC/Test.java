package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
    public static void main(String[] args)throws Exception {
      Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "root");
        PreparedStatement ps=connection.prepareStatement("insert into user values('4','payal@gmail.com','payal punikar')");
         int i= ps.executeUpdate();
         if(i>0){
             System.out.println("success");
         }
         else {
             System.out.println("fail");
         }


    }
}
