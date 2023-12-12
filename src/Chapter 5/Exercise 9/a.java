package javaapplication9;

class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy(); // Sửa lỗi: tên class là XCopy, không phải xCopy
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    // Sửa lỗi: phương thức go cần được đặt static vì nó được gọi từ phương thức main
    static int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}