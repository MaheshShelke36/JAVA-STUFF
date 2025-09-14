import java.io.IOException;
import java.io.DataInputStream;

class average {
  public static void main(String ar[]) throws IOException {
    int m1, m2, m3, m4, m5, total;
    double avg;

    DataInputStream dis = new DataInputStream(System.in);
    System.out.println("enter mark out of 50 for 5 subject : ");

    System.out.println("Enter Maths Marks");
    m1 = Integer.parseInt(dis.readLine());

    System.out.println("Enter English marks");
    m2 = Integer.parseInt(dis.readLine());

    System.out.println("Enter Chemistry marks");
    m3 = Integer.parseInt(dis.readLine());

    System.out.println("Enter Electronics marks");
    m4 = Integer.parseInt(dis.readLine());

    System.out.println("Enter computer Science marks");
    m5 = Integer.parseInt(dis.readLine());

    total = m1 + m2 + m3 + m4 + m5;
    System.out.println("Total mark out of 250 is : " + total);

    avg = total / 5.0;
    System.out.println("Average Marks of five subject is : " + avg);

  }

}
