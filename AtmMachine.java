import java.util.Scanner;

public class AtmMachine {

    void startAtmMachine() {

        System.out.println("STATE BANK OF INDIA");

        System.out.println("------Welcome to SBI AMT Machine-------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your card number");
        String cardNumber = scanner.nextLine();

        System.out.println("Enter amount");
        int amount = scanner.nextInt();

        System.out.println("Enter you Pin");
        int pin = scanner.nextInt();

        System.out.println(generateMessage(amount, cardNumber, pin));

        System.out.println("Collect your cash\n\nThank you! for banking with us.");
        scanner.close();
    }

    private String generateMessage(int amount, String cardNumber, int pin) {
        return "\nAmount (RS." + amount + ") withdraw successfully from card no " + cardNumber + " by using Pin " + pin;
    }

}
