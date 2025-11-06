import java.io.Serializable;
import java.util.List;

public class Customer extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private List Accounts;

    public Customer(String name, String socialSecurityNumber) {
        super(name, socialSecurityNumber);
    }

    public List getAccounts() {
        return Accounts;
    }

    public void setAccounts(List accounts) {
        Accounts = accounts;
    }
    public void addAccount(Account account){
        Accounts.add(account);
    }
}
