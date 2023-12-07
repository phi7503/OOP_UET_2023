package exercise;

public class Exercise5 {

    public static void main(String[] args) {

        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("Tổng các số từ 1 đến 10 là: " + sum);
    }
}
