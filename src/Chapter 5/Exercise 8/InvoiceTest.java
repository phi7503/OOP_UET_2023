package javaapplication9;

public class InvoiceTest {
    public static void main(String[] args) {
        // Tạo đối tượng Invoice
        Invoice invoice = new Invoice("12345", "Laptop", 2, 1200.50);

        // In ra thông tin hóa đơn
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Unit Price: $" + invoice.getUnitPrice());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
    }
}
