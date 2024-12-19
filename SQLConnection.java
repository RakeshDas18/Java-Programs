import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLConnection{

    private static final String URL = "jdbc:mysql://localhost:3306/students";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch(Exception e){
                System.out.println(e);
            }
            // Step 1: Establish a connection to the 
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Step 2: Create a statement object to execute SQL queries
            statement = connection.createStatement();

            // Step 3: Execute a simple SQL quSery to retrieve all records from the 'users' table
            String sql = "SELECT * FROM Employee";
            resultSet = statement.executeQuery(sql);

            // Step 4: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                // Print the user data to the console
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            // Handle SQL exceptions (e.g., connection issues, query errors)
            System.out.println("SQL Error: " + e.getMessage());
        } finally {
            // Step 5: Close the resources to avoid memory leaks
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
