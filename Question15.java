package lab_sheet_4;

// A small pharmacy application combining static data, encapsulation, and inheritance.
// Sample output:
// Pharmacy: Green Cross Pharmacy
// Employee: Ravi
// Employee ID: 204
// Pharmacist license: PH-778
// Product: Allergy Relief
// Manufacturer: Northstar Labs
// Price: 120.0
// Total bill: 175.0
class PharmacySystem {
    void run() {
        Pharmacist pharmacist = new Pharmacist("Ravi", 204, "PH-778");
        MedicineProduct product = new MedicineProduct("Allergy Relief", "Northstar Labs", 120.0);
        PatientBill bill = new PatientBill();

        System.out.println("Pharmacy: " + Pharmacy.name);
        pharmacist.displayPharmacist();
        product.displayDetails();
        bill.setConsultationFee(55.0);
        bill.setMedicineFee(120.0);
        bill.displayTotal();
    }
}

public class Question15 {
    public static void main(String[] args) {
        PharmacySystem system = new PharmacySystem();
        system.run();
    }
}