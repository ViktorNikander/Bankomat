import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer customerTest = new Customer("Test", "123");
    Employee employeeTest = new Employee("Test", "123", 35000, false);
    CheckingAccount checkingAccountTest = new CheckingAccount(10000, 3, customerTest, employeeTest);

    @Test
    void withdrawal() {
    }

    @Test
    void deniedWithdrawal() {
    }

    @Test
    void deposit() {
    }
}