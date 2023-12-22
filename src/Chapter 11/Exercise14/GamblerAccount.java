public class Gambler extends Account {
    public Gambler(int initialBalance) throws InvalidAmountException {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(int amount) throws InvalidAmountException, OverWithdrawException {
        // Riêng tài khoản loại Gambler không được rút quá ½ số tiền hiện có
        if (amount > balance / 2) {
            throw new OverWithdrawException("Không được rút quá ½ số tiền hiện có");
        }
        return super.withdraw(amount);
    }

    @Override
    public int endMonthCharge() {
        // Tài khoản Gambler không tính phí cuối tháng
        return 0;
    }
}
