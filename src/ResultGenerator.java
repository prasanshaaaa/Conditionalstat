import java.util.Scanner;

    public class ResultGenerator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int maths, physics,computer, chemistry;

            System.out.println("Enter marks for Physics: ");
             physics= sc.nextInt();

            System.out.println("Enter marks for Chemistry: ");
            chemistry= sc.nextInt();

            System.out.println("Enter marks for Computer: ");
            computer=sc.nextInt();

            System.out.println("Enter marks for Maths: ");
            maths=sc.nextInt();

            int totalMarks = physics + chemistry + computer + maths;
            double totalPercentage = (totalMarks / 400.0) * 100;

            if (totalPercentage>=90){
                System.out.println("Your percentage is :"+ totalPercentage+"A+");
            }
            else if (totalPercentage<90 & totalPercentage>70) {
                System.out.println("Your percentage is :"+totalPercentage+"A");

            }
            else if (totalPercentage<70 & totalPercentage>50){
                System.out.println("Your percentage is :"+ totalPercentage+"B+");

            } else if (totalPercentage<50) {
                System.out.println("you are fail");

            }

        }

}
