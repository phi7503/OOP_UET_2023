
public class ExceptionHandlingOutsideMethod {

    public static void main(String[] args) {
        try {

            someMethod();
        } catch (RuntimeException ex) {

            System.out.println("Bắt ngoại lệ ở nơi khác: " + ex.getMessage());
        }
    }

    public static void someMethod() {
        try {

            int result = 10 / 0;
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException ex) {

            System.out.println("Bắt ngoại lệ trong phương thức: " + ex.getMessage());
            throw ex;
        }
    }
}
