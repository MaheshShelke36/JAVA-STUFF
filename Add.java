import java.io.DataInputStream;
import java.io.IOException;

public class Add {
    public static void main(String args[]) throws IOException {

    int a,b,sum;
         DataInputStream addition=new DataInputStream(System.in);

         System.out.println("enter first number");
         a=Integer.parseInt(addition.readLine());

         System.out.println("enter second number");
         b=Integer.parseInt(addition.readLine());

         sum=a+b;

         System.out.println("the addition of the two number is " + sum);

    }

}
