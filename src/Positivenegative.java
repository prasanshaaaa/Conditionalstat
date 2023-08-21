import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        num= sc.nextInt();
        if (num>0){
            System.out.println("the number is positive");
        }
        else {
            System.out.println("the number is negative");
        }

    }
}
