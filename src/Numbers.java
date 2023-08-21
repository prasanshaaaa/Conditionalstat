import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num;
        int userinput;
        System.out.println("Enter number");
        Scanner sc= new Scanner(System.in);
        userinput= sc.nextInt();
        if (userinput%2==0){
            System.out.println("yes");
        }

    }
}
