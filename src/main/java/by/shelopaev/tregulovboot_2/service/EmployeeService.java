package by.shelopaev.tregulovboot_2.service;

import by.shelopaev.tregulovboot_2.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();

    Employee getEmployeeById(int id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(int id);

    List<Employee> findAllByName(String name);

}
