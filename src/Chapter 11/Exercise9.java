// Định nghĩa lớp ExceptionA là lớp con của Exception
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

// Định nghĩa lớp ExceptionB là lớp con của ExceptionA
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Ném các loại ngoại lệ khác nhau
            throw new ExceptionA("Đây là ExceptionA");
        } catch (Exception exception) {
            System.out.println("Bắt ngoại lệ chung: " + exception.getMessage());
        }

        try {
            throw new ExceptionB("Đây là ExceptionB");
        } catch (Exception exception) {
            System.out.println("Bắt ngoại lệ chung: " + exception.getMessage());
        }

        try {
            // NullPointerException là một lớp con của Exception, sẽ được bắt cùng một cách
            throw new NullPointerException("Đây là NullPointerException");
        } catch (Exception exception) {
            System.out.println("Bắt ngoại lệ chung: " + exception.getMessage());
        }

        try {
            // IOException cũng là một lớp con của Exception, sẽ được bắt cùng một cách
            throw new java.io.IOException("Đây là IOException");
        } catch (Exception exception) {
            System.out.println("Bắt ngoại lệ chung: " + exception.getMessage());
        }
    }
}