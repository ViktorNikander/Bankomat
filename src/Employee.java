import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private int salary;
    private boolean administrator;

    public Employee(String name, String socialSecurityNumber, int salary, boolean administrator) {
        super(name, socialSecurityNumber);
        this.salary = salary;
        this.administrator = administrator;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
}
