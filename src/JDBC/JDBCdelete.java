package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class JDBCdelete {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/javabatch";
        String user="root";
        String password="root";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id");
        int id=sc.nextInt();

        String sql="delete from student where id=?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,user,password);
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            int i=preparedStatement.executeUpdate();
            if(i>0){
                System.out.println("delete Student");
            }else {
                System.out.println("fail");
            }
            connection.close();
            preparedStatement.close();
            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
