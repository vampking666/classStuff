import java.util.Random;
import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = 0;

        System.out.println("Type out your question: ");
        scanner.nextLine();

        switch (randomNumber) {
            case 1:
                System.out.println("What?");
                break;
        
            case 2:
                System.out.println("No");
                break;

            default:
                break;
        }
    }
}
