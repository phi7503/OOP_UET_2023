package exercise;

public class Exercise4 {

    public static void main(String[] args) {
        // a) Dùng một lệnh để gán tổng của x và y cho z và tăng x thêm 1 sau phép tính trên.
        int x = 5;
        int y = 10;
        int z = x + y;
        x++;

        // b) Kiểm tra xem giá trị biến count có lớn hơn 10 hay không, nếu có thì in ra dòng text "Count is greater than 10".
        int count = 15;
        if (count > 10) {
            System.out.println("Count is greater than 10");
        }

        // c) Giảm x đi 1 đơn vị, sau đó gán cho biến total giá trị là hiệu của total và x. Chỉ dùng một lệnh.
        int total = 20;
        total -= --x;

        // d) Tính phần dư của phép chia q cho d rồi gán kết quả đó cho q.
        int q = 30;
        int d = 7;
        q %= d;

        // e) Khai báo các biến sum và x thuộc kiểu int.
        int sum, variableX;

        // f) Cộng dồn giá trị của x vào biến sum
        sum = 0;
        sum += x;

        // g) In ra dòng "The sum is ", tiếp theo là giá trị của biến sum.
        System.out.println("The sum is " + sum);

        // h) Tính tổng các số chẵn trong khoảng từ 1 đến 99
        int evenSum = 0;
        for (int i = 2; i <= 99; i += 2) {
            evenSum += i;
        }

        // i) Sử dụng vòng lặp để in ra các số từ 1 đến 10 trên một dòng, dùng kí tự tab ('\t') để ngăn cách giữa các số.
        System.out.print("Numbers from 1 to 10: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }
    }

}
