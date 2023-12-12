package javaapplication9;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double unitPrice;

    // Hàm khởi tạo
    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setUnitPrice(unitPrice);
    }

    // Hàm set và get cho partNumber
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    // Hàm set và get cho partDescription
    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Hàm set và get cho quantity
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    // Hàm set và get cho unitPrice
    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0.0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0.0;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Phương thức tính tiền hóa đơn
    public double getInvoiceAmount() {
        return quantity * unitPrice;
    }
}
