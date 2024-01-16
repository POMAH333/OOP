package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;

public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;
    public EmployeeService() {
        employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }
    @Override
    public void create(String name, int age) {
        Employee emp = new Employee(name, age, "разнорабочий");
        count++;
        employees.add(emp);
    }

    public void sortByFIO()
    {
        PersonComparator<Employee> emCom = new PersonComparator<>();
        employees.sort(emCom);
    }
}
