import java.util.Scanner;
public class Week {
    public static void main(String[] args) {
        int day_no;
        Scanner sc=new Scanner(System.in);// yesma chai scanner banako
        System.out.print("Enter day in number:");// yesle chai information dinxa yesai hatayo vane ni kei hunna tara programmer lai ali  garo hunxa
        day_no= sc.nextInt();
        if (day_no == 1){//yo ture hune bittikai  aru kei haldaina
            System.out.println("Sunday");
        }
        else if  (day_no == 2)
        {
            System.out.println("Monday");
        }
        else if  (day_no == 3) {
            System.out.println("Tuesday");
        }        else if  (day_no == 4){
            System.out.println("Wednesday");
        }        else if  (day_no == 5){
            System.out.println("Thursday");
        }        else if  (day_no == 6){
            System.out.println("Friday");
        }  else if  (day_no == 7){
            System.out.println("Saturday");
        }       else
        {
        System.out.println("Invalid");
        }
    }
}