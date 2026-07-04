import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Quiz Application Starting...");

        // DatabaseConnection क्लास को कॉल करना
        Connection conn = DatabaseConnection.getConnection();

        if (conn != null) {
            System.out.println("System is ready to load questions!");
            // यहाँ हम बाद में Quiz का Logic जोड़ेंगे
        } else {
            System.out.println("System failed to start due to database connection error.");
        }
    }
}