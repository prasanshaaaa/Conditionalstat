import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        age= sc.nextInt();
        if (age>=18){
            System.out.println("Allowed to vote");
        }
        else {
            System.out.println("not allowed to vote");
        }

    }
}
