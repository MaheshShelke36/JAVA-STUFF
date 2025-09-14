import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Square {
    public static void main(String args[]) throws IOException{

InputStreamReader dis=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(dis);

    System.out.println("Enter a Number");
    int number=Integer.parseInt(br.readLine());

    int square = number * number;
    int cube = number * number * number;

    System.out.println("Square : "+ square);
    System.out.println("Cube : "+ cube);
}
}