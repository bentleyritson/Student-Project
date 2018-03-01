/**
 * Created by ptshaka on 2017/07/04.
 */
public class Account {
    private double balance;  //The current balance
    private int accountNumber;  //The account number
    public Account() {
        balance =0.0;
    }
    public Account(double balance, int accountNumber)
    {
       this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double sum)
    {
        if (sum>0)
            balance+=sum;
        else
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }
    public void withdraw(double sum)
    {
        if (sum>balance) {
            System.err.println("Account.withdraw(...): " + "cannot withdraw such amount.");
        }
        else {
            balance = balance - sum;
            System.out.println("Withdrawal amount : " + sum);
            System.out.println("Available amount : " + balance);
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public double getAccountNumber()
    {
        return accountNumber;
    }
    public String toString()
    {
        return "Account number " + accountNumber + ": " + "Balance = " + balance;
    }
    public final void print()
    {
        System.out.println( toString() );
    }
}
