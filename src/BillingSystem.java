import java.util.Scanner;
public class BillingSystem {
    public static void main(String[] args) {
        int order,quantity;
        double total=0;
        String food="" ;
        String descisoin;
        Scanner obj=new Scanner(System.in);
        String name_of_resutrant="Khatra Resturant";
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t" +
                "Welcome To Khatra Resturant");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"MENU\n");
        System.out.println("Dishes\t\t\t\t\t\t\t\t Rate");
        System.out.println("1)pizza\t\t\t\t\t\t Rs 150");
        System.out.println("2)burger\t\t\t\t\t\t\t Rs 100");
        System.out.println("3)veg momo\t\t Rs 450");
        System.out.println("4)chicken momo\t\t\t Rs 350");
        System.out.println("5)chowmein\t\t\t\t\t Rs 155");
        System.out.println("6)spring roll\t\t\t\t\t\t Rs 150");
        System.out.println("7)Sandwitch\t\t\t\t\t\t Rs 450");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t Press the number");
        order=obj.nextInt();
        if (order==1){
            System.out.println("Please provide quality.");
            food="pizza";
        } else if (order==2) {
            food="burger";
            System.out.println("Please provide quality.");
        } else if (order==3) {
            food="burger";
            System.out.println("Please provide quality.");
        } else if (order==4) {
            food="veg momo";
            System.out.println("Please provide quantity");
        } else if (order==5) {
            food="chicken momo";
            System.out.println("Please provide quantity");
        } else if (order==6) {
            food="chowmein";
            System.out.println("Please provide quantity");
        } else if (order==7) {
            food="spring roll";
            System.out.println("Please provide quantity");
        }
        else {
            System.out.println("Invalid Input");
        }
        quantity=obj.nextInt();

        System.out.println("For Confirmation. Your orders are:"+quantity+" "+food);
        System.out.println("Press Y for Yes and N for No ");
        descisoin=obj.next();
        if (descisoin.equals("Y") || descisoin.equals("y")){
            System.out.println("Thank You.");
        }
        else {
            System.out.println("Run Program Again");
        }
        System.out.println("Visit again. Thank you");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"BILL\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\tOrders\t\t\t\t\t\t\t\t Quantity\t\t\t\t\t\t Rate\t\t\t\t\tTotal");
        if (food.equals("pizza")){
            total=(150*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tpizza"+"\t\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 150"+"\t\t\t\t\t "+total);
        }
        else if (food.equals("burger")){
            total=(100*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tburger"+"\t\t\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 100"+"\t\t\t\t\t "+total);
        }
        else if (food.equals("veg momo")){
            total=(450*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tveg momo"+"\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 450"+"\t\t\t\t\t "+total);
        }
        else if (food.equals("chicken momo")){
            total=(350*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tVEG chicken momo"+"\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 350"+"\t\t\t\t\t "+total);
        }
        else if (food.equals("chowmein")){
            total=(150*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tchowmein"+"\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 150"+"\t\t\t\t\t "+total);
        }
        else if (food.equals("spring roll")){
            total=(150*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tspring roll"+"\t\t\t\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 150"+"\t\t\t\t\t "+ total);
        }
        else if (food.equals("sandwitch")){
            total =(250*quantity);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tsandwitch"+"\t\t\t\t\t\t\t\t\t"+quantity+"\t\t\t\t\t\t\t 250"+"\t\t\t\t\t "+ total);
        }
        System.out.println("VAT:13%");
        System.out.println("Discount: 10%");

        double gtotal=total-(total*0.1);
        gtotal=gtotal+(gtotal*0.13);
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"
                +"Grand Total: "+gtotal);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLEASE VISIT AGAIN");
    }
}
