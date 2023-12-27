class ParentException extends Exception {
    public ParentException(String message) {
        super(message);
    }
}

class ChildException extends ParentException {
    public ChildException(String message) {
        super(message);
    }
}

public class ExceptionOrderExample {
    public static void main(String[] args) {
        try {
           
            throw new ChildException("Đây là ngoại lệ lớp con");
        } catch (ParentException parentException) {
            System.out.println("Bắt ngoại lệ lớp cha: " + parentException.getMessage());
        } catch (ChildException childException) {
            System.out.println("Bắt ngoại lệ lớp con: " + childException.getMessage());
        }
    }
}