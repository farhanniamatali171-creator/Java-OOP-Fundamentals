class SavingAccount extends Bank_Account {
    public SavingAccount(int accountID, double balance) {
        super(accountID, balance);
    }

    void amountWithdraw(double amount) {
        if ((balance - amount) >= 10000) {
            balance -= amount;
            System.out.println("Withdraw Successfully!");
        } else {
            System.out.println("Withdraw not possible");
        }
    }

    void amountDeposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfully!");
        } else {
            System.out.println("Invalid amount!");
        }
    }
}
