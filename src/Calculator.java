import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double number1,number2;
        Scanner scan=new Scanner(System.in);
        System.out.println(" ");
        System.out.print ("Enter Operation (+,-,*,/): ");
        String operation=scan.next();
        System.out.print("Enter First Number: ");
        double Firstnumber=scan.nextDouble();
        System.out.print("Enter Second Number: ");
        double Secondnumber=scan.nextDouble();
        double greatest = Math.max(Firstnumber, Secondnumber);
        if (greatest==Firstnumber){
            number1=Firstnumber;
            number2=Secondnumber;
        }
        else if (greatest==Secondnumber)
        {
            number2=Firstnumber;
            number1=Secondnumber;
        }
        else{
            number1=Firstnumber;
            number2=Secondnumber;
        }
        if (operation.equals("+")){
            System.out.println("The sum is:"+(Firstnumber+Secondnumber));
        }
        else    if (operation.equals("-")){
            System.out.println("The difference is:"+(number1-number2));
        } else    if (operation.equals("*")){
            System.out.println("The result is:"+(number1*number2));
        } else    if (operation.equals("/")){
            System.out.println("The division is:"+(number1/number2));
        }        else{
            System.out.println("Operation Not Found");
        }
    }
}


