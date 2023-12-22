package javaapplication9;

import java.util.Random;

public class Dice {
    private int currentState; // Mặt ngửa của lần gieo gần nhất

    public Dice() {
        // Khởi tạo đối tượng Dice với một trạng thái ngẫu nhiên ban đầu
        roll();
    }

    public int getCurrentState() {
        return currentState;
    }

    public int roll() {
        // Sử dụng thư viện Math để sinh số ngẫu nhiên từ 1 đến 6
        Random random = new Random();
        currentState = random.nextInt(6) + 1;

        return currentState;
    }

    public static void main(String[] args) {
        // Kiểm tra lớp Dice
        Dice myDice = new Dice();
        System.out.println("Initial state: " + myDice.getCurrentState());

        int result = myDice.roll();
        System.out.println("After rolling, current state: " + result);
    }
}

