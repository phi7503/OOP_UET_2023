public class Account {
    protected int balance;
    protected int transactions;

    public Account(int initialBalance) throws InvalidAmountException {
        if (initialBalance <= 0) {
            throw new InvalidAmountException("Số tiền ban đầu phải lớn hơn 0");
        }
        this.balance = initialBalance;
        this.transactions = 0;
    }

    public boolean deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Số tiền gửi phải lớn hơn 0");
        }
        balance += amount;
        transactions++;
        return true;
    }

    public boolean withdraw(int amount) throws InvalidAmountException, OverWithdrawException {
        if (amount <= 0) {
            throw new InvalidAmountException("Số tiền rút phải lớn hơn 0");
        }

        if (amount > balance) {
            throw new OverWithdrawException("Rút tiền quá số dư hiện tại");
        }

        balance -= amount;
        transactions++;
        return true;
    }

    public void endMonth() {
        int fee = endMonthCharge();
        balance -= fee;
        System.out.println("Số dư hiện tại: " + balance);
        System.out.println("Số giao dịch trong tháng: " + transactions);
        System.out.println("Phí cuối tháng: " + fee);
        transactions = 0; // Đặt lại số giao dịch về 0
    }

    public int endMonthCharge() {
        // Mỗi loại tài khoản sẽ cài đặt phương thức này theo quy tắc của mình
        return 0;
    }
}