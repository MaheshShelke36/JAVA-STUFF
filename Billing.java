import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Billing {
    public static void main(String ar[]) throws IOException{
         InputStreamReader isr=new InputStreamReader(System.in);
         BufferedReader br= new BufferedReader(isr);

         System.out.println("Enter the bill amount");
         int amount= Integer.parseInt(br.readLine());
         int disamount=amount;
         if(amount>2000){
            disamount =amount - 300;
            System.out.println("Discount coupon was valid form 2000rs payment");
            System.out.println("hey customer! \nyou want pay rupees With discount is : " + disamount);
         System.out.println("without discount : "+ amount);
         }else{
              System.out.println("Discount coupon was invalid");
         System.out.println("your payment was done. your payment amount is :" + amount);
            }
    
        }

}
