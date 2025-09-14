import java.util.Scanner;
public class Bholder {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the account holder number");
        long num=sc.nextLong();

        System.out.println("Enter the balance you have in your account");
        double bal=sc.nextDouble();

        System.out.println("Enter the account holder name");
        String name=sc.nextLine();

        System.out.println(" your account number is : " + num);
        System.out.println("your present balnce is : " + bal);
        System.out.println("Account holder name is : "+ name);
    }
}
