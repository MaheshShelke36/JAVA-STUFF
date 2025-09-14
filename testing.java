import java.lang.Object;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        System.out.println("welcome to the digital calculator");
        Scanner ppt = new Scanner(System.in);
        int a = ppt.nextInt();
        int b = ppt.nextInt();
        int sum = ppt.nextInt();

        switch (sum) {
            case 1:System.out.println(a+b);
                  break;
                  case 2:System.out.println(a-b);
                  break;
                  case 3:System.out.println(a*b);
        
            default:System.out.println("this is invalid statement");
                break;
        }

        /*if (a >= b) {
            System.out.println("this value is true");
        } else {
            System.out.println("this value is false");
        }*/
    }
}