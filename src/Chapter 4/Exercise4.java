
package javaapplication9;


public class CommandLineArguments {
    public static void main(String[] args) {
        // Kiểm tra xem có tham số nào được truyền vào không
        if (args.length == 0) {
            System.out.println("Không có tham số dòng lệnh.");
        } else {
            System.out.println("Các tham số dòng lệnh:");
            
            // In ra tất cả các tham số dòng lệnh
            for (int i = 0; i < args.length; i++) {
                System.out.println("Tham số " + (i + 1) + ": " + args[i]);
            }
        }
    }
}