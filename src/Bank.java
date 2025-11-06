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
                    account.getBalance(),
                    account.getInterestRate());
        }
        System.out.println("+------------+----------------------+-----------------+------------+--------+");
    }

    public void printCustomers() {
        System.out.println("+----------------------+------------------------+");
        System.out.println("| Name                 | Social Security Number |");
        System.out.println("+----------------------+------------------------+");
        for (Customer customer : customers) {
            System.out.printf("| %-20s | %-22s |%n", customer.getName(), customer.getSocialSecurityNumber());
        }
        System.out.println("+----------------------+------------------------+");


    }

    public void printEmployees() {
        System.out.println("+----------------------+------------------------+------------+---------------+");
        System.out.println("| Name                 | Social Security Number | Salary     | Administrator |");
        System.out.println("+----------------------+------------------------+------------+---------------+");
        for (Employee employee : employees) {
            System.out.printf(
                    "| %-20s | %-22s | %10d | %-13s |%n",
                    employee.getName(),
                    employee.getSocialSecurityNumber(),
                    employee.getSalary(),
                    employee.isAdministrator() ? "Yes" : "No"
            );
        }
        System.out.println("+----------------------+------------------------+------------+---------------+");
    }
}
