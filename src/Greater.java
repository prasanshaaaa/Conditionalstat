import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        a= sc.nextInt();
        System.out.println("enter number");
        b= sc.nextInt();
        if (a>b){
            System.out.println(" a is greater");

        }
        else {
            System.out.println("b is greater");
        }

    }
}
