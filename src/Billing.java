import java.sql.SQLOutput;
        import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        int colddrink=100;
        int icecream=200;
        int momo=350;
        int pizza=400;
        int total=0,item=0,order=0,items,total_items;
        Scanner scan=new Scanner(System.in);
        System.out.println("How many Items? ");
        items= scan.nextInt();
        total_items=items;
        while (items!=0) {
            System.out.println("What do you like to order? ");
            System.out.println("1. Cold drink");
            System.out.println("2. Ice Cream");
            System.out.println("3. Momo");
            System.out.println("4. Pizza");
            System.out.println("Item Number: ");
            item= scan.nextInt();



            if (item==1){
                order=colddrink;
            }
            else if (item==2){
                order=icecream;
            }
            else if (item==3){
                order=momo;
            }
            else if (item==4){
                order=pizza;
            }
            else{
                System.out.println("Item Not Found !");
                break;
            }
            System.out.println("Enter Quantity: ");
            int qty= scan.nextInt();
            total=total+(order*qty);
            items=items-1;
        }
        System.out.println("******Your Bill******");
        System.out.println("No of Items:"+total_items);
        System.out.println("Total Price:"+total);

    }
}