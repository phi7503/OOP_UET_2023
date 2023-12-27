public class NormalAccount extends Account {
    public NormalAccount(int initialBalance) throws InvalidAmountException {
        super(initialBalance);
    }

    @Override
    public int endMonthCharge() {
        // Phí hàng tháng của NormalAccount là 10,000 đồng
        return 10000;
    }
}
