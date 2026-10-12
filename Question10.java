package lab_sheet_4;

// Demonstrate hierarchical inheritance with Doctor and HospitalPharmacist.
// Sample output:
// Staff member: Leena
// Doctor specialty: Pediatrics
// Staff member: Omar
// Pharmacist license: RX-42
class HospitalEmployee {
    protected String name;

    HospitalEmployee(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Staff member: " + name);
    }
}

class Doctor extends HospitalEmployee {
    private String specialty;

    Doctor(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    void displayDoctor() {
        displayName();
        System.out.println("Doctor specialty: " + specialty);
    }
}

class HospitalPharmacist extends HospitalEmployee {
    private String licenseNumber;

    HospitalPharmacist(String name, String licenseNumber) {
        super(name);
        this.licenseNumber = licenseNumber;
    }

    void displayPharmacist() {
        displayName();
        System.out.println("Pharmacist license: " + licenseNumber);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Leena", "Pediatrics");
        HospitalPharmacist pharmacist = new HospitalPharmacist("Omar", "RX-42");
        doctor.displayDoctor();
        pharmacist.displayPharmacist();
    }
}