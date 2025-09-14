import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Javacollection {
    public static void main(String[] args) {
        arrayListTest();
    }

    static void arrayTest() {
        println("Array program start here");

        String cars[] = new String[5];
        cars[0] = "tata";
        cars[1] = "suzuki";
        cars[2] = "nexon";
        cars[3] = "brezza";
        cars[4] = "alto";

        cars[0] = "mahesh";

        for (String car : cars) {
            println("i item is " + car);
        }

        println("Array program end here");
    }

    static void vectorTest() {

        println("Vector program start here");

        Vector<String> cars = new Vector<>();
        cars.add("car");
        cars.add("bikes");
        cars.add("tv");

        for (String car : cars) {
            println("vector is " + car);
        }

        println("Vector program end here");
    }

    static void arrayListTest() {

        // Creating new array list
        List<String> arrayList = new ArrayList<>();

        // Adding an items
        arrayList.add("Mahesh");
        arrayList.add("Pooja");

        println("\n\nArray Size is " + arrayList.size());

        // Printing array items
        for (int index = 0; index < arrayList.size(); index++) {
            println("Item of array " + arrayList.get(index) + " of index " + index);
        }

        // Adding new item in list
        arrayList.add("Nilesh");

        System.out.println("\n\nNew updated array after adding Nilesh");

        for (int index = 0; index < arrayList.size(); index++) {
            println("Item of array " + arrayList.get(index) + " of index " + index);
        }

        // Creating new array list
        List<String> newArrayList = new ArrayList<>();
        newArrayList.add("Abc");
        newArrayList.add("Xyz");

        // Adding new array list into old array list
        arrayList.addAll(newArrayList);

        System.out.println("\n\nNew updated array after add all");

        for (int index = 0; index < arrayList.size(); index++) {
            println("Item of array " + arrayList.get(index) + " of index " + index);
        }

        // Checking is perticular item present or not in array list
        String wantToSearch = "Pooja";

        if (arrayList.contains(wantToSearch)) {
            println(wantToSearch + " presented");
        } else {
            println(wantToSearch + " not presented");
        }

        /*
         * Boolean isItemPresent = false;
         * for (int index = 0; index < arrayList.size(); index++) {
         * 
         * String item = arrayList.get(index);
         * 
         * if (wantToSearch.equals(item)) {
         * isItemPresent = true;
         * println("Is " + wantToSearch + " are present at index " + index);
         * }
         * }
         * 
         * if (!isItemPresent) {
         * println("Given item is not found");
         * }
         */

    }

    static void println(String message) {
        System.out.println(message);
    }
}
