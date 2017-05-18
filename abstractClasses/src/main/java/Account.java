/**
 * Created by rahmirford on 5/15/17.
 */
public abstract class Account {
    private double balance;
    private double lastDeposit;
    private double lastWithdrawal;


    public Account(){}

    public abstract double getBalance();

    public abstract double getLastDeposit();

    public abstract double getLastWithdrawal();

    public abstract double makeDeposit();

    public abstract double makeWithdrawal();




}
