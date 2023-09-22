import java.util.Scanner;

public class Switchdays {
    public static void main(String[] args) {
        int day;
        Scanner inputScanner= new Scanner(System.in);
        System.out.println("enter the number");
        int userinput= inputScanner.nextInt();
        switch (userinput){
            case 1,7:
                System.out.println("weekend");
                break;
            case 2,3,4,5:
                 System.out.println("weekday");
                 break;
            default:
                System.out.println("invalid input");
                 break;

        }

    }
}
