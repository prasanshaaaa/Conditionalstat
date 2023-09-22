import java.util.Scanner;
    public class Simplelogin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String validUsername = "Prasansha";
            String validPassword = "0000";
            System.out.print("Enter  your username: ");
            String username = scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("You successfully login.THANK YOU");
            } else {
                System.out.println("Invalid username or password. Sorry please check your username or password");
            }
        }
    }

