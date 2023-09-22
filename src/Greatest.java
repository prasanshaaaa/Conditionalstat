import java.util.Scanner;
    public class Greatest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();
            int greater = num1;
            if (num2 > greater)
            {
                greater = num2;
            }
            if (num3 > greater)
            {
                greater = num3;
            }
            System.out.println("The greatest number is: " + greater);
        }
    }

