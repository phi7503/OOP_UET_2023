public class NickelNDimeAccount extends Account {

    @Override
    public int endMonthCharge() {
        return transactions * 2000;
    }
}