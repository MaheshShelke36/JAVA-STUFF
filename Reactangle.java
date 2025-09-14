import java.util.Scanner;
public class Reactangle {
    public static void main (String ar[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of rectangle");
        double length=sc.nextDouble();

        System.out.println("Enter the breadth of rectangle");
        double breadth=sc.nextDouble();

        double area=length*breadth;

        System.out.println("Area of rectangle is : "+ area);
 }
 
}