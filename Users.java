import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Users {
    public static void main(String ar[]) throws IOException {
        // int num;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter n value");
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i<=num; i++) {
            System.out.println(i);
        }
    }
}
