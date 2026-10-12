package lab_sheet_4;

// Keep the medicine-stock array and its display loop inside Inventory.
// Sample output:
// Paracetamol: 20
// Vitamin C: 15
// Antacid: 8
class MedicineStock {
    private String medicineName;
    private int quantity;

    MedicineStock(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(medicineName + ": " + quantity);
    }
}

class Inventory {
    private MedicineStock[] stock;

    Inventory() {
        stock = new MedicineStock[] {
            new MedicineStock("Paracetamol", 20),
            new MedicineStock("Vitamin C", 15),
            new MedicineStock("Antacid", 8)
        };
    }

    void displayStock() {
        for (MedicineStock medicine : stock) {
            medicine.display();
        }
    }
}

public class Question04 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.displayStock();
    }
}