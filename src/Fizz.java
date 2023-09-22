import java.util.Scanner;

public class Fizz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        if (num%3==0){
            System.out.println("fizz");


        } else if (num%5==0) {
            System.out.println("buzz");


        }
        else if ((num%3==0)&&(num%5==0)){
            System.out.println("fizz buzz");
        }
        else {
            System.out.println("number");
        }


    }
}
// yesma chai no equal to three vayo vane fizz aauxa ani no equal to 5 vayo vane buzz aauxa fizzbuzz ekaichoti aaudaina tesaile arko mulptiple ma chaa..