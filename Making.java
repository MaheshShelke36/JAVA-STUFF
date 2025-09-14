import java.util.Scanner;

public class Making {

    public static void main(String[] args) {
        int a = 700;
        System.out.println("welcome to the SBI Bank");

        System.out.println("note:- minimum amount required in your amount is 500");

        Scanner s1 = new Scanner(System.in);

        System.out.println("select option from below ");

        System.out.println("1.check balance 2.withdraw 3.net banking ");
        int option = s1.nextInt();

        switch (option) {
            case 1:System.out.println("enter your pin");
            int pin=s1.nextInt();

            if(pin==9421){
            System.out.println("your pin is correct");

            System.out.println(" your balance is available is " + a);

            }else{

            System.out.println("your pin is wrong"); break;}

            case 2:
            System.out.println("Enter your pin");
            int code=s1.nextInt();

            if(code==9421){
                System.out.println("welcome to the withdrawal field");

                System.out.println("enter your amount");
                int amount = s1.nextInt();

                if (amount <= 500)
                    System.out.println("you can't able to withdraw money from atm because of bank rules.\n As per bank rule customer need to 500 amount in his amount");
            }else{
                System.out.println("your pin is wrong");
            }
            break;
            case 3:
                System.out.println("because of the some technical issue we can't do any net banking");
                break;
            default:
                break;
        }
    }
}
