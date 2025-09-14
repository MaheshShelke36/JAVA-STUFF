import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("welcome to the calculator");
        
        Scanner maths = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        int a = maths.nextInt();

        System.out.println("choose operation: 1-Add, 2-Subtract,3-multiply,4-Divider");
        int choice = maths.nextInt();

         System.out.println("enter your 2nd number");
        int b = maths.nextInt();

        switch (choice) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("invaild divison");
                } else {
                    System.out.println(a / b);
                }
                break;

            default:
                System.out.println("invalid sum");

        }

    }

}
