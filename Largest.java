import java.io.DataInputStream;
import java.io.IOException;
public class Largest {
     public static void main(String args[]) throws IOException{
        int a,b,c;
        DataInputStream greater=new DataInputStream(System.in);

        System.out.println("Enter first Integar");
        a=Integer.parseInt(greater.readLine());

        System.out.println("Enter second Integar");
        b=Integer.parseInt(greater.readLine());

        if(a>b){
            System.out.println("This is the largest Integar " + a );
        } else if(b>a)
        {
            System.out.println(" This is the largest Integar " + b);
        }else{
            System.out.println("both are equals");
        }

     }
    
}
