import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts =  new ArrayList<Account>();
    private List<Customer> customers = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Bank(List<Account> accounts, List<Customer> customers, List<Employee> employees) {
        this.accounts = accounts;
        this.customers = customers;
        this.employees = employees;
    }
}
