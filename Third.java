import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Third {
    public static void main(String ar[])throws IOException{

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("enter first number");
        int a=Integer.parseInt(br.readLine());

        System.out.println("enter second number");
        int b=Integer.parseInt(br.readLine());

        System.out.println("enter third number");
        int c= Integer.parseInt(br.readLine());

        int largest=a;

        if(b>a){
            largest = b;
        }
        else if(c>a){
            largest=c;
        }
System.out.println("this number is largest number in given : "+ largest);

    }
    
}
