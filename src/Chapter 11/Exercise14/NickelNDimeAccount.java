public class NickelNDime extends Account {
    private int withdrawalFee;

    public NickelNDime(int initialBalance, int withdrawalFee) throws InvalidAmountException {
        super(initialBalance);
        if (withdrawalFee <= 0) {
            throw new InvalidAmountException("Phí rút tiền phải lớn hơn 0");
        }
        this.withdrawalFee = withdrawalFee;
    }

    @Override
    public int endMonthCharge() {
        // Phí hàng tháng của NickelNDime được tính dựa vào số lần rút tiền
        return transactions * withdrawalFee;
    }
}
