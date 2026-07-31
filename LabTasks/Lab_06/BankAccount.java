class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    static String bankName = "HBL";
    final double minBalance = 500;

    BankAccount() {
        accountHolder = "";
        accountNumber = 0;
        balance = 0;
    }

    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    double getBalance() {
        return balance;
    }

    static void changeBankName(String name) {
        bankName = name;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Farhan", 111, 5000);
        BankAccount a2 = new BankAccount("Ali", 222, 3000);

        a1.deposit(1000);
        a2.deposit(500);
        
        System.out.println("Balance 1: " + a1.getBalance());
        System.out.println("Balance 2: " + a2.getBalance());
        
        if (a1.withdraw(2000))
            System.out.println("A1 withdrawal successful");
        else
            System.out.println("A1 withdrawal failed");

        if (a2.withdraw(2500))
            System.out.println("A2 withdrawal successful");
        else
            System.out.println("A2 withdrawal failed");
            
        System.out.println("Balance A1: " + a1.getBalance());
        System.out.println("Balance A2: " + a2.getBalance());
        
        BankAccount.changeBankName("Meezan Bank");
        System.out.println("New Bank Name: " + BankAccount.bankName);
    }
}
