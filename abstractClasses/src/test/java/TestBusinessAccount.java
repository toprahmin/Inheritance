import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rahmirford on 5/15/17.
 */
public class TestBusinessAccount {
    BusinessAccount businessAccount;

    @Before
    public void setUp() {

        businessAccount = new BusinessAccount();
    }

    @Test
    public void getBalanceTest(){
        //: Given
        double currentBalance = 58.92;
        double expectedBalance = currentBalance;
        //: When
        double actualBalance = businessAccount.getBalance();
        //: Then
        Assert.assertEquals("The expected balance is 58.92", expectedBalance,actualBalance,0);

    }

    @Test
    public void getLastDepositTest(){
        //: Given
        double lastDeposit = 82.15;
        double expectedLastDeposit = lastDeposit;
        //: When
        double actualLastDeposit = businessAccount.getLastDeposit();
        //: Then
        Assert.assertEquals("The expected last deposit is 82.15", expectedLastDeposit,actualLastDeposit, 0);
    }

    @Test
    public void getLastWithdrawalTest(){
        //: Given
        double lastWithdrawal = 100.00;
        double expectedLastWithdrawal = lastWithdrawal;
        //: When
        double actualLastWithdrawal = businessAccount.getLastWithdrawal();
        //: Then
        Assert.assertEquals("The expected last withdrawal is 100.00", expectedLastWithdrawal, actualLastWithdrawal, 0);
    }

    @Test
    public void makeDepositTest(){
        //: Given
        double depositAmount = 75.00;
        double expectedDepositAmount = depositAmount;
        //: When
        double actualDeposit = businessAccount.makeDeposit();
        //: Then
        Assert.assertEquals("The expected deposit amount is $75.00", expectedDepositAmount, actualDeposit,0);
    }

    @Test
    public void makeWithdrawalTest(){
        //: Given
        double withdrawalAmount = 66.93;
        double expectedWithdrawalAmount = withdrawalAmount;
        //: When
        double actualWithdrawalAmount = businessAccount.makeWithdrawal();
        //: Then
        Assert.assertEquals("The expected value of your withdrawal should be.", expectedWithdrawalAmount,actualWithdrawalAmount,0);
    }


}
