public class ArraySum {
    // Phương thức generic tính tổng các phần tử của mảng
    public static <T extends Number> double sumArray(T[] array) {
        double sum = 0.0;
        for (T element : array) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Sử dụng phương thức sumArray với mảng số nguyên
        Integer[] intArray = {1, 2, 3, 4, 5};
        double intSum = sumArray(intArray);
        System.out.println("Sum of integers: " + intSum);

        // Sử dụng phương thức sumArray với mảng số thực
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        double doubleSum = sumArray(doubleArray);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
