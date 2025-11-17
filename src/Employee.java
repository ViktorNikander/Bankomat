import java.util.ArrayList;

public class Employee extends Person{
    private int salary;
    private boolean administrator;
    private static final ArrayList<Employee> employees = new ArrayList<Employee>();

    public Employee(String name, String socialSecurityNumber, int salary, boolean administrator) {
        super(name, socialSecurityNumber);
        this.salary = salary;
        this.administrator = administrator;
        employees.add(this);
    }

    public Employee findEmployeeBasedOnSocialSecurityNumber(String socialSecurityNumber){
        for(Employee e: employees){
            if(e.getSocialSecurityNumber().equals(socialSecurityNumber)){
                return e;
            }
        }
        return null;
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
