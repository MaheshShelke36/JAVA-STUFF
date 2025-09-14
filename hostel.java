import java.util.Scanner;

public class hostel {
    public static void main(String[] args) {

        System.out.println("welcome to the Military Boys hostel");

        Scanner boys = new Scanner(System.in);
        //this code is made for mbh hostel

        System.out.println("enter your Student name");
        String studentName = boys.nextLine();

        System.out.println("Enter your Mobile number");
        Long mobileNumber = boys.nextLong();

        System.out.println("fill the details ");

        System.out.println("Percentage of the last year");
        int marksheet = boys.nextInt();

        if (marksheet >= 75) {
            System.out.println("your addmission in hostel is successfully");

            System.out.println("select your room number");
            int room = boys.nextInt();

            Scanner admission = new Scanner(System.in);

            System.out.println("choice class: 1-first,2-second,3-third");
            int year = admission.nextInt();

            switch (year) {
                case 1:
                    System.out.println("welcome to the first year of the hostel addmission");
                    System.out.println("you are the new student in the hostel");
                    break;

                case 2:
                    System.out.println("welcome the secound year of the hostel");
                    break;

                case 3:
                    System.out.println("welcome to the third year of hostel residence");
                    System.out.println("you are now the seniors in the hostel");
                    break;

                default:
                    System.out.println("sorry for hostel take student till third year of the hostel admission");
                    break;
            }
        } else {
            System.out.println("your admission failed due to marks memo criteria");

            System.out.println("u can't able to take any room");

        }
        System.out.println("Thanks to visit");

        System.out.println("For more infomartion contact ramdas patil SIR:-988764452");

    }
}

/* Scanner admission=new Scanner(System.in); */
