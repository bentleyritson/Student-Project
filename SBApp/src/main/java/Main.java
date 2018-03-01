public class Main {



    public static void main(String[] args) {

       CurrentAccount Client1 = new CurrentAccount ();
       CurrentAccount Client2 = new CurrentAccount(500,2520);
       Client2.withdraw(600);
 //      Client1.deposit(5000);
    }

}
