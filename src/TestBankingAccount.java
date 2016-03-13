/**
 * Created by ronald on 13-3-2016.
 */
public class TestBankingAccount {
    public static void main(String args[]) {
        BankingAccount acc = new BankingAccount(12345);

        System.out.println("Banking account:\n\t" + acc.getNumber() + "\n\t" + acc.getBalance());
        acc.setBalance(acc.getBalance()+ 50.0);
        System.out.println("Banking account:\n\t" + acc.getNumber() + "\n\t" + acc.getBalance());
    }
}
