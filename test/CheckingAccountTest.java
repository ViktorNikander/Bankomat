import Accounts.CheckingAccount;
import Person.Customer;
import Person.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    Customer customerTest = new Customer("Test", "123");
    Employee employeeTest = new Employee("Test", "123", 35000, false);
    CheckingAccount checkingAccountTest = new CheckingAccount(10000, 3, customerTest, employeeTest);

    @Test
    void withdrawal() {
        double expected = 5000;
        checkingAccountTest.withdrawal(5000);
        double actual = checkingAccountTest.getBalance();
        assertEquals(expected, actual);

        checkingAccountTest.withdrawal(10000);
        actual = checkingAccountTest.getBalance();
        assertEquals(expected, actual);

        checkingAccountTest.withdrawal(5000);
        expected = 0;
        actual = checkingAccountTest.getBalance();
        assertEquals(expected, actual);
    }
}