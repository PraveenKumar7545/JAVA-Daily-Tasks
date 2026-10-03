class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Invalid Withdrawal");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}

public class Q05_Bank_Account_Encapsulation {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.displayBalance();

        account.deposit(2000);
        account.displayBalance();

        account.withdraw(1000);
        account.displayBalance();
    }
}