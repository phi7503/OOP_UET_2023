public abstract class Account {

    protected int balance;
    protected int transactions;

    public Account() {
        balance = 0;
        transactions = 0;
    }

    public Account(int balance) {
        this.balance = balance;
        transactions = 0;
    }

    public abstract int endMonthCharge();

    public boolean deposit(int amount) {
        if (amount < 0) {
            return false;
        }

        balance += amount;
        transactions++;
        return true;
    }

    public boolean withdraw(int amount) {
        if (amount < 0) {
            return false;
        }

        if (balance < amount) {
            return false;
        }

        balance -= amount;
        transactions++;
        return true;
    }

    public void endMonth() {
        int fee = endMonthCharge();
        balance -= fee;
        System.out.println("Tài khoản " + getClass().getSimpleName() + ":");
        System.out.println("Số dư: " + balance);
        System.out.println("Số giao dịch: " + transactions);
        System.out.println("Phí: " + fee);
        transactions = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}