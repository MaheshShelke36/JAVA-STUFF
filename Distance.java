import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.IOException;
public class Distance{
    public static void main(String[] args) throws IOException {

        double rad,area,cir;

        DataInputStream s1=new DataInputStream(System.in);

        System.out.println("Enter the radius value");
        rad=Double.parseDouble(s1.readLine());

        area=3.14*rad*rad;
        cir=2*3.14*rad;

        System.out.println("Area of the circle is " + area);
        System.out.println("Circumference of the circle is " + cir);
        
    }
    
}
