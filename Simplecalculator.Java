import java.util,scanner;
public class Simplecalculator{

    public static void Main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1=scanner.nextdoubling();

        System.out.println("Enter second number");
        double num2=scanner.nextdoubling();

        System.out.println("Enter your operator(+,-,*,/):");
        char operator=scanner.next().charAt(0);

        double result;

        switch(operator){
            case'+':
            result=num1+num2;
            System.out.println("Result:"+ result);
            break;

            case'-':
            result=num1-num2;
            System.out.println("Result:" - result);
            break;

            case'*':
            result=num1*num2;
            System.out.println("Result:" * result);
            break;

            case'/':
            if(num2!=0){
                result=num1/num2;
                System.out.println("Result:" + result);
            }else{
                System.out.println("Error: Division by zero");
            }
            break;
            default:
            System.out.println("invalid operator");
        }
        scanner.close();

    }
}