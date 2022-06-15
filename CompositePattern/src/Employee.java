import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name, dept;
    private int salary;
    private List<Employee> employeeList;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        employeeList = new ArrayList<Employee>();
    }

    public void add(Employee employee){
        employeeList.add(employee);
    }
    public void remove(Employee employee){
        employeeList.remove(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public String toString(){
        return ("Employee : [ "+name+", Designation: "+dept+", Salary: "+salary+" ]");
    }
}
