import java.util.Scanner;

public class Greaterelseif {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        System.out.println("enter the number");
        b=sc.nextInt();
        if (a>b){
            System.out.println("a is greater");
        } else if (a==b) {
            System.out.println("both are equal");

        }
        else {
            System.out.println("b is greater");
            }

    }
}
// wap to create a result generator
// wap to create a biling system take only 1 item