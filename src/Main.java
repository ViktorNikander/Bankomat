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
            bank = bankService.restoreMockupData();
        }

        List<Account> accounts = bank.getAccounts();
        List<Customer> customers = bank.getCustomers();
        List<Employee> employees = bank.getEmployees();

        bank.printAccounts();
        bank.printCustomers();
        bank.printEmployees();

        CustormerOrAdminPanel startPanel = new CustormerOrAdminPanel();


    }



    public static void main(String[] args) {
        new Main();
    }
}
