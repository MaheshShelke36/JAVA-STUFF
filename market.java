import java.util.Scanner;
public class market {

public static void main(String[] args) {
Scanner products= new Scanner(System.in);
    
    String[]name=new String[5];
    int[]id=new int[5];

    for(int i=1; i<=4;i++){
        
        System.out.println("Enter your name :");
        name[i]=products.nextLine();

        System.out.println("enter id no :");
        id[i]=products.nextInt();

        products.nextLine();

        System.out.println();
    }

   System.out.println("**** All products details ****");
   for(int i=1;i<=4;i++){
       System.out.println("customers" + (i+1) + " : Name = " + name[i] + ": ID NO =" +id[i]);
    }
}
}

