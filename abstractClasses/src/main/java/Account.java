/**
 * Created by rahmirford on 5/15/17.
 */
public abstract class Account {
    private double balance;
    private double lastDeposit;
    private double lastWithdrawal;

    public abstract double getBalance();
    public abstract double getLastDeposit();
    public abstract double getLastWithdrawal();
    public abstract void makeDeposit();
    public abstract void makeWithdrawal();


}
