public class GamblerAccount extends Account {

    @Override
    public int endMonthCharge() {
        // 51% probability that the withdrawal fee is equal to the exact amount withdrawn
        // 49% probability of successful free transaction
        int fee = 0;
        int random = (int) (Math.random() * 100);
        if (random < 51) {
            fee = (int) (Math.random() * 100000);
        }
        return fee;
    }
}