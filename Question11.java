package lab_sheet_4;

// Demonstrate multilevel inheritance: Person -> Employee -> Manager.
// Sample output:
// Name: Sara
// Employee ID: 305
// Team: Pharmacy Operations
class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class StaffEmployee extends Person {
    protected int employeeId;

    StaffEmployee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends StaffEmployee {
    private String team;

    Manager(String name, int employeeId, String team) {
        super(name, employeeId);
        this.team = team;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team: " + team);
    }
}

public class Question11 {
    public static void main(String[] args) {
        Manager manager = new Manager("Sara", 305, "Pharmacy Operations");
        manager.displayManager();
    }
}