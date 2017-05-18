import java.util.Scanner;

/**
 * Created by rahmirford on 5/15/17.
 */
public class BusinessAccount extends Account {
        private double balance;
        private double lastDeposit;
        private double lastWithdrawal;

        Scanner scanner = new Scanner(System.in);

        public double getBalance(){
            return balance;
        }

        public double getLastDeposit(){
            return lastDeposit;
        }

        public double getLastWithdrawal(){
            return lastWithdrawal;
        }

        private double analyzeDepositAmount(double deposit){
            if ()
        }

        public double makeDeposit(){
            System.out.println("How much would you like to deposit?");
            double newDeposit = scanner.nextDouble();


            return 9;
        }

        public double makeWithdrawal(){

            return 9;
        }

}
