import java.io.Serializable;

public class AccountRecord implements Serializable {
    int account;
    String fName;
    String lName;
    double balance;

    AccountRecord() { this(0, " ", " ", 0); }
    AccountRecord(int act, String f, String l, double bal) {
        account = act;
        fName = f;
        lName  = l;
        balance = bal;
    }
    
    AccountRecord combine(TransactionRecord tr ) {
        return new AccountRecord( account, fName, lName, balance + tr.balance );
    }
}