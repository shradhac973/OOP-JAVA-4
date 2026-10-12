package lab_sheet_4;

// Initialize medicine data with a parameterized constructor.
// Sample output:
// Medicine: Cough Syrup
// Price: 85.5
// Quantity: 12
class MedicineItem {
    private String name;
    private double price;
    private int quantity;

    MedicineItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Medicine: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class Question02 {
    public static void main(String[] args) {
        MedicineItem medicine = new MedicineItem("Cough Syrup", 85.5, 12);
        medicine.display();
    }
}