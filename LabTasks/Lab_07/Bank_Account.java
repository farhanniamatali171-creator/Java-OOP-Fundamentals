class Bank_Account {
    protected int accountID;
    protected double balance;

    public Bank_Account() {
        this.accountID = 0;
        this.balance = 0.0;
    }

    public Bank_Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    void balanceInquiry() {
        System.out.println("Balance is: " + balance);
    }
}
