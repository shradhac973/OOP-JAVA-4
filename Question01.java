package lab_sheet_4;

// Store and display a student's name and roll number.
// Sample output:
// Name: Maya Patel
// Roll number: 102
class StudentRecord {
    private String name;
    private int rollNumber;

    StudentRecord(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
    }
}

public class Question01 {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Maya Patel", 102);
        student.display();
    }
}