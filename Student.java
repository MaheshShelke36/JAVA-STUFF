class Student {

    //Globle Veriables
    String firstName = "Mahesh";
    String lastName = "Shelke";
    int rollNumber = 111;
    int idNumber = 9421;
    String dob = "27th Oct 2005";
    char division = 65;
    long mobileNumber = 9878676789L;
    String adderess = "At. post- Mahalgaon, Tq.Vaijapr, Dist- Ch. Sambhaji Nagar";
    boolean isTodayPresent = true;

    //This method return student full name
    private String getFullName() {
        return firstName + " " + lastName;
    }

    //THis method print full name of student
    void printFullName() {
        System.out.println(getFullName());
    }

    //This method print full details of students
    void printfulldetail(){
        System.out.println("Name:- "+getFullName());
        System.out.println("Roll Number:- "+rollNumber);
        System.out.println("ID number:- "+idNumber);
        System.out.println("Date of Birth:- "+dob);
        System.out.println("Division:- "+division);
        System.out.println("Address:- "+adderess);
        System.out.println("Mobile number:- "+mobileNumber);
        System.out.println("Attendance:- "+isTodayPresent);
        
    }

}