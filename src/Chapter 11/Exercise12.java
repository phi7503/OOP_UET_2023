
class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }
}

public class ExceptionPropagationDemo {

    public static void someMethod() throws MyException {
        try {
            someMethod2();
        } catch (MyException ex) {
            System.out.println("someMethod() bắt và ném tiếp ngoại lệ: " + ex.getMessage());
            throw ex;
        }
    }

    public static void someMethod2() throws MyException {

        throw new MyException("Ngoại lệ từ someMethod2()");
    }

    public static void main(String[] args) {
        try {

            someMethod();
        } catch (MyException ex) {
            System.out.println("Bắt ngoại lệ ở phương thức main: " + ex.getMessage());
            ex.printStackTrace(); // In thông tin stack trace
        }
    }
}
