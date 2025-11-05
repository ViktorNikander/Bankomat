public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Viktor", "123");
        Employee employee1 = new Employee("Viktor", "123", 1, true);
        CreditAccount creditAccount1 = new CreditAccount(10, 0, customer1, employee1, 10);
        CheckingAccount checkingAccount1 = new CheckingAccount(20, 0, customer1, employee1);
    }
}
