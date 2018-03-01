public class CurrentAccount extends Account {

    private double overdraft = 5000;
    private int accountNumber;
    private double balance;
    private double withdrawtemp;
    private double tempbalance;





    public CurrentAccount(){
        }

    public CurrentAccount(double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
        System.out.println("Before Transaction");
        System.out.println("Acc. No : " + this.accountNumber +" Acc Bal. : " + this.balance + "\n");
    }

    @Override
    public double getBalance() {
        return balance;
    }


    @Override
    public void deposit(double sum) {
        if (sum>0)
            balance+=sum;
        else
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");

    }

    @Override
    public void withdraw(double sum) {

        if (sum <= balance) {
            tempbalance = balance - sum;
            balance = tempbalance;
            System.out.println("After Transaction");
            System.out.println("Acc Bal. : " + this.balance);
            System.out.println("Account withdrawn = R" + sum );

        }
        else{
            withdrawtemp = balance - sum;



            if (withdrawtemp < overdraft) {
                withdrawtemp = balance + withdrawtemp;
                tempbalance = withdrawtemp - balance;
                balance = 0;
                overdraft = overdraft + tempbalance;

                System.out.println("After Transaction");
                System.out.println("Acc Bal. : " + this.balance);
                System.out.println("Account balance = R" + this.balance);
                System.out.println("Amount in overdraft = R " + this.tempbalance);
                System.out.println("Account withdrawn = R" + sum);
                System.out.println("Total Credit Available = R" + overdraft);


                }

            else {
                System.err.println("Account.withdraw(...): " + "cannot withdraw such a amount.");
                }
            }
        }

}
