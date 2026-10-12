package lab_sheet_4;

// Classify a patient inside a Patient method using if-else.
// This example classifies a patient as an adult or a minor.
// Sample output: Maya is an adult patient.
class Patient {
    private String name;
    private int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void classify() {
        if (age >= 18) {
            System.out.println(name + " is an adult patient.");
        } else {
            System.out.println(name + " is a minor patient.");
        }
    }
}

public class Question05 {
    public static void main(String[] args) {
        Patient patient = new Patient("Maya", 24);
        patient.classify();
    }
}