import java.util.Scanner; 
public class factorial {  
    public static void main(String[] args) {  
          
        Scanner fact=new Scanner(System.in);

        System.out.println("enter any number");
        int number=fact.nextInt();  
          
        int factorial = 1;  
          
        
        for (int i = 1; i <= number; i++) {  
              
            factorial *= i;   
        }  
        
        System.out.println("Factorial of " + number + " is: " + factorial);  
    }  
}  