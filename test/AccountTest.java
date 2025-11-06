import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer customerTest = new Customer("Test", "123");
    Employee employeeTest = new Employee("Test", "123", 35000, false);
    CheckingAccount checkingAccountTest = new CheckingAccount(12312,10000, 3, customerTest, employeeTest);

    @Test
    void withdrawal() {
        //TODO add test if needed
    }

    @Test
    void deniedWithdrawalTest() {
        String expected = "Withdrawal denied due to insufficient funds";
        String actual = checkingAccountTest.deniedWithdrawal();
        assertEquals(expected, actual);
    }

    @Test
    void deposit() {
        //TODO add test if needed
    }
}