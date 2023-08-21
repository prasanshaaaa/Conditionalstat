import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int num;
        int userinput;
        System.out.println("enter number");
        Scanner sc= new Scanner(System.in);
        userinput=sc.nextInt();
       if (userinput%3==0){
           System.out.println("yes");
       }


    }
}
