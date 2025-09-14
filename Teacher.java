public class Teacher {

    String firstName = "pooja";
    String lastName = "lipane";
    int serialNumber = 123;
    char division = 'a';
    long mobileNumber = 9421417270L;
    String address = "papde wasti, Pune";
    Boolean isTodatPresent = false;

    private String getFullName() {
        return firstName + "" + lastName;
    }

    void printFullName() {
        System.out.println(getFullName());
    }

    void printfulldetail() {
        System.out.println("name:-" + getFullName());
        System.out.println("serialNumber:- " + serialNumber);
        System.out.println("MobileNumber:- " + mobileNumber);
        System.out.println("Division:- " + division);
        System.out.println("Address:- " + address);
        System.out.println("Attendance:- " + isTodatPresent);
    }
}