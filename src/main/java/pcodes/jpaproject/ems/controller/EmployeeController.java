package pcodes.jpaproject.ems.controller;

import org.springframework.web.bind.annotation.*;
import pcodes.jpaproject.ems.entity.Employee;
import pcodes.jpaproject.ems.model.EmployeeAddRequest;
import pcodes.jpaproject.ems.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Create employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Get all employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Get employees by department
    @GetMapping("/dept/{department}")
    public List<Employee> getEmployeesByDepartment(
            @PathVariable String department) {

        return employeeService.getEmployeesByDepartment(department);
    }

    // Update employee
    @PutMapping("/update/{id}")
    public Employee updateEmployee(
            @RequestBody EmployeeAddRequest request,
            @PathVariable Long id) {

        return employeeService.updateEmployee(request, id);
    }

    // Delete employee by ID
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return "Employee deleted successfully";
    }

    // Delete ALL employees
    @GetMapping("/delete/all")
    public String deleteAllEmployees() {

        employeeService.deleteAllEmployees();

        return "All employees deleted successfully";
    }
}