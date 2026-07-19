import java.util.Scanner;

public class AccountDemo {
    private int balance = 10000;
    private Scanner in = new Scanner(System.in);

    public AccountDemo(int balance) {
        this.balance = balance;
    }

    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        int with = in.nextInt();
        if (with < 0) {
            System.out.println("Wrong amount!");
        } else {
            balance -= with;
            System.out.println("Withdraw successfully!");
        }
    }

    public void deposit() {
        System.out.print("Enter amount for deposit: ");
        int dept = in.nextInt();
        if (dept < 0) {
            System.out.println("Wrong amount!");
        } else {
            balance += dept;
            System.out.println("Deposit successfully!");
        }
    }

    public void display() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void main(String[] args) {
        AccountDemo s1 = new AccountDemo(5000);
        s1.deposit();
        s1.withdraw();
        s1.display();
    }
}
