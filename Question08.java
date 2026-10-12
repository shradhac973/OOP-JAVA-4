package lab_sheet_4;

// Store private patient fees, set them with setters, and calculate the total in the class.
// Sample output:
// Total bill: 175.0
class PatientBill {
    private double consultationFee;
    private double medicineFee;

    void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        }
    }

    void setMedicineFee(double medicineFee) {
        if (medicineFee >= 0) {
            this.medicineFee = medicineFee;
        }
    }

    double calculateTotal() {
        return consultationFee + medicineFee;
    }

    void displayTotal() {
        System.out.println("Total bill: " + calculateTotal());
    }
}

public class Question08 {
    public static void main(String[] args) {
        PatientBill bill = new PatientBill();
        bill.setConsultationFee(100.0);
        bill.setMedicineFee(75.0);
        bill.displayTotal();
    }
}