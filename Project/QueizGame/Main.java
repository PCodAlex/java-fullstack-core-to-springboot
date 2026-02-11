
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Verify your role in the game");
        System.out.println("----------------------------");
        System.out.println("type A for admin or type U for user :");
        String ch=input.next();
        System.out.println("-------------------------------------");
        switch (ch) {
            case "U", "u" -> {
                QuestionService qs=new QuestionService();
                qs.Questioning();
            }
            case "A", "a" -> System.out.println("Welcome to the game Admin sir!");
            default -> System.out.println("---Verification Failed---");
        }
        
    }
}