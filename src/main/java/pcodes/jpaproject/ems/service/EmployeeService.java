package pcodes.jpaproject.ems.service;

import org.springframework.stereotype.Service;
import pcodes.jpaproject.ems.entity.Employee;
import pcodes.jpaproject.ems.model.EmployeeAddRequest;
import pcodes.jpaproject.ems.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Create employee
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Get employees by department
    public List<Employee> getEmployeesByDepartment(String department) {
        return repository.findByDepartmentIgnoreCase(department);
    }

    // Update employee
    public Employee updateEmployee(EmployeeAddRequest request, Long id) {

        Employee dbEmployee = repository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Employee not found with id: " + id));

        if (request.getFullName() != null) {
            dbEmployee.setFullName(request.getFullName());
        }

        if (request.getEmail() != null) {
            dbEmployee.setEmail(request.getEmail());
        }

        if (request.getDepartment() != null) {
            dbEmployee.setDepartment(request.getDepartment());
        }

        if (request.getSalary() != null) {
            dbEmployee.setSalary(request.getSalary());
        }

        return repository.save(dbEmployee);
    }

    // Delete employee by ID
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    // Delete all employees
    public void deleteAllEmployees() {
        repository.deleteAll();
    }
}