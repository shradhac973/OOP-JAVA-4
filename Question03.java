package lab_sheet_4;

// Demonstrate that static pharmacy details are shared by every Pharmacy object.
// Sample output:
// Green Cross Pharmacy, Main Street
// Green Cross Pharmacy, Main Street
class Pharmacy {
    static String name = "Green Cross Pharmacy";
    static String location = "Main Street";

    void displayDetails() {
        System.out.println(name + ", " + location);
    }
}

public class Question03 {
    public static void main(String[] args) {
        Pharmacy firstPharmacy = new Pharmacy();
        Pharmacy secondPharmacy = new Pharmacy();

        firstPharmacy.displayDetails();
        secondPharmacy.displayDetails();
    }
}