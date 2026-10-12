package lab_sheet_4;

// Keep medicine-product fields private; the product displays its own data.
// Sample output:
// Product: Allergy Relief
// Manufacturer: Northstar Labs
// Price: 120.0
class MedicineProduct {
    private String name;
    private String manufacturer;
    private double price;

    MedicineProduct(String name, String manufacturer, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
    }
}

public class Question06 {
    public static void main(String[] args) {
        MedicineProduct product = new MedicineProduct("Allergy Relief", "Northstar Labs", 120.0);
        product.displayDetails();
    }
}