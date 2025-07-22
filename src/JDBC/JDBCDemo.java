package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) {


        //step 1

         String url="jdbc:mysql://localhost:3306/javabatch";
         String user="root";
         String password="root";

         //step 2
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Id:-");
        int id=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the name:--");
        String name=scanner.nextLine();

        System.out.println("Enter the rollNo:-");
        int rollNo=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the City:-");
        String city=scanner.nextLine();

        //step 3
        String sql="insert into student(id,name,rollNo,city)values(?,?,?,?)";


          try {
              //step 4
              Class.forName("com.mysql.cj.jdbc.Driver");

              //step 5
              Connection connection= DriverManager.getConnection(url,user,password);

              PreparedStatement preparedStatement=connection.prepareStatement(sql);
              preparedStatement.setInt(1,id);
              preparedStatement.setString(2,name);
              preparedStatement.setInt(3,rollNo);
              preparedStatement.setString(4,city);
              int i= preparedStatement.executeUpdate();
              if(i>0){
                  System.out.println("success");
              }
              else {
                  System.out.println("fail");
              }

              preparedStatement.close();
              connection.close();



          }catch (Exception e){
              System.out.println(e);
          }
          scanner.close();

    }
}
