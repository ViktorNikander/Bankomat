public class Employee extends Person{
    private int salary;

    public Employee(String name, String socialSecurityNumber, int salary) {
        super(name, socialSecurityNumber);
        this.salary = salary;
    }
}
