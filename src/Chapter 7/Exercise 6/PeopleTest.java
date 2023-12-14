
public class PeopleTest {

    public static void main(String[] args) {

        NormalAccount normalAccount = new NormalAccount();
        NickelNDimeAccount nickelNDimeAccount = new NickelNDimeAccount();
        GamblerAccount gamblerAccount = new GamblerAccount();

        normalAccount.deposit(100000);
        nickelNDimeAccount.deposit(100000);
        gamblerAccount.deposit(100000);

        normalAccount.withdraw(50000);
        nickelNDimeAccount.withdraw(50000);
        gamblerAccount.withdraw(50000);

        normalAccount.endMonth();
        nickelNDimeAccount.endMonth();
        gamblerAccount.endMonth();
    }
}
