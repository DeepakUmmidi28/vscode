package JDBC;
import java.sql.*;
public class Main {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String username="root";
    private static final String password="root";
    public static void main(String[] args) {
        try {
            Class.forN ame("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection connection=DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            String query="select * from departments";
            ResultSet resultset=statement.executeQuery(query);
            while (resultset.next()) {
                int dept_id=resultset.getInt("Dept_Id");
                String dept_name=resultset.getString("Dept_name");
                String dept_address=resultset.getString("Dept_address");
                System.out.println("Department ID: "+dept_id);
                System.out.println("Department Name: "+dept_name);
                System.out.println("Department Address: "+dept_address);
                System.out.println();
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
