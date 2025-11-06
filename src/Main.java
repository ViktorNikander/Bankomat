import GUI.CustormerOrAdminPanel;

import java.util.ArrayList;
import java.util.List;

public class Main {
    BankService bankService = new BankService();
    Bank bank;

    public Main() {
        try {
            bank = bankService.deserialize();
        } catch (Exception e) {
            restoreMockupData();
        }

        List<Account> accounts = bank.getAccounts();
        List<Customer> customers = bank.getCustomers();
        List<Employee> employees = bank.getEmployees();

        bank.printAccounts();
        bank.printCustomers();
        bank.printEmployees();

        CustormerOrAdminPanel startPanel = new CustormerOrAdminPanel();


    }

    public void restoreMockupData(){
                Customer customer1 = new Customer("Viktor", "123");
        Employee employee1 = new Employee("Viktor", "123", 1, true);
        CreditAccount creditAccount1 = new CreditAccount(12313,10, 0, customer1, employee1, 10);
        CheckingAccount checkingAccount1 = new CheckingAccount(345344,20, 0, customer1, employee1);
        Customer customerTest = new Customer("Test", "123");
        Employee employeeTest = new Employee("Test", "123", 35000, false);
        CreditAccount creditAccountTest = new CreditAccount(756732,10000, 3, customerTest, employeeTest, 10000);
        creditAccountTest.withdrawal(5000);

        List<Account> accounts = new ArrayList<>();
        accounts.add(creditAccount1);
        accounts.add(checkingAccount1);
        accounts.add(creditAccountTest);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customerTest);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employeeTest);

        Bank b = new Bank("BankomatBanken",accounts,customers,employees);
        bankService.serialize(b);
    }

    public static void main(String[] args) {
        new Main();
    }
}
