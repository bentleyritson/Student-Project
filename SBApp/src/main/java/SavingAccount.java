public class SavingAccount extends Account {



    private double interest;
    private int accountnumber;
    private double balance;

    public SavingstAccount(){

    }

    public SavingstAccount(double balance, int accountNumber, double interest ){
        this.interest;
        this.balance;
        this.accountnumber;
        System.out.println("Balances before Transaction");
        System.out.println("Acc. No : " + this.accountNumber +" Acc Bal. : " + this.balance + "\n");

    }


    public double getInterest() {
        return interest;
    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }




    public void setInterest(double interest) {
        this.interest = interest;
    }




}
