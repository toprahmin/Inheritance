/**
 * Created by rahmirford on 5/15/17.
 */
public class CheckingAccount extends Account{
    private double balance;
    private double lastDeposit;
    private double lastWithdrawal;

    public double getBalance(){
        return balance;
    };

    public double getLastDeposit(){
        return lastDeposit;
    };

    public double getLastWithdrawal(){
        return lastWithdrawal;
    };

    public double makeDeposit(){
        return 9;
    }
    public double makeWithdrawal(){
        return 9;
    };

}
