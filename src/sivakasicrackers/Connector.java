import java.sql.*;

public class Connector {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set up the database connection parameters
            String url = "jdbc:mysql://localhost:3306/summa?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "justin";
            String password = "justinpassword";
            // Connect to the database
            
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connected to the database!");

            // Do something with the database connection here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CRACKERS_TABLE");
            while(resultSet.next()){
                int sno = resultSet.getInt("SNO");
                String name = resultSet.getString("NAME");
                int price = resultSet.getInt("PRICE");
                int quantity = resultSet.getInt("QUANTITY");
                
            }
            // Close the database connection
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
