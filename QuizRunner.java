import java.sql.*;
import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("       WELCOME TO JAVA QUIZ SYSTEM        ");
        System.out.println("==========================================");

        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM questions");

            int score = 0;
            int qCount = 1;

            while (rs.next()) {
                System.out.println("\nQuestion " + qCount + ": " + rs.getString("question_text"));
                System.out.println("------------------------------------------");
                System.out.println(" [A] " + rs.getString("optionA"));
                System.out.println(" [B] " + rs.getString("optionB"));
                System.out.println(" [C] " + rs.getString("optionC"));
                System.out.println(" [D] " + rs.getString("optionD"));
                System.out.println("------------------------------------------");
                
                System.out.print("Enter your answer (A/B/C/D): ");
                String userAnswer = sc.next().toUpperCase();
                
                String selectedOptionText = "";
                if(userAnswer.equals("A")) selectedOptionText = rs.getString("optionA");
                else if(userAnswer.equals("B")) selectedOptionText = rs.getString("optionB");
                else if(userAnswer.equals("C")) selectedOptionText = rs.getString("optionC");
                else if(userAnswer.equals("D")) selectedOptionText = rs.getString("optionD");
                
                if(selectedOptionText.equals(rs.getString("correct_answer"))) {
                    System.out.println(" >> Correct");
                    score++;
                } else {
                    System.out.println(" >> Wrong! Correct answer was: " + rs.getString("correct_answer"));
                }
                qCount++;
            }
            
            
            System.out.println("\n==========================================");
            System.out.println("           QUIZ COMPLETED!                ");
            System.out.println("           YOUR SCORE: " + score + "/10         ");
            System.out.println("==========================================");
            
            conn.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}