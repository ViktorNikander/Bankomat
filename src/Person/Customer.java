package Person;

import java.util.List;
import Accounts.*;

public class Customer extends Person{
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
