import java.io.Serializable;

public class TransactionRecord implements Serializable {
    int account;
    double balance;
    
    public TransactionRecord () { this(0, 0); }
    public TransactionRecord( int tempAcc, double bal ) {
        account = tempAcc;
        balance = bal;
    }
}