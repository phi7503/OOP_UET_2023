package exercise;

public class Exercise7 {

    public static void main(String[] args) {

        int sum = 0;
        int number = 1;

        do {
            sum += number;
            number++;
        } while (number <= 10);

        System.out.println("Tổng các số từ 1 đến 10 là: " + sum);
    }

}
