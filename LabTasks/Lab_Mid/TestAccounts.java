public class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected static int totalAccount;
    protected final double MIN_BALANCE = 1000;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccount++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    public double deposit(double amount, String note) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successfully");
        }
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number :" + accountNumber);
        System.out.println("Account Holder Name :" + accountHolderName);
        System.out.println("Account Balance :" + balance);
    }
}

class SavingAccount extends BankAccount {
    protected double interestRate;

    public SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest : 2500.0");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("-----Saving Account----");
        super.displayAccountDetails();
        calculateInterest();
        System.out.println("--------------------");
    }
}

class CurrentAccount extends BankAccount {
    protected double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("---Current Account----");
        super.displayAccountDetails();
        System.out.println("OverDraft Limit is:" + overdraftLimit);
        System.out.println("--------------------");
    }
}

public class TestAccounts {
    public static void main(String[] args) {
        BankAccount[] bankaccounts = new BankAccount[2];
        bankaccounts[0] = new SavingAccount(123345, "Ali", 5000, 5.0);
        bankaccounts[1] = new CurrentAccount(566779, "Raza", 5000, 10000);

        for (BankAccount b : bankaccounts) {
            b.displayAccountDetails();
            System.out.println();
        }

        System.out.println("Total Accounts: " + BankAccount.totalAccount);
        System.out.println("Minimum Balance Policy: 10000.0");
    }
}
