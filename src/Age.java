import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int myage=17;
        int userinput;
        System.out.println("enter age");
        Scanner sc=new Scanner(System.in);
        userinput= sc.nextInt();

        if (userinput==myage){
            System.out.println("hello");
        }

    }
}
