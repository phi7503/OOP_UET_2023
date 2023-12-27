
class SomeException extends Exception {

    public SomeException(String message) {
        super(message);
    }
}

class MyClass {

    public MyClass() throws SomeException {

        try {

            throw new SomeException("Sự cố xảy ra trong hàm khởi tạo");
        } catch (SomeException ex) {

            System.out.println("Bắt ngoại lệ trong hàm khởi tạo: " + ex.getMessage());
            throw ex;
        }
    }
}

public class ExceptionInConstructorDemo {

    public static void main(String[] args) {
        try {

            MyClass myObject = new MyClass();
        } catch (SomeException ex) {
            System.out.println("Bắt ngoại lệ ở nơi gọi constructor: " + ex.getMessage());
        }
    }
}
