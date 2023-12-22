public class AccountExceptionTest {
    public static void main(String[] args) {
        try {
            // Test cases
            NormalAccount normalAccount = new NormalAccount(100);
            normalAccount.deposit(50);
            normalAccount.withdraw(30);
            normalAccount.endMonth();

            NickelNDime nickleNDimeAccount = new NickelNDime(200, 2000);
            nickleNDimeAccount.deposit(100);
            nickleNDimeAccount.withdraw(50);
            nickleNDimeAccount.endMonth();

            Gambler gamblerAccount = new Gambler(200);
            gamblerAccount.deposit(100);
            gamblerAccount.withdraw(30); // Should throw OverWithdrawException
            gamblerAccount.endMonth();
        } catch (InvalidAmountException | OverWithdrawException e) {
            e.printStackTrace();
        }
    }
}
