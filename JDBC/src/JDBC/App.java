package JDBC;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    private static final String url = "jdbc:mysql://localhost:3306/college";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // try {
        // Connection connection=DriverManager.getConnection(url, username, password);
        // Statement statement=connection.createStatement();
        // String query="SELECT * FROM departments";
        // ResultSet resultSet=statement.executeQuery(query);
        // while(resultSet.next()){
        // System.out.print("Dept_Id :"+resultSet.getInt("dept_id")+" "+"Dept_Name
        // :"+resultSet.getString("dept_name")+" "+"Dept_Address :"+"
        // "+resultSet.getString("dept_address"));
        // System.out.println();
        // }
        // } catch (SQLException e) {
        // e.printStackTrace();
        // }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = String.format("Update Departments Set dept_name='%s' where dept_id=%d","HRM",12);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // preparedStatement.setString(0, "HRM");
            // preparedStatement.setInt(1,12);
            int rowsAffected= preparedStatement.executeUpdate();
            System.out.println(rowsAffected);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
