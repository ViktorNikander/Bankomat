import java.util.List;

public class Customer extends Person{
    private List Accounts;

    public Customer(String name, String socialSecurityNumber, List accounts) {
        super(name, socialSecurityNumber);
        Accounts = accounts;
    }

    public List getAccounts() {
        return Accounts;
    }

    public void setAccounts(List accounts) {
        Accounts = accounts;
    }
}
