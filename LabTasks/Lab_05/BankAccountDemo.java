import java.util.Scanner;

class BankAccount {
    private String name;
    private double balance;
    private static final int TRANSACTION_LIMIT = 100;
    private double[] transactionAmount;
    private int count;

    public BankAccount(String name) {
        this.name = name;
        this.balance = 500;
        this.transactionAmount = new double[TRANSACTION_LIMIT];
        this.count = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactionAmount = new double[TRANSACTION_LIMIT];
        this.count = 0;
    }

    public void printBalance() {
        System.out.println(name + "'s balance: " + balance);
    }

    public void deposit(double amount) {
        if (count >= TRANSACTION_LIMIT) {
            System.out.println("Transaction limit reached! Cannot deposit.");
            return;
        }
        balance += amount;
        transactionAmount[count] = -amount; // Storing deposits as negative convention matching your log check
        count++;
        System.out.println("Successfully deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (count >= TRANSACTION_LIMIT) {
            System.out.println("Transaction limit reached! Cannot withdraw.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            transactionAmount[count] = amount;
            count++;
            System.out.println("Successfully withdrawn. New balance: " + balance);
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public double computeTransactionBalance() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += transactionAmount[i];
        }
        return total;
    }

    public void printCreditTransactions() {
        System.out.println("=== Credit Transactions ===");
        for (int i = 0; i < count; i++) {
            if (transactionAmount[i] < 0) {
                System.out.println(-transactionAmount[i]);
            }
        }
    }

    @Override
    public String toString() {
        return name + " has " + balance + " Rs. (Transactions count: " + count + ")";
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        BankAccount account = new BankAccount(name);
        
        int choice;
        do {
            System.out.print("\nEnter Choice:\n +1 for deposit\n -1 for withdraw\n  0 to exit\nYour choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amt = sc.nextDouble();
                account.deposit(amt);
            } else if (choice == -1) {
                System.out.print("Enter amount to withdraw: ");
                double amt = sc.nextDouble();
                account.withdraw(amt);
            } else if (choice != 0) {
                System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        System.out.println("\n" + account.toString());
        double transactionBalance = account.computeTransactionBalance();
        System.out.println("Transaction balance: " + transactionBalance);
        System.out.println("\nCredit Transactions:");
        account.printCreditTransactions();

        sc.close();
    }
}
