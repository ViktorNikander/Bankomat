import Accounts.CheckingAccount;
import Accounts.CreditAccount;
import GUI.CustormerOrAdminPanel;
import Person.Customer;
import Person.Employee;

public class Main {

        Main(){
            CustormerOrAdminPanel startPanel = new CustormerOrAdminPanel();
        }

    public static void main(String[] args) {
        Customer customer1 = new Customer("Viktor", "123");
        Employee employee1 = new Employee("Viktor", "123", 1, true);
        Employee testEmployee = new Employee("admin", "admin", 10, true);
        CreditAccount creditAccount1 = new CreditAccount(10, 0, customer1, employee1, 10);
        CheckingAccount checkingAccount1 = new CheckingAccount(20, 0, customer1, employee1);
        Customer customerTest = new Customer("Test", "123");
        Employee employeeTest = new Employee("Test", "123", 35000, false);
        CreditAccount creditAccountTest = new CreditAccount(10000, 3, customerTest, employeeTest, 10000);
        creditAccountTest.withdrawal(5000);

        Main main = new Main();
    }
}
