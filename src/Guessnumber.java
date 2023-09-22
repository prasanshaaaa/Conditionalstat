import java.util.Random;
import java.util.Scanner;
    public class Guessnumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int  targetNumber = random.nextInt(150) + 1;
            while (true) {
                System.out.print("Enter number (1-150): ");
                int guess = scanner.nextInt();
                if (guess == targetNumber) {
                    System.out.println(" You guessed the number.");
                }
                else
                {
                    System.out.println("Try Again");
                }
            }
        }
    }

