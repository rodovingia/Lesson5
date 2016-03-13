/**
 * Created by ronald on 13-3-2016.
 */
public class BankingAccount {
    private int number;
    private double balance;

    // example demo: change private to public to make the program run
    public BankingAccount(int number) {
        this.number = number;
        this.balance = 0.0;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
