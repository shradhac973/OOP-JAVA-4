package lab_sheet_4;

// Demonstrate single inheritance: Pharmacist inherits from Employee.
// Sample output:
// Employee: Ravi
// Employee ID: 204
// Pharmacist license: PH-778
class Employee {
    protected String name;
    protected int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        System.out.println("Employee: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Pharmacist extends Employee {
    private String licenseNumber;

    Pharmacist(String name, int employeeId, String licenseNumber) {
        super(name, employeeId);
        this.licenseNumber = licenseNumber;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Pharmacist license: " + licenseNumber);
    }
}

public class Question09 {
    public static void main(String[] args) {
        Pharmacist pharmacist = new Pharmacist("Ravi", 204, "PH-778");
        pharmacist.displayPharmacist();
    }
}