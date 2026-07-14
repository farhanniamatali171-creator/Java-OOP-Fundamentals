import java.util.Scanner;

class Account {
    private int balance = 10000;
    int amount;
    Scanner input = new Scanner(System.in);

    public Account() {
        // Keeps default balance of 10000
    }

    public Account(int balance, int amount) {
        this.balance = balance;
        this.amount = amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void Withdraw() {
        System.out.println("");
        System.out.print("Enter amount for Withdraw: ");
        int with = input.nextInt();
        
        if (with > balance) {
            System.out.println("Not enough balance! ");
        } else if (with < 0) {
            System.out.println("Invalid withdraw amount!");
        } else {
            balance -= with;
            System.out.println("Withdraw Successfully!");
            System.out.println("Remaining amount is : " + balance);
        }
    }

    public void Deposit() {
        System.out.println("");
        System.out.print("Enter amount for Deposit: ");
        int dep = input.nextInt();
        balance += dep;
        System.out.println("Deposit Successfully!");
        System.out.println("Current balance is : " + balance);
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account t1 = new Account();
        
        System.out.println("Account 1 (Default constructor):");
        t1.Withdraw();
        t1.Deposit();
    }
}
