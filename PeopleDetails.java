import java.util.Scanner;

public class PeopleDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store 10 names and ages
        String[] names = new String[10];
        int[] ages = new int[10];

        // Input for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name: ");
            names[i] = scanner.nextLine();

            System.out.print("Age: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline left-over

            System.out.println();
        }

        // Display all details in sequence
        System.out.println("----- All Person Details -----");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ": Name = " + names[i] + ", Age = " + ages[i]);
        }

        scanner.close();
    }
}
