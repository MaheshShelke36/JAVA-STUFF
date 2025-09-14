import java.util.Scanner;

public class weeks {
    public static void main(String[] args) {
        Scanner days= new Scanner(System.in);

System.out.println("this is weeks calendar of march month 2025");

        System.out.println("choose the numbers (1-7):");
        int b = days.nextInt();

        switch (b) {
            case 1:System.out.println("monday");break;
                case 2: System.out.println("tuesday");break;
                case 3:System.out.println("wed");break;
                case 4: System.out.println("thursday");break;
                case 5: System.out.println("friday");break;
                case 6:System.out.println("saturday");break;
                case 7:System.out.println("sunday");break;
        
            default:System.out.println("this number is invalid");
                break;
        }
        }
    }

