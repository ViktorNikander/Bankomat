import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    Customer customerTest = new Customer("Test", "123");
    Employee employeeTest = new Employee("Test", "123", 35000, false);
    CreditAccount creditAccountTest = new CreditAccount(10000, 10000,2,customerTest, employeeTest, 10000);

    @Test
    void withdrawal() {
        double expected = 5000;
        creditAccountTest.withdrawal(5000);
        double actual = creditAccountTest.getBalance();
        assertEquals(expected, actual);

        expected = -5000;
        creditAccountTest.withdrawal(10000);
        actual = creditAccountTest.getBalance();
        assertEquals(expected, actual);

        creditAccountTest.withdrawal(1000000000);
        actual = creditAccountTest.getBalance();
        assertEquals(expected, actual);
    }
}