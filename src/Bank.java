import java.io.Serializable;
import java.util.List;

public class Bank implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String name;
    private List<Account> accounts;
    private List<Customer> customers;
    private List<Employee> employees;

    public Bank(String name, List<Account> accounts, List<Customer> customers, List<Employee> employees) {
        this.name = name;
        this.accounts = accounts;
        this.customers = customers;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
    public List<Customer> getCustomers() {
        return customers;
    }
    public List<Employee> getEmployees() {
        return employees;
    }

    public void printAccounts() {
        System.out.println("+------------+----------------------+-----------------+------------+--------+");
        System.out.println("| Account No | Customer             | Banker          | Balance    | Rate % |");
        System.out.println("+------------+----------------------+-----------------+------------+--------+");
        for (Account account : accounts) {
            System.out.printf("| %-10s | %-20s | %-15s | %10.2f | %-6.2f |\n",
                    account.getAccountNumber(),
                    account.getAccountHolder().getName(),
                    account.getAccountManager().getName(),
                    account.getInterestRate());
        }
        System.out.println("+------------+----------------------+-----------------+------------+--------+");
    }
}
