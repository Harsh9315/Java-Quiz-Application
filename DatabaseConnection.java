import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            
           Class.forName("com.mysql.jdbc.Driver");
            
           
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_db", "root", "Harsh@123");
            
            System.out.println("Connection Successful!");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        
        getConnection();
    }
}